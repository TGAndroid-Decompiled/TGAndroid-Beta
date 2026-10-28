package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class m10 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final boolean f30333a;
    public final CharSequence f30334b;
    public final l10 f30335c;
    public final b6 d;
    public final b6 e;
    public final n10 f30336f;

    public m10(n10 n10Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        CharSequence spannableStringBuilder;
        float f7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var;
        this.f30336f = n10Var;
        this.f30333a = z10;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f30082a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        view.f30083b = textPaint2;
        Paint paint = new Paint(1);
        view.f30084c = paint;
        view.d = new Path();
        float[] fArr = new float[8];
        view.e = fArr;
        Paint paint2 = new Paint(1);
        view.v = paint2;
        Paint paint3 = new Paint(1);
        view.f30089w = paint3;
        view.f30090x = new Matrix();
        view.f30091y = new Matrix();
        int i12 = org.telegram.ui.ActionBar.y6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.y6.o1(0.8f, org.telegram.ui.ActionBar.y6.x0(null, i12, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.y6.f23561o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Th, false));
        r6 r6Var = new r6(false, true, true);
        view.E = r6Var;
        r6Var.n(0.3f, 250L, ds.h);
        r6Var.setCallback(view);
        r6Var.w(AndroidUtilities.dp(11.66f));
        r6Var.u(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false));
        r6Var.x(AndroidUtilities.bold());
        r6Var.f32142b = 1;
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.8f, org.telegram.ui.ActionBar.y6.x0(null, i12, false));
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i13, false);
        if (string != null) {
            f7 = 15.33f;
            r11 r11Var = new r11(l10.a(string), 15.33f, AndroidUtilities.bold());
            r11Var.s(view);
            r11Var.f32088a.setColor(o12);
            view.f30085f = r11Var;
        } else {
            f7 = 15.33f;
        }
        CharSequence a2 = l10.a(spannableStringBuilder);
        r11 r11Var2 = new r11(a2, f7, AndroidUtilities.bold());
        r11Var2.s(view);
        TextPaint textPaint3 = r11Var2.f32088a;
        textPaint3.setColor(x02);
        view.h = r11Var2;
        r11Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        if (z11) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        r11Var2.p(i10);
        if (string2 != null) {
            r11 r11Var3 = new r11(l10.a(string2), 15.33f, AndroidUtilities.bold());
            r11Var3.s(view);
            r11Var3.f32088a.setColor(o12);
            view.f30086n = r11Var3;
        }
        float dp = AndroidUtilities.dp(3.0f);
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        float dp2 = AndroidUtilities.dp(1.0f);
        fArr[7] = dp2;
        fArr[6] = dp2;
        fArr[5] = dp2;
        fArr[4] = dp2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, tileMode);
        view.f30087r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.f30088s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f30335c = view;
        addView((View) view, kb1.h(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        b6 b6Var = new b6(context);
        this.d = b6Var;
        int i14 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(b6Var, i14, null);
        b6Var.setTextSize(1, 20.0f);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setGravity(17);
        b6Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), b6Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.f30334b = replaceEmoji;
        this.f30334b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, b6Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        b6Var.setText(n10Var.y());
        if (z11) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        b6Var.setCacheType(i11);
        int i15 = org.telegram.ui.ActionBar.y6.Oh;
        u6Var = ((org.telegram.ui.ActionBar.k3) n10Var).resourcesProvider;
        b6Var.setEmojiColor(org.telegram.ui.ActionBar.y6.w0(i15, u6Var));
        addView(b6Var, kb1.h(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        b6 b6Var2 = new b6(context);
        this.e = b6Var2;
        org.telegram.ui.ActionBar.f7.V(b6Var2, i14, null);
        b6Var2.setTextSize(1, 14.0f);
        b6Var2.setLines(2);
        b6Var2.setGravity(17);
        b6Var2.setLineSpacing(0.0f, 1.15f);
        addView(b6Var2, kb1.h(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i10;
        String str;
        int i11;
        n10 n10Var = this.f30336f;
        ArrayList arrayList = n10Var.f30704g0;
        boolean z10 = n10Var.f30699b0;
        CharSequence charSequence = this.f30334b;
        b6 b6Var = this.e;
        if (z10) {
            b6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
        } else if (this.f30333a) {
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            l10 l10Var = this.f30335c;
            r6 r6Var = l10Var.E;
            if (i10 > 0) {
                str = ic.a.i(i10, "+");
            } else {
                str = "";
            }
            r6Var.t(str, false, true);
            l10Var.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i11 = arrayList.size();
                } else {
                    i11 = 0;
                }
                b6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", i11, charSequence)));
                return;
            }
            b6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            b6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, charSequence)));
        } else {
            b6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.u6 u6Var;
        try {
            b6 b6Var = this.d;
            if (b6Var != null) {
                int i10 = org.telegram.ui.ActionBar.y6.Oh;
                u6Var = ((org.telegram.ui.ActionBar.k3) this.f30336f).resourcesProvider;
                b6Var.setEmojiColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
