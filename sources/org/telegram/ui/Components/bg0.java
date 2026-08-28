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
public final class bg0 extends org.telegram.ui.Cells.a0 implements kn0, DownloadController.FileDownloadProgressListener {
    public int A;
    public int B;
    public int C;
    public StaticLayout D;
    public int E;
    public int F;
    public int G;
    public boolean f27199f;
    public MessageObject h;
    public int f27200n;
    public TextPaint f27201r;
    public ln0 f27202s;
    public kh0 v;
    public int f27203w;
    public int f27204x;
    public int f27205y;

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
        DownloadController.getInstance(this.f27200n).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f27199f) {
                requestLayout();
                return;
            }
            Point point = AndroidUtilities.displaySize;
            int i9 = point.y;
            int i10 = point.x;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                int measuredWidth = view.getMeasuredWidth();
                i9 = view.getMeasuredHeight();
                i10 = measuredWidth;
            }
            org.telegram.ui.ActionBar.f6.f23226q3.n((int) getY(), i10, i9);
            org.telegram.ui.ActionBar.d5 d5Var = org.telegram.ui.ActionBar.f6.f23226q3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (d5Var != null) {
                d5Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            org.telegram.ui.ActionBar.f6.f23226q3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            int i11 = this.f27205y;
            if (i11 != 0 && i11 != 1) {
                canvas.translate(AndroidUtilities.dp(12.0f) + this.f27203w, this.f27204x);
                kh0 kh0Var = this.v;
                float f10 = kh0Var.f30094e / 2;
                float f11 = kh0Var.f30095f / 2.0f;
                canvas.drawRect(0.0f, f10 - f11, kh0Var.d, f11 + f10, kh0Var.f30091a);
                float f12 = kh0Var.f30094e / 2;
                canvas.drawRect(0.0f, f12 - f11, kh0Var.f30093c * kh0Var.d, f11 + f12, kh0Var.f30092b);
            } else {
                canvas.translate(this.f27203w, this.f27204x);
                this.f27202s.b(canvas);
            }
            canvas.restore();
            int i12 = this.f27205y;
            this.f27201r.setColor(-6182221);
            Drawable drawable = org.telegram.ui.ActionBar.f6.U4[i12][this.C];
            int dp = AndroidUtilities.dp(36.0f);
            org.telegram.ui.Cells.a0.o(((dp - drawable.getIntrinsicWidth()) / 2) + this.A, ((dp - drawable.getIntrinsicHeight()) / 2) + this.B, drawable);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate(this.E, AndroidUtilities.dp(18.0f));
            this.D.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        r();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        kh0 kh0Var = this.v;
        if (this.h != null) {
            this.f27203w = AndroidUtilities.dp(54.0f);
            this.A = AndroidUtilities.dp(10.0f);
            this.E = (getMeasuredWidth() - this.F) - AndroidUtilities.dp(16.0f);
            this.f27202s.j((getMeasuredWidth() - AndroidUtilities.dp(70.0f)) - this.F, AndroidUtilities.dp(30.0f));
            kh0Var.d = (getMeasuredWidth() - AndroidUtilities.dp(94.0f)) - this.F;
            kh0Var.f30094e = AndroidUtilities.dp(30.0f);
            this.f27204x = AndroidUtilities.dp(13.0f);
            this.B = AndroidUtilities.dp(10.0f);
            s();
            if (!z10 && this.f27199f) {
                return;
            }
            this.f27199f = true;
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(56.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.v.a(Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.f27205y != 3) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bg0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void r() {
        kh0 kh0Var = this.v;
        String fileName = this.h.getFileName();
        if (FileLoader.getInstance(this.f27200n).getPathToMessage(this.h.messageOwner).exists()) {
            DownloadController.getInstance(this.f27200n).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.h);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.f27205y = 1;
            } else {
                this.f27205y = 0;
            }
            kh0Var.a(0.0f);
        } else {
            DownloadController.getInstance(this.f27200n).addLoadingFileObserver(fileName, this);
            if (!FileLoader.getInstance(this.f27200n).isLoadingFile(fileName)) {
                this.f27205y = 2;
                kh0Var.a(0.0f);
            } else {
                this.f27205y = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    kh0Var.a(fileProgress.floatValue());
                } else {
                    kh0Var.a(0.0f);
                }
            }
        }
        s();
    }

    public final void s() {
        int i9;
        TextPaint textPaint = this.f27201r;
        MessageObject messageObject = this.h;
        if (messageObject == null) {
            return;
        }
        ln0 ln0Var = this.f27202s;
        if (!ln0Var.f30490e) {
            ln0Var.i(messageObject.audioProgress);
        }
        if (!MediaController.getInstance().isPlayingMessage(this.h)) {
            i9 = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= this.h.getDocument().attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.h.getDocument().attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i9 = (int) documentAttribute.duration;
                    break;
                }
                i10++;
            }
        } else {
            i9 = this.h.audioProgressSec;
        }
        String formatLongDuration = AndroidUtilities.formatLongDuration(i9);
        this.F = (int) Math.ceil(textPaint.measureText(formatLongDuration));
        this.D = new StaticLayout(formatLongDuration, textPaint, this.F, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public void setMessageObject(MessageObject messageObject) {
        if (this.h != messageObject) {
            this.f27200n = messageObject.currentAccount;
            ln0 ln0Var = this.f27202s;
            int i9 = org.telegram.ui.ActionBar.f6.f23310ud;
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
            int w03 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
            int i10 = org.telegram.ui.ActionBar.f6.f23358xd;
            ln0Var.h(w02, w03, org.telegram.ui.ActionBar.f6.w0(null, i10, false), org.telegram.ui.ActionBar.f6.w0(null, i10, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23340wd, false));
            kh0 kh0Var = this.v;
            kh0Var.f30091a.setColor(-2497813);
            kh0Var.f30092b.setColor(-7944712);
            this.h = messageObject;
            this.f27199f = false;
            requestLayout();
        }
        r();
    }

    @Override
    public final void e(float f10) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
