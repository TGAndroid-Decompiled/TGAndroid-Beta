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
public final class d1 extends View implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.j9 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public final int F;
    public TL_iv.pageBlockAudio G;
    public TLRPC.Document H;
    public MessageObject I;
    public final d70 f37257a;
    public final k4 f37258b;
    public f3 f37259c;
    public f3 d;
    public final RadialProgress2 f37260e;
    public final org.telegram.ui.Components.wn0 f37261f;
    public boolean h;
    public int f37262n;
    public final int f37263r;
    public int f37264s;
    public String v;
    public f3 f37265w;
    public StaticLayout f37266x;
    public int f37267y;

    public d1(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f37263r = AndroidUtilities.dp(58.0f);
        this.f37257a = d70Var;
        this.f37258b = k4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f37260e = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        this.F = DownloadController.getInstance(((m4) d70Var).T).generateObserverTag();
        org.telegram.ui.Components.wn0 wn0Var = new org.telegram.ui.Components.wn0(this);
        this.f37261f = wn0Var;
        wn0Var.h = new c1(this, 0);
    }

    private int getIconForCurrentState() {
        int i10 = this.D;
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
        int i10 = ((m4) this.f37257a).T;
        String attachFileName = FileLoader.getAttachFileName(this.H);
        boolean exists = FileLoader.getInstance(i10).getPathToAttach(this.H, true).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f37260e;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (exists) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.I);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.D = 1;
            } else {
                this.D = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            if (!FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.D = 2;
                radialProgress2.o(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            } else {
                this.D = 3;
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
        if (this.H != null && (messageObject = this.I) != null) {
            org.telegram.ui.Components.wn0 wn0Var = this.f37261f;
            if (!wn0Var.f34449e) {
                wn0Var.i(messageObject.audioProgress);
            }
            if (MediaController.getInstance().isPlayingMessage(this.I)) {
                i10 = this.I.audioProgressSec;
            } else {
                i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= this.H.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.H.attributes.get(i11);
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
                TextPaint textPaint = m4.f40366a1;
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.f37266x = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            m4.f40366a1.setColor(this.f37257a.b());
            invalidate();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f37265w;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.f37259c;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
        f3 f3Var3 = this.d;
        if (f3Var3 != null) {
            arrayList.add(f3Var3);
        }
    }

    public MessageObject getMessageObject() {
        return this.I;
    }

    @Override
    public int getObserverTag() {
        return this.F;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        f3 f3Var = this.f37265w;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.f37259c;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
        f3 f3Var3 = this.d;
        if (f3Var3 != null) {
            f3Var3.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(((m4) this.f37257a).T).removeLoadingFileObserver(this);
        f3 f3Var = this.f37265w;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.f37259c;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
        f3 f3Var3 = this.d;
        if (f3Var3 != null) {
            f3Var3.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.G == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.f23160ie;
        int i11 = org.telegram.ui.ActionBar.g6.f23178je;
        int i12 = org.telegram.ui.ActionBar.g6.f23371uc;
        int i13 = org.telegram.ui.ActionBar.g6.f23389vc;
        RadialProgress2 radialProgress2 = this.f37260e;
        radialProgress2.g(i10, i11, i12, i13);
        int i14 = org.telegram.ui.ActionBar.g6.Bd;
        d70 d70Var = this.f37257a;
        ((m4) d70Var).getClass();
        int i15 = 0;
        radialProgress2.d = org.telegram.ui.ActionBar.g6.w0(null, i14, false);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.f37267y, this.A);
        this.f37261f.b(canvas);
        canvas.restore();
        if (this.f37266x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.B, AndroidUtilities.dp(6.0f) + this.A);
            this.f37266x.draw(canvas);
            canvas.restore();
        }
        if (this.f37265w != null) {
            canvas.save();
            this.f37265w.f37974s = AndroidUtilities.dp(54.0f) + this.B;
            this.f37265w.v = this.A - AndroidUtilities.dp(16.0f);
            f3 f3Var = this.f37265w;
            canvas.translate(f3Var.f37974s, f3Var.v);
            m4.v(d70Var, canvas, this, 0);
            this.f37265w.draw(canvas, this);
            canvas.restore();
            i15 = 1;
        }
        f3 f3Var2 = this.f37259c;
        int i16 = this.f37263r;
        if (f3Var2 != null) {
            canvas.save();
            f3 f3Var3 = this.f37259c;
            int i17 = this.f37262n;
            f3Var3.f37974s = i17;
            f3Var3.v = i16;
            canvas.translate(i17, i16);
            m4.v(d70Var, canvas, this, i15);
            this.f37259c.draw(canvas, this);
            canvas.restore();
            i15++;
        }
        if (this.d != null) {
            canvas.save();
            f3 f3Var4 = this.d;
            int i18 = this.f37262n;
            f3Var4.f37974s = i18;
            int i19 = this.f37264s;
            f3Var4.v = i16 + i19;
            canvas.translate(i18, i16 + i19);
            m4.v(d70Var, canvas, this, i15);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        m4.u(canvas, d70Var, this.G, getMeasuredHeight());
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
        if (this.f37265w != null) {
            sb2.append(", ");
            sb2.append(this.f37265w.d.getText());
        }
        if (this.f37259c != null) {
            sb2.append(", ");
            sb2.append(this.f37259c.d.getText());
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
        TL_iv.pageBlockAudio pageblockaudio = this.G;
        if (pageblockaudio != null) {
            int i13 = pageblockaudio.level;
            if (i13 > 0) {
                this.f37262n = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
            } else {
                this.f37262n = AndroidUtilities.dp(18.0f);
            }
            int dp2 = (size - this.f37262n) - AndroidUtilities.dp(18.0f);
            int dp3 = AndroidUtilities.dp(44.0f);
            this.B = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(5.0f);
            this.C = dp4;
            int i14 = this.B;
            this.f37260e.q(i14, dp4, i14 + dp3, dp4 + dp3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.G;
            f3 q6 = m4.q(this.f37257a, this, null, pageblockaudio2.caption.text, dp2, this.f37263r, pageblockaudio2, this.f37258b);
            this.f37259c = q6;
            if (q6 != null) {
                int height = this.f37259c.d.getHeight() + AndroidUtilities.dp(8.0f);
                this.f37264s = height;
                dp = org.telegram.messenger.x3.C(8.0f, height, dp);
            }
            i12 = dp;
            TL_iv.pageBlockAudio pageblockaudio3 = this.G;
            TL_iv.RichText richText = pageblockaudio3.caption.credit;
            int i15 = this.f37263r + this.f37264s;
            if (this.f37258b.C) {
                alignment = org.telegram.ui.Components.bw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            f3 p10 = m4.p(this.f37257a, this, null, richText, dp2, i15, pageblockaudio3, alignment2, 0, this.f37258b);
            this.d = p10;
            if (p10 != null) {
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
            }
            if (!this.h && this.G.level <= 0) {
                i12 += AndroidUtilities.dp(8.0f);
            }
            String musicAuthor = this.I.getMusicAuthor(false);
            String musicTitle = this.I.getMusicTitle(false);
            int C = org.telegram.messenger.x3.C(50.0f, this.B, dp3);
            this.f37267y = C;
            int dp5 = (size - C) - AndroidUtilities.dp(18.0f);
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.f37265w = null;
                this.A = ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.C;
            } else {
                if (!TextUtils.isEmpty(musicTitle) && !TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder = new SpannableStringBuilder(a4.w.y(musicAuthor, " - ", musicTitle));
                } else if (!TextUtils.isEmpty(musicTitle)) {
                    spannableStringBuilder = new SpannableStringBuilder(musicTitle);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(musicAuthor);
                }
                if (!TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.t41(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.g6.O2, dp5, TextUtils.TruncateAt.END);
                f3 f3Var = new f3(this.f37257a);
                this.f37265w = f3Var;
                f3Var.d = new StaticLayout(ellipsize, m4.f40366a1, dp5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f37265w.f37972n = this.G;
                this.A = AndroidUtilities.dp(11.0f) + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.C;
            }
            this.f37261f.j(dp5, AndroidUtilities.dp(30.0f));
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
        b();
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f37260e.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.D != 3) {
            a(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f37260e.o(1.0f, true);
        a(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
