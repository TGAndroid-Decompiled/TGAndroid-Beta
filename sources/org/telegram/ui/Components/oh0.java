package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class oh0 extends org.telegram.ui.Cells.z implements bp0, DownloadController.FileDownloadProgressListener, org.telegram.ui.ActionBar.b6 {
    public int E;
    public int F;
    public int G;
    public StaticLayout H;
    public int I;
    public int J;
    public int K;
    public boolean f29283f;
    public MessageObject h;
    public int f29284n;
    public TextPaint f29285r;
    public cp0 f29286s;
    public xi0 v;
    public int f29287w;
    public int f29288x;
    public int f29289y;

    @Override
    public final void a(float f7) {
        MessageObject messageObject = this.h;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(this.h, f7);
    }

    public final MessageObject getMessageObject() {
        return this.h;
    }

    @Override
    public int getObserverTag() {
        return this.K;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(this.f29284n).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f29283f) {
                requestLayout();
                return;
            }
            Point point = AndroidUtilities.displaySize;
            int i10 = point.y;
            int i11 = point.x;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                int measuredWidth = view.getMeasuredWidth();
                i10 = view.getMeasuredHeight();
                i11 = measuredWidth;
            }
            org.telegram.ui.ActionBar.k6.f21419q3.m((int) getY(), i11, i10);
            org.telegram.ui.ActionBar.j5 j5Var = org.telegram.ui.ActionBar.k6.f21419q3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (j5Var != null) {
                j5Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            org.telegram.ui.ActionBar.k6.f21419q3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            int i12 = this.f29289y;
            if (i12 != 0 && i12 != 1) {
                canvas.translate(AndroidUtilities.dp(12.0f) + this.f29287w, this.f29288x);
                xi0 xi0Var = this.v;
                float f7 = xi0Var.e / 2;
                float f10 = xi0Var.f32589f / 2.0f;
                canvas.drawRect(0.0f, f7 - f10, xi0Var.d, f10 + f7, xi0Var.f32586a);
                float f11 = xi0Var.e / 2;
                canvas.drawRect(0.0f, f11 - f10, xi0Var.f32588c * xi0Var.d, f10 + f11, xi0Var.f32587b);
            } else {
                canvas.translate(this.f29287w, this.f29288x);
                this.f29286s.b(canvas);
            }
            canvas.restore();
            int i13 = this.f29289y;
            this.f29285r.setColor(-6182221);
            Drawable drawable = org.telegram.ui.ActionBar.k6.U4[i13][this.G];
            int dp = AndroidUtilities.dp(36.0f);
            org.telegram.ui.Cells.z.n(((dp - drawable.getIntrinsicWidth()) / 2) + this.E, ((dp - drawable.getIntrinsicHeight()) / 2) + this.F, drawable);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate(this.I, AndroidUtilities.dp(18.0f));
            this.H.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        r();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        xi0 xi0Var = this.v;
        if (this.h != null) {
            this.f29287w = AndroidUtilities.dp(54.0f);
            this.E = AndroidUtilities.dp(10.0f);
            this.I = (getMeasuredWidth() - this.J) - AndroidUtilities.dp(16.0f);
            this.f29286s.j((getMeasuredWidth() - AndroidUtilities.dp(70.0f)) - this.J, AndroidUtilities.dp(30.0f));
            xi0Var.d = (getMeasuredWidth() - AndroidUtilities.dp(94.0f)) - this.J;
            xi0Var.e = AndroidUtilities.dp(30.0f);
            this.f29288x = AndroidUtilities.dp(13.0f);
            this.F = AndroidUtilities.dp(10.0f);
            s();
            if (!z10 && this.f29283f) {
                return;
            }
            this.f29283f = true;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.v.a(Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.f29289y != 3) {
            r();
        }
        invalidate();
    }

    @Override
    public final void onSuccessDownload(String str) {
        r();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oh0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void r() {
        xi0 xi0Var = this.v;
        String fileName = this.h.getFileName();
        if (FileLoader.getInstance(this.f29284n).getPathToMessage(this.h.messageOwner).exists()) {
            DownloadController.getInstance(this.f29284n).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.h);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.f29289y = 1;
            } else {
                this.f29289y = 0;
            }
            xi0Var.a(0.0f);
        } else {
            DownloadController.getInstance(this.f29284n).addLoadingFileObserver(fileName, this);
            if (!FileLoader.getInstance(this.f29284n).isLoadingFile(fileName)) {
                this.f29289y = 2;
                xi0Var.a(0.0f);
            } else {
                this.f29289y = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    xi0Var.a(fileProgress.floatValue());
                } else {
                    xi0Var.a(0.0f);
                }
            }
        }
        s();
    }

    public final void s() {
        int i10;
        TextPaint textPaint = this.f29285r;
        MessageObject messageObject = this.h;
        if (messageObject == null) {
            return;
        }
        cp0 cp0Var = this.f29286s;
        if (!cp0Var.e) {
            cp0Var.i(messageObject.audioProgress);
        }
        if (!MediaController.getInstance().isPlayingMessage(this.h)) {
            i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= this.h.getDocument().attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.h.getDocument().attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i10 = (int) documentAttribute.duration;
                    break;
                }
                i11++;
            }
        } else {
            i10 = this.h.audioProgressSec;
        }
        String formatLongDuration = AndroidUtilities.formatLongDuration(i10);
        this.J = (int) Math.ceil(textPaint.measureText(formatLongDuration));
        this.H = new StaticLayout(formatLongDuration, textPaint, this.J, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public void setMessageObject(MessageObject messageObject) {
        if (this.h != messageObject) {
            this.f29284n = messageObject.currentAccount;
            cp0 cp0Var = this.f29286s;
            int i10 = org.telegram.ui.ActionBar.k6.f21506ud;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.k6.f21561xd;
            cp0Var.h(x02, x03, org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21542wd, false));
            xi0 xi0Var = this.v;
            xi0Var.f32586a.setColor(-2497813);
            xi0Var.f32587b.setColor(-7944712);
            this.h = messageObject;
            this.f29283f = false;
            requestLayout();
        }
        r();
    }

    @Override
    public final void updateColors() {
        try {
            cp0 cp0Var = this.f29286s;
            if (cp0Var != null && this.h != null) {
                int i10 = org.telegram.ui.ActionBar.k6.f21506ud;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
                int i11 = org.telegram.ui.ActionBar.k6.f21561xd;
                cp0Var.h(x02, x03, org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21542wd, false));
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void b(float f7) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
