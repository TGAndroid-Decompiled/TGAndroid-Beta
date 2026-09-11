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
public final class a1 extends View implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.p9 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public TL_iv.pageBlockAudio K;
    public TLRPC.Document L;
    public MessageObject M;
    public final v70 f34278a;
    public final g4 f34279b;
    public b3 f34280c;
    public b3 d;
    public final RadialProgress2 f34281e;
    public final org.telegram.ui.Components.bo0 f34282f;
    public boolean h;
    public int f34283n;
    public final int f34284r;
    public int f34285s;
    public String v;
    public b3 f34286w;
    public StaticLayout f34287x;
    public int f34288y;

    public a1(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.f34284r = AndroidUtilities.dp(58.0f);
        this.f34278a = v70Var;
        this.f34279b = g4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f34281e = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        this.J = DownloadController.getInstance(((i4) v70Var).X).generateObserverTag();
        org.telegram.ui.Components.bo0 bo0Var = new org.telegram.ui.Components.bo0(this);
        this.f34282f = bo0Var;
        bo0Var.h = new z0(this, 0);
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
        int i10 = ((i4) this.f34278a).X;
        String attachFileName = FileLoader.getAttachFileName(this.L);
        boolean exists = FileLoader.getInstance(i10).getPathToAttach(this.L, true).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f34281e;
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
            org.telegram.ui.Components.bo0 bo0Var = this.f34282f;
            if (!bo0Var.f24757e) {
                bo0Var.i(messageObject.audioProgress);
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
                TextPaint textPaint = i4.f37191e1;
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.f34287x = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            i4.f37191e1.setColor(this.f34278a.b());
            invalidate();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f34286w;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        b3 b3Var2 = this.f34280c;
        if (b3Var2 != null) {
            arrayList.add(b3Var2);
        }
        b3 b3Var3 = this.d;
        if (b3Var3 != null) {
            arrayList.add(b3Var3);
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
        b3 b3Var = this.f34286w;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        b3 b3Var2 = this.f34280c;
        if (b3Var2 != null) {
            b3Var2.attach(this);
        }
        b3 b3Var3 = this.d;
        if (b3Var3 != null) {
            b3Var3.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(((i4) this.f34278a).X).removeLoadingFileObserver(this);
        b3 b3Var = this.f34286w;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        b3 b3Var2 = this.f34280c;
        if (b3Var2 != null) {
            b3Var2.detach(this);
        }
        b3 b3Var3 = this.d;
        if (b3Var3 != null) {
            b3Var3.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.K == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.f20761ie;
        int i11 = org.telegram.ui.ActionBar.j6.f20779je;
        int i12 = org.telegram.ui.ActionBar.j6.f20978uc;
        int i13 = org.telegram.ui.ActionBar.j6.f20995vc;
        RadialProgress2 radialProgress2 = this.f34281e;
        radialProgress2.g(i10, i11, i12, i13);
        int i14 = org.telegram.ui.ActionBar.j6.Bd;
        v70 v70Var = this.f34278a;
        ((i4) v70Var).getClass();
        int i15 = 0;
        radialProgress2.d = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.f34288y, this.E);
        this.f34282f.b(canvas);
        canvas.restore();
        if (this.f34287x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.F, AndroidUtilities.dp(6.0f) + this.E);
            this.f34287x.draw(canvas);
            canvas.restore();
        }
        if (this.f34286w != null) {
            canvas.save();
            this.f34286w.f34617s = AndroidUtilities.dp(54.0f) + this.F;
            this.f34286w.v = this.E - AndroidUtilities.dp(16.0f);
            b3 b3Var = this.f34286w;
            canvas.translate(b3Var.f34617s, b3Var.v);
            i4.v(v70Var, canvas, this, 0);
            this.f34286w.draw(canvas, this);
            canvas.restore();
            i15 = 1;
        }
        b3 b3Var2 = this.f34280c;
        int i16 = this.f34284r;
        if (b3Var2 != null) {
            canvas.save();
            b3 b3Var3 = this.f34280c;
            int i17 = this.f34283n;
            b3Var3.f34617s = i17;
            b3Var3.v = i16;
            canvas.translate(i17, i16);
            i4.v(v70Var, canvas, this, i15);
            this.f34280c.draw(canvas, this);
            canvas.restore();
            i15++;
        }
        if (this.d != null) {
            canvas.save();
            b3 b3Var4 = this.d;
            int i18 = this.f34283n;
            b3Var4.f34617s = i18;
            int i19 = this.f34285s;
            b3Var4.v = i16 + i19;
            canvas.translate(i18, i16 + i19);
            i4.v(v70Var, canvas, this, i15);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        i4.u(canvas, v70Var, this.K, getMeasuredHeight());
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
        if (this.f34286w != null) {
            sb2.append(", ");
            sb2.append(this.f34286w.d.getText());
        }
        if (this.f34280c != null) {
            sb2.append(", ");
            sb2.append(this.f34280c.d.getText());
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
                this.f34283n = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
            } else {
                this.f34283n = AndroidUtilities.dp(18.0f);
            }
            int dp2 = (size - this.f34283n) - AndroidUtilities.dp(18.0f);
            int dp3 = AndroidUtilities.dp(44.0f);
            this.F = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(5.0f);
            this.G = dp4;
            int i14 = this.F;
            this.f34281e.q(i14, dp4, i14 + dp3, dp4 + dp3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.K;
            b3 q6 = i4.q(this.f34278a, this, null, pageblockaudio2.caption.text, dp2, this.f34284r, pageblockaudio2, this.f34279b);
            this.f34280c = q6;
            if (q6 != null) {
                int height = this.f34280c.d.getHeight() + AndroidUtilities.dp(8.0f);
                this.f34285s = height;
                dp = org.telegram.messenger.w1.C(8.0f, height, dp);
            }
            i12 = dp;
            TL_iv.pageBlockAudio pageblockaudio3 = this.K;
            TL_iv.RichText richText = pageblockaudio3.caption.credit;
            int i15 = this.f34284r + this.f34285s;
            if (this.f34279b.G) {
                alignment = org.telegram.ui.Components.iw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            b3 p5 = i4.p(this.f34278a, this, null, richText, dp2, i15, pageblockaudio3, alignment2, 0, this.f34279b);
            this.d = p5;
            if (p5 != null) {
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
            }
            if (!this.h && this.K.level <= 0) {
                i12 += AndroidUtilities.dp(8.0f);
            }
            String musicAuthor = this.M.getMusicAuthor(false);
            String musicTitle = this.M.getMusicTitle(false);
            int C = org.telegram.messenger.w1.C(50.0f, this.F, dp3);
            this.f34288y = C;
            int dp5 = (size - C) - AndroidUtilities.dp(18.0f);
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.f34286w = null;
                this.E = ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.G;
            } else {
                if (!TextUtils.isEmpty(musicTitle) && !TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder = new SpannableStringBuilder(a4.a.C(musicAuthor, " - ", musicTitle));
                } else if (!TextUtils.isEmpty(musicTitle)) {
                    spannableStringBuilder = new SpannableStringBuilder(musicTitle);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(musicAuthor);
                }
                if (!TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.j6.O2, dp5, TextUtils.TruncateAt.END);
                b3 b3Var = new b3(this.f34278a);
                this.f34286w = b3Var;
                b3Var.d = new StaticLayout(ellipsize, i4.f37191e1, dp5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f34286w.f34615n = this.K;
                this.E = AndroidUtilities.dp(11.0f) + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.G;
            }
            this.f34282f.j(dp5, AndroidUtilities.dp(30.0f));
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
        b();
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.f34281e.o(Math.min(1.0f, ((float) j3) / ((float) j10)), true);
        if (this.H != 3) {
            a(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f34281e.o(1.0f, true);
        a(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
