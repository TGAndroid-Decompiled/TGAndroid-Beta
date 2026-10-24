package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
public final class b1 extends View implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.n9 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public TL_iv.pageBlockAudio K;
    public TLRPC.Document L;
    public MessageObject M;
    public final f70 f35878a;
    public final i4 f35879b;
    public c3 f35880c;
    public c3 d;
    public final RadialProgress2 e;
    public final org.telegram.ui.Components.cp0 f35881f;
    public boolean h;
    public int f35882n;
    public final int f35883r;
    public int f35884s;
    public String v;
    public c3 f35885w;
    public StaticLayout f35886x;
    public int f35887y;

    public b1(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.f35883r = AndroidUtilities.dp(58.0f);
        this.f35878a = f70Var;
        this.f35879b = i4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.e = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        this.J = DownloadController.getInstance(((k4) f70Var).X).generateObserverTag();
        org.telegram.ui.Components.cp0 cp0Var = new org.telegram.ui.Components.cp0(this);
        this.f35881f = cp0Var;
        cp0Var.h = new a1(this, 0);
    }

    private int getIconForCurrentState() {
        int i10 = this.H;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 3) {
            return 3;
        }
        return 0;
    }

    public final void a(boolean z10) {
        int i10 = ((k4) this.f35878a).X;
        String attachFileName = FileLoader.getAttachFileName(this.L);
        boolean exists = FileLoader.getInstance(i10).getPathToAttach(this.L, true).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.e;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (exists) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.M);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.H = 1;
            } else {
                this.H = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            if (!FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.H = 2;
                radialProgress2.p(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            } else {
                this.H = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    radialProgress2.p(fileProgress.floatValue(), z10);
                } else {
                    radialProgress2.p(0.0f, z10);
                }
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            }
        }
        b();
    }

    public final void b() {
        MessageObject messageObject;
        int i10;
        if (this.L != null && (messageObject = this.M) != null) {
            org.telegram.ui.Components.cp0 cp0Var = this.f35881f;
            if (!cp0Var.e) {
                cp0Var.i(messageObject.audioProgress);
            }
            if (MediaController.getInstance().isPlayingMessage(this.M)) {
                i10 = this.M.audioProgressSec;
            } else {
                i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= this.L.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.L.attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        i10 = (int) documentAttribute.duration;
                        break;
                    }
                    i11++;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
            String str = this.v;
            if (str == null || !str.equals(formatShortDuration)) {
                this.v = formatShortDuration;
                TextPaint textPaint = k4.f38733f1;
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.f35886x = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            k4.f38733f1.setColor(this.f35878a.b());
            invalidate();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f35885w;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
        c3 c3Var2 = this.f35880c;
        if (c3Var2 != null) {
            arrayList.add(c3Var2);
        }
        c3 c3Var3 = this.d;
        if (c3Var3 != null) {
            arrayList.add(c3Var3);
        }
    }

    public MessageObject getMessageObject() {
        return this.M;
    }

    @Override
    public int getObserverTag() {
        return this.J;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        c3 c3Var = this.f35885w;
        if (c3Var != null) {
            c3Var.attach(this);
        }
        c3 c3Var2 = this.f35880c;
        if (c3Var2 != null) {
            c3Var2.attach(this);
        }
        c3 c3Var3 = this.d;
        if (c3Var3 != null) {
            c3Var3.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(((k4) this.f35878a).X).removeLoadingFileObserver(this);
        c3 c3Var = this.f35885w;
        if (c3Var != null) {
            c3Var.detach(this);
        }
        c3 c3Var2 = this.f35880c;
        if (c3Var2 != null) {
            c3Var2.detach(this);
        }
        c3 c3Var3 = this.d;
        if (c3Var3 != null) {
            c3Var3.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.K == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.f21280ie;
        int i11 = org.telegram.ui.ActionBar.k6.f21299je;
        int i12 = org.telegram.ui.ActionBar.k6.f21505uc;
        int i13 = org.telegram.ui.ActionBar.k6.f21523vc;
        RadialProgress2 radialProgress2 = this.e;
        radialProgress2.g(i10, i11, i12, i13);
        int i14 = org.telegram.ui.ActionBar.k6.Bd;
        f70 f70Var = this.f35878a;
        ((k4) f70Var).getClass();
        int i15 = 0;
        radialProgress2.d = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.f35887y, this.E);
        int i16 = org.telegram.ui.ActionBar.k6.f21506ud;
        ((k4) f70Var).getClass();
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i16, false);
        int i17 = org.telegram.ui.ActionBar.k6.f21524vd;
        ((k4) f70Var).getClass();
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i17, false);
        int i18 = org.telegram.ui.ActionBar.k6.f21561xd;
        ((k4) f70Var).getClass();
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, i18, false);
        ((k4) f70Var).getClass();
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, i18, false);
        int i19 = org.telegram.ui.ActionBar.k6.f21542wd;
        ((k4) f70Var).getClass();
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, i19, false);
        org.telegram.ui.Components.cp0 cp0Var = this.f35881f;
        cp0Var.h(x02, x03, x04, x05, x06);
        cp0Var.b(canvas);
        canvas.restore();
        if (this.f35886x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.F, AndroidUtilities.dp(6.0f) + this.E);
            this.f35886x.draw(canvas);
            canvas.restore();
        }
        if (this.f35885w != null) {
            canvas.save();
            this.f35885w.f36208s = AndroidUtilities.dp(54.0f) + this.F;
            this.f35885w.v = this.E - AndroidUtilities.dp(16.0f);
            c3 c3Var = this.f35885w;
            canvas.translate(c3Var.f36208s, c3Var.v);
            k4.v(f70Var, canvas, this, 0);
            this.f35885w.draw(canvas, this);
            canvas.restore();
            i15 = 1;
        }
        c3 c3Var2 = this.f35880c;
        int i20 = this.f35883r;
        if (c3Var2 != null) {
            canvas.save();
            c3 c3Var3 = this.f35880c;
            int i21 = this.f35882n;
            c3Var3.f36208s = i21;
            c3Var3.v = i20;
            canvas.translate(i21, i20);
            k4.v(f70Var, canvas, this, i15);
            this.f35880c.draw(canvas, this);
            canvas.restore();
            i15++;
        }
        if (this.d != null) {
            canvas.save();
            c3 c3Var4 = this.d;
            int i22 = this.f35882n;
            c3Var4.f36208s = i22;
            int i23 = this.f35884s;
            c3Var4.v = i20 + i23;
            canvas.translate(i22, i20 + i23);
            k4.v(f70Var, canvas, this, i15);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        k4.u(canvas, f70Var, this.K, getMeasuredHeight());
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        a(true);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVAudio));
        if (this.f35885w != null) {
            sb2.append(", ");
            sb2.append(this.f35885w.d.getText());
        }
        if (this.f35880c != null) {
            sb2.append(", ");
            sb2.append(this.f35880c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        SpannableStringBuilder spannableStringBuilder;
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(54.0f);
        TL_iv.pageBlockAudio pageblockaudio = this.K;
        if (pageblockaudio != null) {
            int i13 = pageblockaudio.level;
            if (i13 > 0) {
                this.f35882n = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
            } else {
                this.f35882n = AndroidUtilities.dp(18.0f);
            }
            int dp2 = (size - this.f35882n) - AndroidUtilities.dp(18.0f);
            int dp3 = AndroidUtilities.dp(44.0f);
            this.F = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(5.0f);
            this.G = dp4;
            int i14 = this.F;
            this.e.r(i14, dp4, i14 + dp3, dp4 + dp3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.K;
            c3 q6 = k4.q(this.f35878a, this, null, pageblockaudio2.caption.text, dp2, this.f35883r, pageblockaudio2, this.f35879b);
            this.f35880c = q6;
            if (q6 != null) {
                int height = this.f35880c.d.getHeight() + AndroidUtilities.dp(8.0f);
                this.f35884s = height;
                dp = org.telegram.messenger.v0.C(8.0f, height, dp);
            }
            i12 = dp;
            TL_iv.pageBlockAudio pageblockaudio3 = this.K;
            TL_iv.RichText richText = pageblockaudio3.caption.credit;
            int i15 = this.f35883r + this.f35884s;
            if (this.f35879b.G) {
                alignment = org.telegram.ui.Components.hx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            c3 p5 = k4.p(this.f35878a, this, null, richText, dp2, i15, pageblockaudio3, alignment2, 0, this.f35879b);
            this.d = p5;
            if (p5 != null) {
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
            }
            if (!this.h && this.K.level <= 0) {
                i12 += AndroidUtilities.dp(8.0f);
            }
            String musicAuthor = this.M.getMusicAuthor(false);
            String musicTitle = this.M.getMusicTitle(false);
            int C = org.telegram.messenger.v0.C(50.0f, this.F, dp3);
            this.f35887y = C;
            int dp5 = (size - C) - AndroidUtilities.dp(18.0f);
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.f35885w = null;
                this.E = ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.G;
            } else {
                if (!TextUtils.isEmpty(musicTitle) && !TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder = new SpannableStringBuilder(a1.g.D(musicAuthor, " - ", musicTitle));
                } else if (!TextUtils.isEmpty(musicTitle)) {
                    spannableStringBuilder = new SpannableStringBuilder(musicTitle);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(musicAuthor);
                }
                if (!TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.i61(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.k6.O2, dp5, TextUtils.TruncateAt.END);
                c3 c3Var = new c3(this.f35878a);
                this.f35885w = c3Var;
                c3Var.d = new StaticLayout(ellipsize, k4.f38733f1, dp5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f35885w.f36206n = this.K;
                this.E = AndroidUtilities.dp(11.0f) + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.G;
            }
            this.f35881f.j(dp5, AndroidUtilities.dp(30.0f));
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
        b();
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.e.p(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.H != 3) {
            a(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.e.p(1.0f, true);
        a(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
