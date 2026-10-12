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
public final class c1 extends View implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.n9 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public TL_iv.pageBlockAudio K;
    public TLRPC.Document L;
    public MessageObject M;
    public final z70 f34654a;
    public final i4 f34655b;
    public d3 f34656c;
    public d3 d;
    public final RadialProgress2 e;
    public final org.telegram.ui.Components.cp0 f34657f;
    public boolean h;
    public int f34658n;
    public final int f34659r;
    public int f34660s;
    public String v;
    public d3 f34661w;
    public StaticLayout f34662x;
    public int f34663y;

    public c1(Context context, z70 z70Var, i4 i4Var) {
        super(context);
        this.f34659r = AndroidUtilities.dp(58.0f);
        this.f34654a = z70Var;
        this.f34655b = i4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.e = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        this.J = DownloadController.getInstance(((k4) z70Var).X).generateObserverTag();
        org.telegram.ui.Components.cp0 cp0Var = new org.telegram.ui.Components.cp0(this);
        this.f34657f = cp0Var;
        cp0Var.h = new b1(this, 0);
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
        int i10 = ((k4) this.f34654a).X;
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
                radialProgress2.o(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            } else {
                this.H = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    radialProgress2.o(fileProgress.floatValue(), z10);
                } else {
                    radialProgress2.o(0.0f, z10);
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
            org.telegram.ui.Components.cp0 cp0Var = this.f34657f;
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
                TextPaint textPaint = k4.f37516e1;
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.f34662x = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            k4.f37516e1.setColor(this.f34654a.b());
            invalidate();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f34661w;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.f34656c;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
        d3 d3Var3 = this.d;
        if (d3Var3 != null) {
            arrayList.add(d3Var3);
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
        d3 d3Var = this.f34661w;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.f34656c;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
        d3 d3Var3 = this.d;
        if (d3Var3 != null) {
            d3Var3.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(((k4) this.f34654a).X).removeLoadingFileObserver(this);
        d3 d3Var = this.f34661w;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.f34656c;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
        d3 d3Var3 = this.d;
        if (d3Var3 != null) {
            d3Var3.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.K == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.f19997ie;
        int i11 = org.telegram.ui.ActionBar.g6.f20016je;
        int i12 = org.telegram.ui.ActionBar.g6.f20221uc;
        int i13 = org.telegram.ui.ActionBar.g6.f20239vc;
        RadialProgress2 radialProgress2 = this.e;
        radialProgress2.g(i10, i11, i12, i13);
        int i14 = org.telegram.ui.ActionBar.g6.Bd;
        z70 z70Var = this.f34654a;
        ((k4) z70Var).getClass();
        int i15 = 0;
        radialProgress2.d = org.telegram.ui.ActionBar.g6.x0(null, i14, false);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.f34663y, this.E);
        this.f34657f.b(canvas);
        canvas.restore();
        if (this.f34662x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.F, AndroidUtilities.dp(6.0f) + this.E);
            this.f34662x.draw(canvas);
            canvas.restore();
        }
        if (this.f34661w != null) {
            canvas.save();
            this.f34661w.f35132s = AndroidUtilities.dp(54.0f) + this.F;
            this.f34661w.v = this.E - AndroidUtilities.dp(16.0f);
            d3 d3Var = this.f34661w;
            canvas.translate(d3Var.f35132s, d3Var.v);
            k4.v(z70Var, canvas, this, 0);
            this.f34661w.draw(canvas, this);
            canvas.restore();
            i15 = 1;
        }
        d3 d3Var2 = this.f34656c;
        int i16 = this.f34659r;
        if (d3Var2 != null) {
            canvas.save();
            d3 d3Var3 = this.f34656c;
            int i17 = this.f34658n;
            d3Var3.f35132s = i17;
            d3Var3.v = i16;
            canvas.translate(i17, i16);
            k4.v(z70Var, canvas, this, i15);
            this.f34656c.draw(canvas, this);
            canvas.restore();
            i15++;
        }
        if (this.d != null) {
            canvas.save();
            d3 d3Var4 = this.d;
            int i18 = this.f34658n;
            d3Var4.f35132s = i18;
            int i19 = this.f34660s;
            d3Var4.v = i16 + i19;
            canvas.translate(i18, i16 + i19);
            k4.v(z70Var, canvas, this, i15);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        k4.u(canvas, z70Var, this.K, getMeasuredHeight());
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
        if (this.f34661w != null) {
            sb2.append(", ");
            sb2.append(this.f34661w.d.getText());
        }
        if (this.f34656c != null) {
            sb2.append(", ");
            sb2.append(this.f34656c.d.getText());
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
                this.f34658n = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
            } else {
                this.f34658n = AndroidUtilities.dp(18.0f);
            }
            int dp2 = (size - this.f34658n) - AndroidUtilities.dp(18.0f);
            int dp3 = AndroidUtilities.dp(44.0f);
            this.F = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(5.0f);
            this.G = dp4;
            int i14 = this.F;
            this.e.q(i14, dp4, i14 + dp3, dp4 + dp3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.K;
            d3 q6 = k4.q(this.f34654a, this, null, pageblockaudio2.caption.text, dp2, this.f34659r, pageblockaudio2, this.f34655b);
            this.f34656c = q6;
            if (q6 != null) {
                int height = this.f34656c.d.getHeight() + AndroidUtilities.dp(8.0f);
                this.f34660s = height;
                dp = org.telegram.messenger.yh.c(8.0f, height, dp);
            }
            i12 = dp;
            TL_iv.pageBlockAudio pageblockaudio3 = this.K;
            TL_iv.RichText richText = pageblockaudio3.caption.credit;
            int i15 = this.f34659r + this.f34660s;
            if (this.f34655b.G) {
                alignment = org.telegram.ui.Components.ix0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            d3 p5 = k4.p(this.f34654a, this, null, richText, dp2, i15, pageblockaudio3, alignment2, 0, this.f34655b);
            this.d = p5;
            if (p5 != null) {
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
            }
            if (!this.h && this.K.level <= 0) {
                i12 += AndroidUtilities.dp(8.0f);
            }
            String musicAuthor = this.M.getMusicAuthor(false);
            String musicTitle = this.M.getMusicTitle(false);
            int c10 = org.telegram.messenger.yh.c(50.0f, this.F, dp3);
            this.f34663y = c10;
            int dp5 = (size - c10) - AndroidUtilities.dp(18.0f);
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.f34661w = null;
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
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.g6.O2, dp5, TextUtils.TruncateAt.END);
                d3 d3Var = new d3(this.f34654a);
                this.f34661w = d3Var;
                d3Var.d = new StaticLayout(ellipsize, k4.f37516e1, dp5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f34661w.f35130n = this.K;
                this.E = AndroidUtilities.dp(11.0f) + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.G;
            }
            this.f34657f.j(dp5, AndroidUtilities.dp(30.0f));
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
        b();
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.e.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.H != 3) {
            a(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.e.o(1.0f, true);
        a(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
