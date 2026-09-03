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
public final class d1 extends View implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.k9 {
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public final int G;
    public TL_iv.pageBlockAudio H;
    public TLRPC.Document I;
    public MessageObject J;
    public final p70 f33285a;
    public final l4 f33286b;
    public f3 f33287c;
    public f3 d;
    public final RadialProgress2 e;
    public final org.telegram.ui.Components.fo0 f33288f;
    public boolean h;
    public int f33289n;
    public final int f33290r;
    public int f33291s;
    public String v;
    public f3 f33292w;
    public StaticLayout f33293x;
    public int f33294y;

    public d1(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.f33290r = AndroidUtilities.dp(58.0f);
        this.f33285a = p70Var;
        this.f33286b = l4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.e = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        this.G = DownloadController.getInstance(((n4) p70Var).U).generateObserverTag();
        org.telegram.ui.Components.fo0 fo0Var = new org.telegram.ui.Components.fo0(this);
        this.f33288f = fo0Var;
        fo0Var.h = new c1(this, 0);
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
        int i10 = ((n4) this.f33285a).U;
        String attachFileName = FileLoader.getAttachFileName(this.I);
        boolean exists = FileLoader.getInstance(i10).getPathToAttach(this.I, true).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.e;
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
            org.telegram.ui.Components.fo0 fo0Var = this.f33288f;
            if (!fo0Var.e) {
                fo0Var.i(messageObject.audioProgress);
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
                TextPaint textPaint = n4.f36336b1;
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.f33293x = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            n4.f36336b1.setColor(this.f33285a.b());
            invalidate();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f33292w;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.f33287c;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
        f3 f3Var3 = this.d;
        if (f3Var3 != null) {
            arrayList.add(f3Var3);
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
        f3 f3Var = this.f33292w;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.f33287c;
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
        DownloadController.getInstance(((n4) this.f33285a).U).removeLoadingFileObserver(this);
        f3 f3Var = this.f33292w;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.f33287c;
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
        if (this.H == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.f19978ie;
        int i11 = org.telegram.ui.ActionBar.j6.f19995je;
        int i12 = org.telegram.ui.ActionBar.j6.f20188uc;
        int i13 = org.telegram.ui.ActionBar.j6.f20206vc;
        RadialProgress2 radialProgress2 = this.e;
        radialProgress2.g(i10, i11, i12, i13);
        int i14 = org.telegram.ui.ActionBar.j6.Bd;
        p70 p70Var = this.f33285a;
        ((n4) p70Var).getClass();
        int i15 = 0;
        radialProgress2.d = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.f33294y, this.B);
        this.f33288f.b(canvas);
        canvas.restore();
        if (this.f33293x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.C, AndroidUtilities.dp(6.0f) + this.B);
            this.f33293x.draw(canvas);
            canvas.restore();
        }
        if (this.f33292w != null) {
            canvas.save();
            this.f33292w.f33933s = AndroidUtilities.dp(54.0f) + this.C;
            this.f33292w.v = this.B - AndroidUtilities.dp(16.0f);
            f3 f3Var = this.f33292w;
            canvas.translate(f3Var.f33933s, f3Var.v);
            n4.v(p70Var, canvas, this, 0);
            this.f33292w.draw(canvas, this);
            canvas.restore();
            i15 = 1;
        }
        f3 f3Var2 = this.f33287c;
        int i16 = this.f33290r;
        if (f3Var2 != null) {
            canvas.save();
            f3 f3Var3 = this.f33287c;
            int i17 = this.f33289n;
            f3Var3.f33933s = i17;
            f3Var3.v = i16;
            canvas.translate(i17, i16);
            n4.v(p70Var, canvas, this, i15);
            this.f33287c.draw(canvas, this);
            canvas.restore();
            i15++;
        }
        if (this.d != null) {
            canvas.save();
            f3 f3Var4 = this.d;
            int i18 = this.f33289n;
            f3Var4.f33933s = i18;
            int i19 = this.f33291s;
            f3Var4.v = i16 + i19;
            canvas.translate(i18, i16 + i19);
            n4.v(p70Var, canvas, this, i15);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        n4.u(canvas, p70Var, this.H, getMeasuredHeight());
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
        if (this.f33292w != null) {
            sb.append(", ");
            sb.append(this.f33292w.d.getText());
        }
        if (this.f33287c != null) {
            sb.append(", ");
            sb.append(this.f33287c.d.getText());
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
                this.f33289n = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
            } else {
                this.f33289n = AndroidUtilities.dp(18.0f);
            }
            int dp2 = (size - this.f33289n) - AndroidUtilities.dp(18.0f);
            int dp3 = AndroidUtilities.dp(44.0f);
            this.C = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(5.0f);
            this.D = dp4;
            int i14 = this.C;
            this.e.q(i14, dp4, i14 + dp3, dp4 + dp3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.H;
            f3 q10 = n4.q(this.f33285a, this, null, pageblockaudio2.caption.text, dp2, this.f33290r, pageblockaudio2, this.f33286b);
            this.f33287c = q10;
            if (q10 != null) {
                int height = this.f33287c.d.getHeight() + AndroidUtilities.dp(8.0f);
                this.f33291s = height;
                dp = org.telegram.messenger.y3.C(8.0f, height, dp);
            }
            i12 = dp;
            TL_iv.pageBlockAudio pageblockaudio3 = this.H;
            TL_iv.RichText richText = pageblockaudio3.caption.credit;
            int i15 = this.f33290r + this.f33291s;
            if (this.f33286b.D) {
                alignment = org.telegram.ui.Components.kw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            f3 p10 = n4.p(this.f33285a, this, null, richText, dp2, i15, pageblockaudio3, alignment2, 0, this.f33286b);
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
            this.f33294y = C;
            int dp5 = (size - C) - AndroidUtilities.dp(18.0f);
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.f33292w = null;
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
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.f51(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.j6.O2, dp5, TextUtils.TruncateAt.END);
                f3 f3Var = new f3(this.f33285a);
                this.f33292w = f3Var;
                f3Var.d = new StaticLayout(ellipsize, n4.f36336b1, dp5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f33292w.f33931n = this.H;
                this.B = AndroidUtilities.dp(11.0f) + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.D;
            }
            this.f33288f.j(dp5, AndroidUtilities.dp(30.0f));
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
        b();
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.e.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.E != 3) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
