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
public final class qg0 extends org.telegram.ui.Cells.a0 implements ao0, DownloadController.FileDownloadProgressListener {
    public int E;
    public int F;
    public int G;
    public StaticLayout H;
    public int I;
    public int J;
    public int K;
    public boolean f29721f;
    public MessageObject h;
    public int f29722n;
    public TextPaint f29723r;
    public bo0 f29724s;
    public yh0 v;
    public int f29725w;
    public int f29726x;
    public int f29727y;

    @Override
    public final void b(float f7) {
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
        DownloadController.getInstance(this.f29722n).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f29721f) {
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
            org.telegram.ui.ActionBar.j6.f20895q3.n((int) getY(), i11, i10);
            org.telegram.ui.ActionBar.f5 f5Var = org.telegram.ui.ActionBar.j6.f20895q3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (f5Var != null) {
                f5Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            org.telegram.ui.ActionBar.j6.f20895q3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            int i12 = this.f29727y;
            if (i12 != 0 && i12 != 1) {
                canvas.translate(AndroidUtilities.dp(12.0f) + this.f29725w, this.f29726x);
                yh0 yh0Var = this.v;
                float f7 = yh0Var.f32925e / 2;
                float f10 = yh0Var.f32926f / 2.0f;
                canvas.drawRect(0.0f, f7 - f10, yh0Var.d, f10 + f7, yh0Var.f32922a);
                float f11 = yh0Var.f32925e / 2;
                canvas.drawRect(0.0f, f11 - f10, yh0Var.f32924c * yh0Var.d, f10 + f11, yh0Var.f32923b);
            } else {
                canvas.translate(this.f29725w, this.f29726x);
                this.f29724s.b(canvas);
            }
            canvas.restore();
            int i13 = this.f29727y;
            this.f29723r.setColor(-6182221);
            Drawable drawable = org.telegram.ui.ActionBar.j6.U4[i13][this.G];
            int dp = AndroidUtilities.dp(36.0f);
            org.telegram.ui.Cells.a0.o(((dp - drawable.getIntrinsicWidth()) / 2) + this.E, ((dp - drawable.getIntrinsicHeight()) / 2) + this.F, drawable);
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
        yh0 yh0Var = this.v;
        if (this.h != null) {
            this.f29725w = AndroidUtilities.dp(54.0f);
            this.E = AndroidUtilities.dp(10.0f);
            this.I = (getMeasuredWidth() - this.J) - AndroidUtilities.dp(16.0f);
            this.f29724s.j((getMeasuredWidth() - AndroidUtilities.dp(70.0f)) - this.J, AndroidUtilities.dp(30.0f));
            yh0Var.d = (getMeasuredWidth() - AndroidUtilities.dp(94.0f)) - this.J;
            yh0Var.f32925e = AndroidUtilities.dp(30.0f);
            this.f29726x = AndroidUtilities.dp(13.0f);
            this.F = AndroidUtilities.dp(10.0f);
            s();
            if (!z10 && this.f29721f) {
                return;
            }
            this.f29721f = true;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.v.a(Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.f29727y != 3) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qg0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void r() {
        yh0 yh0Var = this.v;
        String fileName = this.h.getFileName();
        if (FileLoader.getInstance(this.f29722n).getPathToMessage(this.h.messageOwner).exists()) {
            DownloadController.getInstance(this.f29722n).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.h);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.f29727y = 1;
            } else {
                this.f29727y = 0;
            }
            yh0Var.a(0.0f);
        } else {
            DownloadController.getInstance(this.f29722n).addLoadingFileObserver(fileName, this);
            if (!FileLoader.getInstance(this.f29722n).isLoadingFile(fileName)) {
                this.f29727y = 2;
                yh0Var.a(0.0f);
            } else {
                this.f29727y = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    yh0Var.a(fileProgress.floatValue());
                } else {
                    yh0Var.a(0.0f);
                }
            }
        }
        s();
    }

    public final void s() {
        int i10;
        TextPaint textPaint = this.f29723r;
        MessageObject messageObject = this.h;
        if (messageObject == null) {
            return;
        }
        bo0 bo0Var = this.f29724s;
        if (!bo0Var.f24757e) {
            bo0Var.i(messageObject.audioProgress);
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
            this.f29722n = messageObject.currentAccount;
            bo0 bo0Var = this.f29724s;
            int i10 = org.telegram.ui.ActionBar.j6.f20979ud;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.j6.f21031xd;
            bo0Var.h(w02, w03, org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21014wd, false));
            yh0 yh0Var = this.v;
            yh0Var.f32922a.setColor(-2497813);
            yh0Var.f32923b.setColor(-7944712);
            this.h = messageObject;
            this.f29721f = false;
            requestLayout();
        }
        r();
    }

    @Override
    public final void c(float f7) {
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
