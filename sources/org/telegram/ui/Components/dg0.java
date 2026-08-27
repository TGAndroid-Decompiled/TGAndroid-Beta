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

public final class dg0 extends org.telegram.ui.Cells.a0 implements ln0, DownloadController.FileDownloadProgressListener {
    public int A;
    public int B;
    public int C;
    public StaticLayout D;
    public int E;
    public int F;
    public int G;

    public boolean f27749f;
    public MessageObject h;

    public int f27750n;

    public TextPaint f27751r;

    public mn0 f27752s;
    public mh0 v;

    public int f27753w;

    public int f27754x;

    public int f27755y;

    @Override
    public final void b(float f10) {
        MessageObject messageObject = this.h;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(this.h, f10);
    }

    public final MessageObject getMessageObject() {
        return this.h;
    }

    @Override
    public int getObserverTag() {
        return this.G;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(this.f27750n).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h == null) {
            return;
        }
        if (!this.f27749f) {
            requestLayout();
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int measuredHeight = point.y;
        int i10 = point.x;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            int measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            i10 = measuredWidth;
        }
        org.telegram.ui.ActionBar.g6.f23281q3.n((int) getY(), i10, measuredHeight);
        org.telegram.ui.ActionBar.d5 d5Var = org.telegram.ui.ActionBar.g6.f23281q3;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        if (d5Var != null) {
            d5Var.setBounds(0, 0, measuredWidth2, measuredHeight2);
        }
        org.telegram.ui.ActionBar.g6.f23281q3.draw(canvas);
        if (this.h == null) {
            return;
        }
        canvas.save();
        int i11 = this.f27755y;
        if (i11 == 0 || i11 == 1) {
            canvas.translate(this.f27753w, this.f27754x);
            this.f27752s.b(canvas);
        } else {
            canvas.translate(AndroidUtilities.dp(12.0f) + this.f27753w, this.f27754x);
            mh0 mh0Var = this.v;
            float f10 = mh0Var.f30689e / 2;
            float f11 = mh0Var.f30690f / 2.0f;
            canvas.drawRect(0.0f, f10 - f11, mh0Var.d, f11 + f10, mh0Var.f30686a);
            float f12 = mh0Var.f30689e / 2;
            canvas.drawRect(0.0f, f12 - f11, mh0Var.f30688c * mh0Var.d, f11 + f12, mh0Var.f30687b);
        }
        canvas.restore();
        int i12 = this.f27755y;
        this.f27751r.setColor(-6182221);
        Drawable drawable = org.telegram.ui.ActionBar.g6.U4[i12][this.C];
        int iDp = AndroidUtilities.dp(36.0f);
        org.telegram.ui.Cells.a0.p(((iDp - drawable.getIntrinsicWidth()) / 2) + this.A, ((iDp - drawable.getIntrinsicHeight()) / 2) + this.B, drawable);
        drawable.draw(canvas);
        canvas.save();
        canvas.translate(this.E, AndroidUtilities.dp(18.0f));
        this.D.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        s();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mh0 mh0Var = this.v;
        if (this.h == null) {
            return;
        }
        this.f27753w = AndroidUtilities.dp(54.0f);
        this.A = AndroidUtilities.dp(10.0f);
        this.E = (getMeasuredWidth() - this.F) - AndroidUtilities.dp(16.0f);
        this.f27752s.j((getMeasuredWidth() - AndroidUtilities.dp(70.0f)) - this.F, AndroidUtilities.dp(30.0f));
        mh0Var.d = (getMeasuredWidth() - AndroidUtilities.dp(94.0f)) - this.F;
        mh0Var.f30689e = AndroidUtilities.dp(30.0f);
        this.f27754x = AndroidUtilities.dp(13.0f);
        this.B = AndroidUtilities.dp(10.0f);
        t();
        if (z10 || !this.f27749f) {
            this.f27749f = true;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.v.a(Math.min(1.0f, j10 / j11));
        if (this.f27755y != 3) {
            s();
        }
        invalidate();
    }

