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
public final class mg0 extends org.telegram.ui.Cells.a0 implements vn0, DownloadController.FileDownloadProgressListener {
    public int A;
    public int B;
    public int C;
    public StaticLayout D;
    public int E;
    public int F;
    public int G;
    public boolean f30684f;
    public MessageObject h;
    public int f30685n;
    public TextPaint f30686r;
    public wn0 f30687s;
    public uh0 v;
    public int f30688w;
    public int f30689x;
    public int f30690y;

    @Override
    public final void c(float f9) {
        MessageObject messageObject = this.h;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f9;
        MediaController.getInstance().seekToProgress(this.h, f9);
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
        DownloadController.getInstance(this.f30685n).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f30684f) {
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
            org.telegram.ui.ActionBar.g6.f23292q3.n((int) getY(), i11, i10);
            org.telegram.ui.ActionBar.d5 d5Var = org.telegram.ui.ActionBar.g6.f23292q3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (d5Var != null) {
                d5Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            org.telegram.ui.ActionBar.g6.f23292q3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            int i12 = this.f30690y;
            if (i12 != 0 && i12 != 1) {
                canvas.translate(AndroidUtilities.dp(12.0f) + this.f30688w, this.f30689x);
                uh0 uh0Var = this.v;
                float f9 = uh0Var.f33240e / 2;
                float f10 = uh0Var.f33241f / 2.0f;
                canvas.drawRect(0.0f, f9 - f10, uh0Var.d, f10 + f9, uh0Var.f33237a);
                float f11 = uh0Var.f33240e / 2;
                canvas.drawRect(0.0f, f11 - f10, uh0Var.f33239c * uh0Var.d, f10 + f11, uh0Var.f33238b);
            } else {
                canvas.translate(this.f30688w, this.f30689x);
                this.f30687s.b(canvas);
            }
            canvas.restore();
            int i13 = this.f30690y;
            this.f30686r.setColor(-6182221);
            Drawable drawable = org.telegram.ui.ActionBar.g6.U4[i13][this.C];
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        uh0 uh0Var = this.v;
        if (this.h != null) {
            this.f30688w = AndroidUtilities.dp(54.0f);
            this.A = AndroidUtilities.dp(10.0f);
            this.E = (getMeasuredWidth() - this.F) - AndroidUtilities.dp(16.0f);
            this.f30687s.j((getMeasuredWidth() - AndroidUtilities.dp(70.0f)) - this.F, AndroidUtilities.dp(30.0f));
            uh0Var.d = (getMeasuredWidth() - AndroidUtilities.dp(94.0f)) - this.F;
            uh0Var.f33240e = AndroidUtilities.dp(30.0f);
            this.f30689x = AndroidUtilities.dp(13.0f);
            this.B = AndroidUtilities.dp(10.0f);
            s();
            if (!z10 && this.f30684f) {
                return;
            }
            this.f30684f = true;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.v.a(Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.f30690y != 3) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mg0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void r() {
        uh0 uh0Var = this.v;
        String fileName = this.h.getFileName();
        if (FileLoader.getInstance(this.f30685n).getPathToMessage(this.h.messageOwner).exists()) {
            DownloadController.getInstance(this.f30685n).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.h);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.f30690y = 1;
            } else {
                this.f30690y = 0;
            }
            uh0Var.a(0.0f);
        } else {
            DownloadController.getInstance(this.f30685n).addLoadingFileObserver(fileName, this);
            if (!FileLoader.getInstance(this.f30685n).isLoadingFile(fileName)) {
                this.f30690y = 2;
                uh0Var.a(0.0f);
            } else {
                this.f30690y = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    uh0Var.a(fileProgress.floatValue());
                } else {
                    uh0Var.a(0.0f);
                }
            }
        }
        s();
    }

    public final void s() {
        int i10;
        TextPaint textPaint = this.f30686r;
        MessageObject messageObject = this.h;
        if (messageObject == null) {
            return;
        }
        wn0 wn0Var = this.f30687s;
        if (!wn0Var.f34449e) {
            wn0Var.i(messageObject.audioProgress);
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
        this.F = (int) Math.ceil(textPaint.measureText(formatLongDuration));
        this.D = new StaticLayout(formatLongDuration, textPaint, this.F, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public void setMessageObject(MessageObject messageObject) {
        if (this.h != messageObject) {
            this.f30685n = messageObject.currentAccount;
            wn0 wn0Var = this.f30687s;
            int i10 = org.telegram.ui.ActionBar.g6.f23372ud;
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
            int w03 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.g6.xd;
            wn0Var.h(w02, w03, org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23408wd, false));
            uh0 uh0Var = this.v;
            uh0Var.f33237a.setColor(-2497813);
            uh0Var.f33238b.setColor(-7944712);
            this.h = messageObject;
            this.f30684f = false;
            requestLayout();
        }
        r();
    }

    @Override
    public final void d(float f9) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
