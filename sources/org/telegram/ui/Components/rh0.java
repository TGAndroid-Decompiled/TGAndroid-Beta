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
public final class rh0 extends org.telegram.ui.Cells.a0 implements bp0, DownloadController.FileDownloadProgressListener {
    public int E;
    public int F;
    public int G;
    public StaticLayout H;
    public int I;
    public int J;
    public int K;
    public boolean f28537f;
    public MessageObject h;
    public int f28538n;
    public TextPaint f28539r;
    public cp0 f28540s;
    public zi0 v;
    public int f28541w;
    public int f28542x;
    public int f28543y;

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
        DownloadController.getInstance(this.f28538n).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f28537f) {
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
            org.telegram.ui.ActionBar.g6.f19836q3.n((int) getY(), i11, i10);
            org.telegram.ui.ActionBar.d5 d5Var = org.telegram.ui.ActionBar.g6.f19836q3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (d5Var != null) {
                d5Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            org.telegram.ui.ActionBar.g6.f19836q3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            int i12 = this.f28543y;
            if (i12 != 0 && i12 != 1) {
                canvas.translate(AndroidUtilities.dp(12.0f) + this.f28541w, this.f28542x);
                zi0 zi0Var = this.v;
                float f7 = zi0Var.e / 2;
                float f10 = zi0Var.f31576f / 2.0f;
                canvas.drawRect(0.0f, f7 - f10, zi0Var.d, f10 + f7, zi0Var.f31573a);
                float f11 = zi0Var.e / 2;
                canvas.drawRect(0.0f, f11 - f10, zi0Var.f31575c * zi0Var.d, f10 + f11, zi0Var.f31574b);
            } else {
                canvas.translate(this.f28541w, this.f28542x);
                this.f28540s.b(canvas);
            }
            canvas.restore();
            int i13 = this.f28543y;
            this.f28539r.setColor(-6182221);
            Drawable drawable = org.telegram.ui.ActionBar.g6.U4[i13][this.G];
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
        s();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        zi0 zi0Var = this.v;
        if (this.h != null) {
            this.f28541w = AndroidUtilities.dp(54.0f);
            this.E = AndroidUtilities.dp(10.0f);
            this.I = (getMeasuredWidth() - this.J) - AndroidUtilities.dp(16.0f);
            this.f28540s.j((getMeasuredWidth() - AndroidUtilities.dp(70.0f)) - this.J, AndroidUtilities.dp(30.0f));
            zi0Var.d = (getMeasuredWidth() - AndroidUtilities.dp(94.0f)) - this.J;
            zi0Var.e = AndroidUtilities.dp(30.0f);
            this.f28542x = AndroidUtilities.dp(13.0f);
            this.F = AndroidUtilities.dp(10.0f);
            t();
            if (!z10 && this.f28537f) {
                return;
            }
            this.f28537f = true;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.v.a(Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.f28543y != 3) {
            s();
        }
        invalidate();
    }

    @Override
    public final void onSuccessDownload(String str) {
        s();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rh0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void s() {
        zi0 zi0Var = this.v;
        String fileName = this.h.getFileName();
        if (FileLoader.getInstance(this.f28538n).getPathToMessage(this.h.messageOwner).exists()) {
            DownloadController.getInstance(this.f28538n).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.h);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.f28543y = 1;
            } else {
                this.f28543y = 0;
            }
            zi0Var.a(0.0f);
        } else {
            DownloadController.getInstance(this.f28538n).addLoadingFileObserver(fileName, this);
            if (!FileLoader.getInstance(this.f28538n).isLoadingFile(fileName)) {
                this.f28543y = 2;
                zi0Var.a(0.0f);
            } else {
                this.f28543y = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    zi0Var.a(fileProgress.floatValue());
                } else {
                    zi0Var.a(0.0f);
                }
            }
        }
        t();
    }

    public void setMessageObject(MessageObject messageObject) {
        if (this.h != messageObject) {
            this.f28538n = messageObject.currentAccount;
            cp0 cp0Var = this.f28540s;
            int i10 = org.telegram.ui.ActionBar.g6.f19922ud;
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
            int x03 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.g6.f19977xd;
            cp0Var.h(x02, x03, org.telegram.ui.ActionBar.g6.x0(null, i11, false), org.telegram.ui.ActionBar.g6.x0(null, i11, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19958wd, false));
            zi0 zi0Var = this.v;
            zi0Var.f31573a.setColor(-2497813);
            zi0Var.f31574b.setColor(-7944712);
            this.h = messageObject;
            this.f28537f = false;
            requestLayout();
        }
        s();
    }

    public final void t() {
        int i10;
        TextPaint textPaint = this.f28539r;
        MessageObject messageObject = this.h;
        if (messageObject == null) {
            return;
        }
        cp0 cp0Var = this.f28540s;
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

    @Override
    public final void c(float f7) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
