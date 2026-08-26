package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.PopupNotificationActivity;

public final class PopupAudioView extends BaseCell implements SeekBar.SeekBarDelegate, DownloadController.FileDownloadProgressListener {
    public final int TAG;
    public int buttonPressed;
    public int buttonState;
    public int buttonX;
    public int buttonY;
    public int currentAccount;
    public MessageObject currentMessageObject;
    public final ProgressView progressView;
    public final SeekBar seekBar;
    public int seekBarX;
    public int seekBarY;
    public StaticLayout timeLayout;
    public final TextPaint timePaint;
    public int timeWidth;
    public int timeX;
    public boolean wasLayout;

    public PopupAudioView(PopupNotificationActivity popupNotificationActivity) {
        super(popupNotificationActivity);
        this.wasLayout = false;
        this.buttonState = 0;
        this.buttonPressed = 0;
        this.timeWidth = 0;
        TextPaint textPaint = new TextPaint(1);
        this.timePaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.TAG = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        SeekBar seekBar = new SeekBar(this);
        this.seekBar = seekBar;
        seekBar.delegate = this;
        this.progressView = new ProgressView();
    }

    public final MessageObject getMessageObject() {
        return this.currentMessageObject;
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        int measuredHeight;
        if (this.currentMessageObject == null) {
            return;
        }
        if (!this.wasLayout) {
            requestLayout();
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int i2 = point.y;
        int i3 = point.x;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            int measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            i = measuredWidth;
        } else {
            i = i3;
            measuredHeight = i2;
        }
        Theme.chat_msgInMediaDrawable.setTop((int) getY(), i, measuredHeight, measuredHeight, 0, 0, false, false);
        BaseCell.setDrawableBounds(Theme.chat_msgInMediaDrawable, 0, 0, getMeasuredWidth(), getMeasuredHeight());
        Theme.chat_msgInMediaDrawable.draw(canvas);
        if (this.currentMessageObject == null) {
            return;
        }
        canvas.save();
        int i4 = this.buttonState;
        if (i4 == 0 || i4 == 1) {
            canvas.translate(this.seekBarX, this.seekBarY);
            this.seekBar.draw(canvas);
        } else {
            canvas.translate(AndroidUtilities.dp(12.0f) + this.seekBarX, this.seekBarY);
            ProgressView progressView = this.progressView;
            float f = progressView.height / 2;
            float f2 = progressView.progressHeight / 2.0f;
            canvas.drawRect(0.0f, f - f2, progressView.width, f2 + f, progressView.innerPaint);
            float f3 = progressView.height / 2;
            canvas.drawRect(0.0f, f3 - f2, progressView.currentProgress * progressView.width, f2 + f3, progressView.outerPaint);
        }
        canvas.restore();
        int i5 = this.buttonState;
        this.timePaint.setColor(-6182221);
        Drawable drawable = Theme.chat_fileStatesDrawable[i5][this.buttonPressed];
        int iDp = AndroidUtilities.dp(36.0f);
        BaseCell.setDrawableBounds(drawable, ((iDp - drawable.getIntrinsicWidth()) / 2) + this.buttonX, ((iDp - drawable.getIntrinsicHeight()) / 2) + this.buttonY, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        canvas.save();
        canvas.translate(this.timeX, AndroidUtilities.dp(18.0f));
        this.timeLayout.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onFailedDownload(String str, boolean z) {
        updateButtonState$1();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.currentMessageObject == null) {
            return;
        }
        this.seekBarX = AndroidUtilities.dp(54.0f);
        this.buttonX = AndroidUtilities.dp(10.0f);
        this.timeX = (getMeasuredWidth() - this.timeWidth) - AndroidUtilities.dp(16.0f);
        this.seekBar.setSize((getMeasuredWidth() - AndroidUtilities.dp(70.0f)) - this.timeWidth, AndroidUtilities.dp(30.0f));
        int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(94.0f)) - this.timeWidth;
        ProgressView progressView = this.progressView;
        progressView.width = measuredWidth;
        progressView.height = AndroidUtilities.dp(30.0f);
        this.seekBarY = AndroidUtilities.dp(13.0f);
        this.buttonY = AndroidUtilities.dp(10.0f);
        updateProgress$1();
        if (z || !this.wasLayout) {
            this.wasLayout = true;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(56.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j, long j2) {
        this.progressView.setProgress(Math.min(1.0f, j / j2));
        if (this.buttonState != 3) {
            updateButtonState$1();
        }
        invalidate();
    }

    @Override
    public final void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public final void onSeekBarContinuousDrag(float f) {
    }

    @Override
    public final void onSeekBarDrag(float f) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f;
        MediaController.getInstance().seekToProgress(this.currentMessageObject, f);
    }

    @Override
    public final void onSuccessDownload(String str) {
        updateButtonState$1();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean zOnTouch = this.seekBar.onTouch(motionEvent.getX() - this.seekBarX, motionEvent.getY() - this.seekBarY, motionEvent.getAction());
        if (zOnTouch) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            invalidate();
            return zOnTouch;
        }
        int iDp = AndroidUtilities.dp(36.0f);
        if (motionEvent.getAction() == 0) {
            int i = this.buttonX;
            if (x >= i && x <= i + iDp) {
                int i2 = this.buttonY;
                if (y >= i2 && y <= i2 + iDp) {
                    this.buttonPressed = 1;
                    invalidate();
                    zOnTouch = true;
                }
            }
        } else if (this.buttonPressed == 1) {
            if (motionEvent.getAction() == 1) {
                this.buttonPressed = 0;
                playSoundEffect(0);
                int i3 = this.buttonState;
                if (i3 == 0) {
                    boolean zPlayMessage = MediaController.getInstance().playMessage(this.currentMessageObject);
                    if (!this.currentMessageObject.isOut() && this.currentMessageObject.isContentUnread() && this.currentMessageObject.messageOwner.peer_id.channel_id == 0) {
                        MessagesController.getInstance(this.currentAccount).markMessageContentAsRead(this.currentMessageObject);
                        this.currentMessageObject.setContentIsRead();
                    }
                    if (zPlayMessage) {
                        this.buttonState = 1;
                        invalidate();
                    }
                } else if (i3 == 1) {
                    if (MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject)) {
                        this.buttonState = 0;
                        invalidate();
                    }
                } else if (i3 == 2) {
                    FileLoader.getInstance(this.currentAccount).loadFile(this.currentMessageObject.getDocument(), this.currentMessageObject, 1, 0);
                    this.buttonState = 4;
                    invalidate();
                } else if (i3 == 3) {
                    FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.currentMessageObject.getDocument());
                    this.buttonState = 2;
                    invalidate();
                }
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.buttonPressed = 0;
                invalidate();
            } else if (motionEvent.getAction() == 2) {
                int i4 = this.buttonX;
                if (x < i4 || x > i4 + iDp) {
                    this.buttonPressed = 0;
                    invalidate();
                } else {
                    int i5 = this.buttonY;
                    if (y < i5 || y > i5 + iDp) {
                        this.buttonPressed = 0;
                        invalidate();
                    }
                }
            }
        }
        return !zOnTouch ? super.onTouchEvent(motionEvent) : zOnTouch;
    }

    public void setMessageObject(MessageObject messageObject) {
        if (this.currentMessageObject != messageObject) {
            this.currentAccount = messageObject.currentAccount;
            SeekBar seekBar = this.seekBar;
            int i = Theme.key_chat_inAudioSeekbar;
            int color = Theme.getColor(null, i, false);
            int color2 = Theme.getColor(null, i, false);
            int i2 = Theme.key_chat_inAudioSeekbarFill;
            seekBar.setColors(color, color2, Theme.getColor(null, i2, false), Theme.getColor(null, i2, false), Theme.getColor(null, Theme.key_chat_inAudioSeekbarSelected, false));
            ProgressView progressView = this.progressView;
            progressView.innerPaint.setColor(-2497813);
            progressView.outerPaint.setColor(-7944712);
            this.currentMessageObject = messageObject;
            this.wasLayout = false;
            requestLayout();
        }
        updateButtonState$1();
    }

    public final void updateButtonState$1() {
        String fileName = this.currentMessageObject.getFileName();
        boolean zExists = FileLoader.getInstance(this.currentAccount).getPathToMessage(this.currentMessageObject.messageOwner).exists();
        ProgressView progressView = this.progressView;
        if (zExists) {
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            boolean zIsPlayingMessage = MediaController.getInstance().isPlayingMessage(this.currentMessageObject);
            if (!zIsPlayingMessage || (zIsPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                this.buttonState = 0;
            } else {
                this.buttonState = 1;
            }
            progressView.setProgress(0.0f);
        } else {
            DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(fileName, this);
            if (FileLoader.getInstance(this.currentAccount).isLoadingFile(fileName)) {
                this.buttonState = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    progressView.setProgress(fileProgress.floatValue());
                } else {
                    progressView.setProgress(0.0f);
                }
            } else {
                this.buttonState = 2;
                progressView.setProgress(0.0f);
            }
        }
        updateProgress$1();
    }

    public final void updateProgress$1() {
        int i;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        SeekBar seekBar = this.seekBar;
        if (!seekBar.pressed) {
            seekBar.setProgress(messageObject.audioProgress);
        }
        if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
            i = this.currentMessageObject.audioProgressSec;
        } else {
            i = 0;
            for (int i2 = 0; i2 < this.currentMessageObject.getDocument().attributes.size(); i2++) {
                TLRPC.DocumentAttribute documentAttribute = this.currentMessageObject.getDocument().attributes.get(i2);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i = (int) documentAttribute.duration;
                    break;
                }
            }
        }
        String longDuration = AndroidUtilities.formatLongDuration(i);
        TextPaint textPaint = this.timePaint;
        this.timeWidth = (int) Math.ceil(textPaint.measureText(longDuration));
        this.timeLayout = new StaticLayout(longDuration, textPaint, this.timeWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }
}
