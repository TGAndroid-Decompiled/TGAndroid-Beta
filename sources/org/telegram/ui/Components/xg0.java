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
public final class xg0 extends org.telegram.ui.Cells.a0 implements eo0, DownloadController.FileDownloadProgressListener {
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public int F;
    public int G;
    public int H;
    public boolean f30635f;
    public MessageObject h;
    public int f30636n;
    public TextPaint f30637r;
    public fo0 f30638s;
    public gi0 v;
    public int f30639w;
    public int f30640x;
    public int f30641y;

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
        DownloadController.getInstance(this.f30636n).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f30635f) {
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
            org.telegram.ui.ActionBar.j6.f20112q3.n((int) getY(), i11, i10);
            org.telegram.ui.ActionBar.g5 g5Var = org.telegram.ui.ActionBar.j6.f20112q3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (g5Var != null) {
                g5Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            org.telegram.ui.ActionBar.j6.f20112q3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            int i12 = this.f30641y;
            if (i12 != 0 && i12 != 1) {
                canvas.translate(AndroidUtilities.dp(12.0f) + this.f30639w, this.f30640x);
                gi0 gi0Var = this.v;
                float f10 = gi0Var.e / 2;
                float f11 = gi0Var.f25151f / 2.0f;
                canvas.drawRect(0.0f, f10 - f11, gi0Var.d, f11 + f10, gi0Var.f25148a);
                float f12 = gi0Var.e / 2;
                canvas.drawRect(0.0f, f12 - f11, gi0Var.f25150c * gi0Var.d, f11 + f12, gi0Var.f25149b);
            } else {
                canvas.translate(this.f30639w, this.f30640x);
                this.f30638s.b(canvas);
            }
            canvas.restore();
            int i13 = this.f30641y;
            this.f30637r.setColor(-6182221);
            Drawable drawable = org.telegram.ui.ActionBar.j6.U4[i13][this.D];
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
        gi0 gi0Var = this.v;
        if (this.h != null) {
            this.f30639w = AndroidUtilities.dp(54.0f);
            this.B = AndroidUtilities.dp(10.0f);
            this.F = (getMeasuredWidth() - this.G) - AndroidUtilities.dp(16.0f);
            this.f30638s.j((getMeasuredWidth() - AndroidUtilities.dp(70.0f)) - this.G, AndroidUtilities.dp(30.0f));
            gi0Var.d = (getMeasuredWidth() - AndroidUtilities.dp(94.0f)) - this.G;
            gi0Var.e = AndroidUtilities.dp(30.0f);
            this.f30640x = AndroidUtilities.dp(13.0f);
            this.C = AndroidUtilities.dp(10.0f);
            s();
            if (!z4 && this.f30635f) {
                return;
            }
            this.f30635f = true;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.v.a(Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.f30641y != 3) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xg0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void r() {
        gi0 gi0Var = this.v;
        String fileName = this.h.getFileName();
        if (FileLoader.getInstance(this.f30636n).getPathToMessage(this.h.messageOwner).exists()) {
            DownloadController.getInstance(this.f30636n).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.h);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.f30641y = 1;
            } else {
                this.f30641y = 0;
            }
            gi0Var.a(0.0f);
        } else {
            DownloadController.getInstance(this.f30636n).addLoadingFileObserver(fileName, this);
            if (!FileLoader.getInstance(this.f30636n).isLoadingFile(fileName)) {
                this.f30641y = 2;
                gi0Var.a(0.0f);
            } else {
                this.f30641y = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    gi0Var.a(fileProgress.floatValue());
                } else {
                    gi0Var.a(0.0f);
                }
            }
        }
        s();
    }

    public final void s() {
        int i10;
        TextPaint textPaint = this.f30637r;
        MessageObject messageObject = this.h;
        if (messageObject == null) {
            return;
        }
        fo0 fo0Var = this.f30638s;
        if (!fo0Var.e) {
            fo0Var.i(messageObject.audioProgress);
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
            this.f30636n = messageObject.currentAccount;
            fo0 fo0Var = this.f30638s;
            int i10 = org.telegram.ui.ActionBar.j6.f20189ud;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.j6.f20245xd;
            fo0Var.h(w02, w03, org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20226wd, false));
            gi0 gi0Var = this.v;
            gi0Var.f25148a.setColor(-2497813);
            gi0Var.f25149b.setColor(-7944712);
            this.h = messageObject;
            this.f30635f = false;
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
