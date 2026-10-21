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
public final class mh0 extends org.telegram.ui.Cells.a0 implements yo0, DownloadController.FileDownloadProgressListener {
    public int E;
    public int F;
    public int G;
    public StaticLayout H;
    public int I;
    public int J;
    public int K;
    public boolean f28517f;
    public MessageObject h;
    public int f28518n;
    public TextPaint f28519r;
    public zo0 f28520s;
    public vi0 v;
    public int f28521w;
    public int f28522x;
    public int f28523y;

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
        DownloadController.getInstance(this.f28518n).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f28517f) {
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
            org.telegram.ui.ActionBar.h6.f21225q3.n((int) getY(), i11, i10);
            org.telegram.ui.ActionBar.f5 f5Var = org.telegram.ui.ActionBar.h6.f21225q3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (f5Var != null) {
                f5Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            org.telegram.ui.ActionBar.h6.f21225q3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            int i12 = this.f28523y;
            if (i12 != 0 && i12 != 1) {
                canvas.translate(AndroidUtilities.dp(12.0f) + this.f28521w, this.f28522x);
                vi0 vi0Var = this.v;
                float f7 = vi0Var.e / 2;
                float f10 = vi0Var.f31263f / 2.0f;
                canvas.drawRect(0.0f, f7 - f10, vi0Var.d, f10 + f7, vi0Var.f31260a);
                float f11 = vi0Var.e / 2;
                canvas.drawRect(0.0f, f11 - f10, vi0Var.f31262c * vi0Var.d, f10 + f11, vi0Var.f31261b);
            } else {
                canvas.translate(this.f28521w, this.f28522x);
                this.f28520s.b(canvas);
            }
            canvas.restore();
            int i13 = this.f28523y;
            this.f28519r.setColor(-6182221);
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
        s();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        vi0 vi0Var = this.v;
        if (this.h != null) {
            this.f28521w = AndroidUtilities.dp(54.0f);
            this.E = AndroidUtilities.dp(10.0f);
            this.I = (getMeasuredWidth() - this.J) - AndroidUtilities.dp(16.0f);
            this.f28520s.j((getMeasuredWidth() - AndroidUtilities.dp(70.0f)) - this.J, AndroidUtilities.dp(30.0f));
            vi0Var.d = (getMeasuredWidth() - AndroidUtilities.dp(94.0f)) - this.J;
            vi0Var.e = AndroidUtilities.dp(30.0f);
            this.f28522x = AndroidUtilities.dp(13.0f);
            this.F = AndroidUtilities.dp(10.0f);
            t();
            if (!z10 && this.f28517f) {
                return;
            }
            this.f28517f = true;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.v.a(Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.f28523y != 3) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mh0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void s() {
        vi0 vi0Var = this.v;
        String fileName = this.h.getFileName();
        if (FileLoader.getInstance(this.f28518n).getPathToMessage(this.h.messageOwner).exists()) {
            DownloadController.getInstance(this.f28518n).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.h);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.f28523y = 1;
            } else {
                this.f28523y = 0;
            }
            vi0Var.a(0.0f);
        } else {
            DownloadController.getInstance(this.f28518n).addLoadingFileObserver(fileName, this);
            if (!FileLoader.getInstance(this.f28518n).isLoadingFile(fileName)) {
                this.f28523y = 2;
                vi0Var.a(0.0f);
            } else {
                this.f28523y = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    vi0Var.a(fileProgress.floatValue());
                } else {
                    vi0Var.a(0.0f);
                }
            }
        }
        t();
    }

    public void setMessageObject(MessageObject messageObject) {
        if (this.h != messageObject) {
            this.f28518n = messageObject.currentAccount;
            zo0 zo0Var = this.f28520s;
            int i10 = org.telegram.ui.ActionBar.h6.f21312ud;
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.h6.f21367xd;
            zo0Var.h(x02, x03, org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21348wd, false));
            vi0 vi0Var = this.v;
            vi0Var.f31260a.setColor(-2497813);
            vi0Var.f31261b.setColor(-7944712);
            this.h = messageObject;
            this.f28517f = false;
            requestLayout();
        }
        s();
    }

    public final void t() {
        int i10;
        TextPaint textPaint = this.f28519r;
        MessageObject messageObject = this.h;
        if (messageObject == null) {
            return;
        }
        zo0 zo0Var = this.f28520s;
        if (!zo0Var.e) {
            zo0Var.i(messageObject.audioProgress);
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
