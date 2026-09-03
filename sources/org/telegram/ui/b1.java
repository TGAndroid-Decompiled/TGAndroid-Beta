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
public final class b1 extends View implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.l9 {
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public final int G;
    public TL_iv.pageBlockAudio H;
    public TLRPC.Document I;
    public MessageObject J;
    public final o70 f35293a;
    public final j4 f35294b;
    public d3 f35295c;
    public d3 d;
    public final RadialProgress2 f35296e;
    public final org.telegram.ui.Components.go0 f35297f;
    public boolean h;
    public int f35298n;
    public final int f35299r;
    public int f35300s;
    public String v;
    public d3 f35301w;
    public StaticLayout f35302x;
    public int f35303y;

    public b1(Context context, o70 o70Var, j4 j4Var) {
        super(context);
        this.f35299r = AndroidUtilities.dp(58.0f);
        this.f35293a = o70Var;
        this.f35294b = j4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f35296e = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        this.G = DownloadController.getInstance(((l4) o70Var).U).generateObserverTag();
        org.telegram.ui.Components.go0 go0Var = new org.telegram.ui.Components.go0(this);
        this.f35297f = go0Var;
        go0Var.h = new a1(this, 0);
    }

    private int getIconForCurrentState() {
        int i10 = this.E;
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

    public final void a(boolean z4) {
        int i10 = ((l4) this.f35293a).U;
        String attachFileName = FileLoader.getAttachFileName(this.I);
        boolean exists = FileLoader.getInstance(i10).getPathToAttach(this.I, true).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f35296e;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (exists) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.J);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.E = 1;
            } else {
                this.E = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z4);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            if (!FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.E = 2;
                radialProgress2.o(0.0f, z4);
                radialProgress2.setIcon(getIconForCurrentState(), false, z4);
            } else {
                this.E = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    radialProgress2.o(fileProgress.floatValue(), z4);
                } else {
                    radialProgress2.o(0.0f, z4);
                }
                radialProgress2.setIcon(getIconForCurrentState(), true, z4);
            }
        }
        b();
    }

    public final void b() {
        MessageObject messageObject;
        int i10;
        if (this.I != null && (messageObject = this.J) != null) {
            org.telegram.ui.Components.go0 go0Var = this.f35297f;
            if (!go0Var.f27207e) {
                go0Var.i(messageObject.audioProgress);
            }
            if (MediaController.getInstance().isPlayingMessage(this.J)) {
                i10 = this.J.audioProgressSec;
            } else {
                i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= this.I.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.I.attributes.get(i11);
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
                TextPaint textPaint = l4.f38485b1;
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.f35302x = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            l4.f38485b1.setColor(this.f35293a.b());
            invalidate();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f35301w;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.f35295c;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
        d3 d3Var3 = this.d;
        if (d3Var3 != null) {
            arrayList.add(d3Var3);
        }
    }

    public MessageObject getMessageObject() {
        return this.J;
    }

    @Override
    public int getObserverTag() {
        return this.G;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        d3 d3Var = this.f35301w;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.f35295c;
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
        DownloadController.getInstance(((l4) this.f35293a).U).removeLoadingFileObserver(this);
        d3 d3Var = this.f35301w;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.f35295c;
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
        if (this.H == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.f21759ie;
        int i11 = org.telegram.ui.ActionBar.k6.f21776je;
        int i12 = org.telegram.ui.ActionBar.k6.f21969uc;
        int i13 = org.telegram.ui.ActionBar.k6.f21987vc;
        RadialProgress2 radialProgress2 = this.f35296e;
        radialProgress2.g(i10, i11, i12, i13);
        int i14 = org.telegram.ui.ActionBar.k6.Bd;
        o70 o70Var = this.f35293a;
        ((l4) o70Var).getClass();
        int i15 = 0;
        radialProgress2.d = org.telegram.ui.ActionBar.k6.w0(null, i14, false);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.f35303y, this.B);
        this.f35297f.b(canvas);
        canvas.restore();
        if (this.f35302x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.C, AndroidUtilities.dp(6.0f) + this.B);
            this.f35302x.draw(canvas);
            canvas.restore();
        }
        if (this.f35301w != null) {
            canvas.save();
            this.f35301w.f35964s = AndroidUtilities.dp(54.0f) + this.C;
            this.f35301w.v = this.B - AndroidUtilities.dp(16.0f);
            d3 d3Var = this.f35301w;
            canvas.translate(d3Var.f35964s, d3Var.v);
            l4.v(o70Var, canvas, this, 0);
            this.f35301w.draw(canvas, this);
            canvas.restore();
            i15 = 1;
        }
        d3 d3Var2 = this.f35295c;
        int i16 = this.f35299r;
        if (d3Var2 != null) {
            canvas.save();
            d3 d3Var3 = this.f35295c;
            int i17 = this.f35298n;
            d3Var3.f35964s = i17;
            d3Var3.v = i16;
            canvas.translate(i17, i16);
            l4.v(o70Var, canvas, this, i15);
            this.f35295c.draw(canvas, this);
            canvas.restore();
            i15++;
        }
        if (this.d != null) {
            canvas.save();
            d3 d3Var4 = this.d;
            int i18 = this.f35298n;
            d3Var4.f35964s = i18;
            int i19 = this.f35300s;
            d3Var4.v = i16 + i19;
            canvas.translate(i18, i16 + i19);
            l4.v(o70Var, canvas, this, i15);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, o70Var, this.H, getMeasuredHeight());
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
        a(true);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVAudio));
        if (this.f35301w != null) {
            sb.append(", ");
            sb.append(this.f35301w.d.getText());
        }
        if (this.f35295c != null) {
            sb.append(", ");
            sb.append(this.f35295c.d.getText());
        }
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        SpannableStringBuilder spannableStringBuilder;
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(54.0f);
        TL_iv.pageBlockAudio pageblockaudio = this.H;
        if (pageblockaudio != null) {
            int i13 = pageblockaudio.level;
            if (i13 > 0) {
                this.f35298n = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
            } else {
                this.f35298n = AndroidUtilities.dp(18.0f);
            }
            int dp2 = (size - this.f35298n) - AndroidUtilities.dp(18.0f);
            int dp3 = AndroidUtilities.dp(44.0f);
            this.C = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(5.0f);
            this.D = dp4;
            int i14 = this.C;
            this.f35296e.q(i14, dp4, i14 + dp3, dp4 + dp3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.H;
            d3 q10 = l4.q(this.f35293a, this, null, pageblockaudio2.caption.text, dp2, this.f35299r, pageblockaudio2, this.f35294b);
            this.f35295c = q10;
            if (q10 != null) {
                int height = this.f35295c.d.getHeight() + AndroidUtilities.dp(8.0f);
                this.f35300s = height;
                dp = org.telegram.messenger.y3.C(8.0f, height, dp);
            }
            i12 = dp;
            TL_iv.pageBlockAudio pageblockaudio3 = this.H;
            TL_iv.RichText richText = pageblockaudio3.caption.credit;
            int i15 = this.f35299r + this.f35300s;
            if (this.f35294b.D) {
                alignment = org.telegram.ui.Components.kw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            d3 p10 = l4.p(this.f35293a, this, null, richText, dp2, i15, pageblockaudio3, alignment2, 0, this.f35294b);
            this.d = p10;
            if (p10 != null) {
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
            }
            if (!this.h && this.H.level <= 0) {
                i12 += AndroidUtilities.dp(8.0f);
            }
            String musicAuthor = this.J.getMusicAuthor(false);
            String musicTitle = this.J.getMusicTitle(false);
            int C = org.telegram.messenger.y3.C(50.0f, this.C, dp3);
            this.f35303y = C;
            int dp5 = (size - C) - AndroidUtilities.dp(18.0f);
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.f35301w = null;
                this.B = ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.D;
            } else {
                if (!TextUtils.isEmpty(musicTitle) && !TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder = new SpannableStringBuilder(android.support.v4.media.a.z(musicAuthor, " - ", musicTitle));
                } else if (!TextUtils.isEmpty(musicTitle)) {
                    spannableStringBuilder = new SpannableStringBuilder(musicTitle);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(musicAuthor);
                }
                if (!TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.k6.O2, dp5, TextUtils.TruncateAt.END);
                d3 d3Var = new d3(this.f35293a);
                this.f35301w = d3Var;
                d3Var.d = new StaticLayout(ellipsize, l4.f38485b1, dp5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f35301w.f35962n = this.H;
                this.B = AndroidUtilities.dp(11.0f) + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.D;
            }
            this.f35297f.j(dp5, AndroidUtilities.dp(30.0f));
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
        b();
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f35296e.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.E != 3) {
            a(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f35296e.o(1.0f, true);
        a(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
