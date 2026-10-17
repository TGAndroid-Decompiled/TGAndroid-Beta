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
public final class lh0 extends org.telegram.ui.Cells.a0 implements xo0, DownloadController.FileDownloadProgressListener {
    public int E;
    public int F;
    public int G;
    public StaticLayout H;
    public int I;
    public int J;
    public int K;
    public boolean f28230f;
    public MessageObject h;
    public int f28231n;
    public TextPaint f28232r;
    public yo0 f28233s;
    public ui0 v;
    public int f28234w;
    public int f28235x;
    public int f28236y;

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
        DownloadController.getInstance(this.f28231n).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f28230f) {
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
            org.telegram.ui.ActionBar.h6.f21221q3.n((int) getY(), i11, i10);
            org.telegram.ui.ActionBar.f5 f5Var = org.telegram.ui.ActionBar.h6.f21221q3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (f5Var != null) {
                f5Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            org.telegram.ui.ActionBar.h6.f21221q3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            int i12 = this.f28236y;
            if (i12 != 0 && i12 != 1) {
                canvas.translate(AndroidUtilities.dp(12.0f) + this.f28234w, this.f28235x);
                ui0 ui0Var = this.v;
                float f7 = ui0Var.e / 2;
                float f10 = ui0Var.f30997f / 2.0f;
                canvas.drawRect(0.0f, f7 - f10, ui0Var.d, f10 + f7, ui0Var.f30994a);
                float f11 = ui0Var.e / 2;
                canvas.drawRect(0.0f, f11 - f10, ui0Var.f30996c * ui0Var.d, f10 + f11, ui0Var.f30995b);
            } else {
                canvas.translate(this.f28234w, this.f28235x);
                this.f28233s.b(canvas);
            }
            canvas.restore();
            int i13 = this.f28236y;
            this.f28232r.setColor(-6182221);
            Drawable drawable = org.telegram.ui.ActionBar.h6.U4[i13][this.G];
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
        ui0 ui0Var = this.v;
        if (this.h != null) {
            this.f28234w = AndroidUtilities.dp(54.0f);
            this.E = AndroidUtilities.dp(10.0f);
            this.I = (getMeasuredWidth() - this.J) - AndroidUtilities.dp(16.0f);
            this.f28233s.j((getMeasuredWidth() - AndroidUtilities.dp(70.0f)) - this.J, AndroidUtilities.dp(30.0f));
            ui0Var.d = (getMeasuredWidth() - AndroidUtilities.dp(94.0f)) - this.J;
            ui0Var.e = AndroidUtilities.dp(30.0f);
            this.f28235x = AndroidUtilities.dp(13.0f);
            this.F = AndroidUtilities.dp(10.0f);
            s();
            if (!z10 && this.f28230f) {
                return;
            }
            this.f28230f = true;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.v.a(Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.f28236y != 3) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lh0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void r() {
        ui0 ui0Var = this.v;
        String fileName = this.h.getFileName();
        if (FileLoader.getInstance(this.f28231n).getPathToMessage(this.h.messageOwner).exists()) {
            DownloadController.getInstance(this.f28231n).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.h);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.f28236y = 1;
            } else {
                this.f28236y = 0;
            }
            ui0Var.a(0.0f);
        } else {
            DownloadController.getInstance(this.f28231n).addLoadingFileObserver(fileName, this);
            if (!FileLoader.getInstance(this.f28231n).isLoadingFile(fileName)) {
                this.f28236y = 2;
                ui0Var.a(0.0f);
            } else {
                this.f28236y = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    ui0Var.a(fileProgress.floatValue());
                } else {
                    ui0Var.a(0.0f);
                }
            }
        }
        s();
    }

    public final void s() {
        int i10;
        TextPaint textPaint = this.f28232r;
        MessageObject messageObject = this.h;
        if (messageObject == null) {
            return;
        }
        yo0 yo0Var = this.f28233s;
        if (!yo0Var.e) {
            yo0Var.i(messageObject.audioProgress);
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
            this.f28231n = messageObject.currentAccount;
            yo0 yo0Var = this.f28233s;
            int i10 = org.telegram.ui.ActionBar.h6.f21308ud;
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.h6.f21363xd;
            yo0Var.h(x02, x03, org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21344wd, false));
            ui0 ui0Var = this.v;
            ui0Var.f30994a.setColor(-2497813);
            ui0Var.f30995b.setColor(-7944712);
            this.h = messageObject;
            this.f28230f = false;
            requestLayout();
        }
        r();
    }

    @Override
    public final void c(float f7) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