    @Override
    public final void onSuccessDownload(String str) {
        s();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean zF = this.f27752s.f(motionEvent.getX() - this.f27753w, motionEvent.getY() - this.f27754x, motionEvent.getAction());
        if (zF) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            invalidate();
            return zF;
        }
        int iDp = AndroidUtilities.dp(36.0f);
        if (motionEvent.getAction() == 0) {
            int i10 = this.A;
            if (x8 >= i10 && x8 <= i10 + iDp) {
                int i11 = this.B;
                if (y10 >= i11 && y10 <= i11 + iDp) {
                    this.C = 1;
                    invalidate();
                    zF = true;
                }
            }
        } else if (this.C == 1) {
            if (motionEvent.getAction() == 1) {
                this.C = 0;
                playSoundEffect(0);
                int i12 = this.f27755y;
                if (i12 == 0) {
                    boolean zPlayMessage = MediaController.getInstance().playMessage(this.h);
                    if (!this.h.isOut() && this.h.isContentUnread() && this.h.messageOwner.peer_id.channel_id == 0) {
                        MessagesController.getInstance(this.f27750n).markMessageContentAsRead(this.h);
                        this.h.setContentIsRead();
                    }
                    if (zPlayMessage) {
                        this.f27755y = 1;
                        invalidate();
                    }
                } else if (i12 == 1) {
                    if (MediaController.getInstance().lambda$startAudioAgain$7(this.h)) {
                        this.f27755y = 0;
                        invalidate();
                    }
                } else if (i12 == 2) {
                    FileLoader.getInstance(this.f27750n).loadFile(this.h.getDocument(), this.h, 1, 0);
                    this.f27755y = 4;
                    invalidate();
                } else if (i12 == 3) {
                    FileLoader.getInstance(this.f27750n).cancelLoadFile(this.h.getDocument());
                    this.f27755y = 2;
                    invalidate();
                }
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.C = 0;
                invalidate();
            } else if (motionEvent.getAction() == 2) {
                int i13 = this.A;
                if (x8 < i13 || x8 > i13 + iDp) {
                    this.C = 0;
                    invalidate();
                } else {
                    int i14 = this.B;
                    if (y10 < i14 || y10 > i14 + iDp) {
                        this.C = 0;
                        invalidate();
                    }
                }
            }
        }
        return !zF ? super.onTouchEvent(motionEvent) : zF;
    }

    public final void s() {
        mh0 mh0Var = this.v;
        String fileName = this.h.getFileName();
        if (FileLoader.getInstance(this.f27750n).getPathToMessage(this.h.messageOwner).exists()) {
            DownloadController.getInstance(this.f27750n).removeLoadingFileObserver(this);
            boolean zIsPlayingMessage = MediaController.getInstance().isPlayingMessage(this.h);
            if (!zIsPlayingMessage || (zIsPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                this.f27755y = 0;
            } else {
                this.f27755y = 1;
            }
            mh0Var.a(0.0f);
        } else {
            DownloadController.getInstance(this.f27750n).addLoadingFileObserver(fileName, this);
            if (FileLoader.getInstance(this.f27750n).isLoadingFile(fileName)) {
                this.f27755y = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    mh0Var.a(fileProgress.floatValue());
                } else {
                    mh0Var.a(0.0f);
                }
            } else {
                this.f27755y = 2;
                mh0Var.a(0.0f);
            }
        }
        t();
    }

    public void setMessageObject(MessageObject messageObject) {
        if (this.h != messageObject) {
            this.f27750n = messageObject.currentAccount;
            mn0 mn0Var = this.f27752s;
            int i10 = org.telegram.ui.ActionBar.g6.f23364ud;
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
            int iW1 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.g6.f23412xd;
            mn0Var.h(iW0, iW1, org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.wd, false));
            mh0 mh0Var = this.v;
            mh0Var.f30686a.setColor(-2497813);
            mh0Var.f30687b.setColor(-7944712);
            this.h = messageObject;
            this.f27749f = false;
            requestLayout();
        }
        s();
    }

    public final void t() {
        int i10;
        TextPaint textPaint = this.f27751r;
        MessageObject messageObject = this.h;
        if (messageObject == null) {
            return;
        }
        mn0 mn0Var = this.f27752s;
        if (!mn0Var.f30708e) {
            mn0Var.i(messageObject.audioProgress);
        }
        if (MediaController.getInstance().isPlayingMessage(this.h)) {
            i10 = this.h.audioProgressSec;
        } else {
            i10 = 0;
            for (int i11 = 0; i11 < this.h.getDocument().attributes.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = this.h.getDocument().attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i10 = (int) documentAttribute.duration;
                    break;
                }
            }
        }
        String longDuration = AndroidUtilities.formatLongDuration(i10);
        this.F = (int) Math.ceil(textPaint.measureText(longDuration));
        this.D = new StaticLayout(longDuration, textPaint, this.F, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    @Override
    public final void e(float f10) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
