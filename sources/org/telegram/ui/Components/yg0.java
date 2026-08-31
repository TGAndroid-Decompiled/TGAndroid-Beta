package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class yg0 extends org.telegram.ui.Cells.a0 implements go0, DownloadController.FileDownloadProgressListener {
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public int F;
    public int G;
    public int H;
    public boolean f33507f;
    public MessageObject h;
    public int f33508n;
    public TextPaint f33509r;
    public ho0 f33510s;
    public hi0 v;
    public int f33511w;
    public int f33512x;
    public int f33513y;

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
        return this.H;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(this.f33508n).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f33507f) {
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
            org.telegram.ui.ActionBar.k6.f21891q3.n((int) getY(), i11, i10);
            org.telegram.ui.ActionBar.h5 h5Var = org.telegram.ui.ActionBar.k6.f21891q3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (h5Var != null) {
                h5Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            org.telegram.ui.ActionBar.k6.f21891q3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            int i12 = this.f33513y;
            if (i12 != 0 && i12 != 1) {
                canvas.translate(AndroidUtilities.dp(12.0f) + this.f33511w, this.f33512x);
                hi0 hi0Var = this.v;
                float f10 = hi0Var.f27496e / 2;
                float f11 = hi0Var.f27497f / 2.0f;
                canvas.drawRect(0.0f, f10 - f11, hi0Var.d, f11 + f10, hi0Var.f27493a);
                float f12 = hi0Var.f27496e / 2;
                canvas.drawRect(0.0f, f12 - f11, hi0Var.f27495c * hi0Var.d, f11 + f12, hi0Var.f27494b);
            } else {
                canvas.translate(this.f33511w, this.f33512x);
                this.f33510s.b(canvas);
            }
            canvas.restore();
            int i13 = this.f33513y;
            this.f33509r.setColor(-6182221);
            Drawable drawable = org.telegram.ui.ActionBar.k6.U4[i13][this.D];
            int dp = AndroidUtilities.dp(36.0f);
            org.telegram.ui.Cells.a0.o(((dp - drawable.getIntrinsicWidth()) / 2) + this.B, ((dp - drawable.getIntrinsicHeight()) / 2) + this.C, drawable);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate(this.F, AndroidUtilities.dp(18.0f));
            this.E.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
        r();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        hi0 hi0Var = this.v;
        if (this.h != null) {
            this.f33511w = AndroidUtilities.dp(54.0f);
            this.B = AndroidUtilities.dp(10.0f);
            this.F = (getMeasuredWidth() - this.G) - AndroidUtilities.dp(16.0f);
            this.f33510s.j((getMeasuredWidth() - AndroidUtilities.dp(70.0f)) - this.G, AndroidUtilities.dp(30.0f));
            hi0Var.d = (getMeasuredWidth() - AndroidUtilities.dp(94.0f)) - this.G;
            hi0Var.f27496e = AndroidUtilities.dp(30.0f);
            this.f33512x = AndroidUtilities.dp(13.0f);
            this.C = AndroidUtilities.dp(10.0f);
            s();
            if (!z4 && this.f33507f) {
                return;
            }
            this.f33507f = true;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.v.a(Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.f33513y != 3) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yg0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void r() {
        hi0 hi0Var = this.v;
        String fileName = this.h.getFileName();
        if (FileLoader.getInstance(this.f33508n).getPathToMessage(this.h.messageOwner).exists()) {
            DownloadController.getInstance(this.f33508n).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.h);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.f33513y = 1;
            } else {
                this.f33513y = 0;
            }
            hi0Var.a(0.0f);
        } else {
            DownloadController.getInstance(this.f33508n).addLoadingFileObserver(fileName, this);
            if (!FileLoader.getInstance(this.f33508n).isLoadingFile(fileName)) {
                this.f33513y = 2;
                hi0Var.a(0.0f);
            } else {
                this.f33513y = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    hi0Var.a(fileProgress.floatValue());
                } else {
                    hi0Var.a(0.0f);
                }
            }
        }
        s();
    }

    public final void s() {
        int i10;
        TextPaint textPaint = this.f33509r;
        MessageObject messageObject = this.h;
        if (messageObject == null) {
            return;
        }
        ho0 ho0Var = this.f33510s;
        if (!ho0Var.f27535e) {
            ho0Var.i(messageObject.audioProgress);
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
        this.G = (int) Math.ceil(textPaint.measureText(formatLongDuration));
        this.E = new StaticLayout(formatLongDuration, textPaint, this.G, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public void setMessageObject(MessageObject messageObject) {
        if (this.h != messageObject) {
            this.f33508n = messageObject.currentAccount;
            ho0 ho0Var = this.f33510s;
            int i10 = org.telegram.ui.ActionBar.k6.f21968ud;
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
            int w03 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.k6.f22024xd;
            ho0Var.h(w02, w03, org.telegram.ui.ActionBar.k6.w0(null, i11, false), org.telegram.ui.ActionBar.k6.w0(null, i11, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22005wd, false));
            hi0 hi0Var = this.v;
            hi0Var.f27493a.setColor(-2497813);
            hi0Var.f27494b.setColor(-7944712);
            this.h = messageObject;
            this.f33507f = false;
            requestLayout();
        }
        r();
    }

    @Override
    public final void d(float f10) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
