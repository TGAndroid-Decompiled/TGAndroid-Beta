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
public final class xh0 extends org.telegram.ui.Cells.a0 implements lp0, DownloadController.FileDownloadProgressListener {
    public int E;
    public int F;
    public int G;
    public StaticLayout H;
    public int I;
    public int J;
    public int K;
    public boolean f32752f;
    public MessageObject h;
    public int f32753n;
    public TextPaint f32754r;
    public mp0 f32755s;
    public gj0 v;
    public int f32756w;
    public int f32757x;
    public int f32758y;

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
        DownloadController.getInstance(this.f32753n).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f32752f) {
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
            org.telegram.ui.ActionBar.h6.f20797q3.n((int) getY(), i11, i10);
            org.telegram.ui.ActionBar.d5 d5Var = org.telegram.ui.ActionBar.h6.f20797q3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (d5Var != null) {
                d5Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            org.telegram.ui.ActionBar.h6.f20797q3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            int i12 = this.f32758y;
            if (i12 != 0 && i12 != 1) {
                canvas.translate(AndroidUtilities.dp(12.0f) + this.f32756w, this.f32757x);
                gj0 gj0Var = this.v;
                float f7 = gj0Var.f26445e / 2;
                float f10 = gj0Var.f26446f / 2.0f;
                canvas.drawRect(0.0f, f7 - f10, gj0Var.d, f10 + f7, gj0Var.f26442a);
                float f11 = gj0Var.f26445e / 2;
                canvas.drawRect(0.0f, f11 - f10, gj0Var.f26444c * gj0Var.d, f10 + f11, gj0Var.f26443b);
            } else {
                canvas.translate(this.f32756w, this.f32757x);
                this.f32755s.b(canvas);
            }
            canvas.restore();
            int i13 = this.f32758y;
            this.f32754r.setColor(-6182221);
            Drawable drawable = org.telegram.ui.ActionBar.h6.U4[i13][this.G];
            int dp = AndroidUtilities.dp(36.0f);
            org.telegram.ui.Cells.a0.p(((dp - drawable.getIntrinsicWidth()) / 2) + this.E, ((dp - drawable.getIntrinsicHeight()) / 2) + this.F, drawable);
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
        gj0 gj0Var = this.v;
        if (this.h != null) {
            this.f32756w = AndroidUtilities.dp(54.0f);
            this.E = AndroidUtilities.dp(10.0f);
            this.I = (getMeasuredWidth() - this.J) - AndroidUtilities.dp(16.0f);
            this.f32755s.j((getMeasuredWidth() - AndroidUtilities.dp(70.0f)) - this.J, AndroidUtilities.dp(30.0f));
            gj0Var.d = (getMeasuredWidth() - AndroidUtilities.dp(94.0f)) - this.J;
            gj0Var.f26445e = AndroidUtilities.dp(30.0f);
            this.f32757x = AndroidUtilities.dp(13.0f);
            this.F = AndroidUtilities.dp(10.0f);
            t();
            if (!z10 && this.f32752f) {
                return;
            }
            this.f32752f = true;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.v.a(Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.f32758y != 3) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xh0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void s() {
        gj0 gj0Var = this.v;
        String fileName = this.h.getFileName();
        if (FileLoader.getInstance(this.f32753n).getPathToMessage(this.h.messageOwner).exists()) {
            DownloadController.getInstance(this.f32753n).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.h);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.f32758y = 1;
            } else {
                this.f32758y = 0;
            }
            gj0Var.a(0.0f);
        } else {
            DownloadController.getInstance(this.f32753n).addLoadingFileObserver(fileName, this);
            if (!FileLoader.getInstance(this.f32753n).isLoadingFile(fileName)) {
                this.f32758y = 2;
                gj0Var.a(0.0f);
            } else {
                this.f32758y = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    gj0Var.a(fileProgress.floatValue());
                } else {
                    gj0Var.a(0.0f);
                }
            }
        }
        t();
    }

    public void setMessageObject(MessageObject messageObject) {
        if (this.h != messageObject) {
            this.f32753n = messageObject.currentAccount;
            mp0 mp0Var = this.f32755s;
            int i10 = org.telegram.ui.ActionBar.h6.f20882ud;
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.h6.f20936xd;
            mp0Var.h(x02, x03, org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20918wd, false));
            gj0 gj0Var = this.v;
            gj0Var.f26442a.setColor(-2497813);
            gj0Var.f26443b.setColor(-7944712);
            this.h = messageObject;
            this.f32752f = false;
            requestLayout();
        }
        s();
    }

    public final void t() {
        int i10;
        TextPaint textPaint = this.f32754r;
        MessageObject messageObject = this.h;
        if (messageObject == null) {
            return;
        }
        mp0 mp0Var = this.f32755s;
        if (!mp0Var.f28610e) {
            mp0Var.i(messageObject.audioProgress);
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
    public final void d(float f7) {
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
