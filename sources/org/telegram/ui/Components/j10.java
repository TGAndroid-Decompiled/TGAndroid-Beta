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
public final class j10 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final boolean f27484a;
    public final CharSequence f27485b;
    public final i10 f27486c;
    public final z5 d;
    public final z5 e;
    public final k10 f27487f;

    public j10(k10 k10Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        CharSequence spannableStringBuilder;
        float f7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var;
        this.f27487f = k10Var;
        this.f27484a = z10;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f27152a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        view.f27153b = textPaint2;
        Paint paint = new Paint(1);
        view.f27154c = paint;
        view.d = new Path();
        float[] fArr = new float[8];
        view.e = fArr;
        Paint paint2 = new Paint(1);
        view.v = paint2;
        Paint paint3 = new Paint(1);
        view.f27159w = paint3;
        view.f27160x = new Matrix();
        view.f27161y = new Matrix();
        int i12 = org.telegram.ui.ActionBar.k6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.o1(0.8f, org.telegram.ui.ActionBar.k6.x0(null, i12, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.k6.f21386o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Th, false));
        p6 p6Var = new p6(false, true, true);
        view.E = p6Var;
        p6Var.n(0.3f, 250L, bs.h);
        p6Var.setCallback(view);
        p6Var.w(AndroidUtilities.dp(11.66f));
        p6Var.u(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false));
        p6Var.x(AndroidUtilities.bold());
        p6Var.f29437b = 1;
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.8f, org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        if (string != null) {
            f7 = 15.33f;
            i11 i11Var = new i11(i10.a(string), 15.33f, AndroidUtilities.bold());
            i11Var.s(view);
            i11Var.f27162a.setColor(o12);
            view.f27155f = i11Var;
        } else {
            f7 = 15.33f;
        }
        CharSequence a2 = i10.a(spannableStringBuilder);
        i11 i11Var2 = new i11(a2, f7, AndroidUtilities.bold());
        i11Var2.s(view);
        TextPaint textPaint3 = i11Var2.f27162a;
        textPaint3.setColor(x02);
        view.h = i11Var2;
        i11Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        if (z11) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        i11Var2.p(i10);
        if (string2 != null) {
            i11 i11Var3 = new i11(i10.a(string2), 15.33f, AndroidUtilities.bold());
            i11Var3.s(view);
            i11Var3.f27162a.setColor(o12);
            view.f27156n = i11Var3;
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
        view.f27157r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.f27158s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f27486c = view;
        addView((View) view, w7.z5.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        z5 z5Var = new z5(context);
        this.d = z5Var;
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(z5Var, i14, null);
        z5Var.setTextSize(1, 20.0f);
        z5Var.setTypeface(AndroidUtilities.bold());
        z5Var.setGravity(17);
        z5Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), z5Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.f27485b = replaceEmoji;
        this.f27485b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, z5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        z5Var.setText(k10Var.z());
        if (z11) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        z5Var.setCacheType(i11);
        int i15 = org.telegram.ui.ActionBar.k6.Oh;
        g6Var = ((org.telegram.ui.ActionBar.h3) k10Var).resourcesProvider;
        z5Var.setEmojiColor(org.telegram.ui.ActionBar.k6.w0(i15, g6Var));
        addView(z5Var, w7.z5.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        z5 z5Var2 = new z5(context);
        this.e = z5Var2;
        org.telegram.ui.ActionBar.r6.W(z5Var2, i14, null);
        z5Var2.setTextSize(1, 14.0f);
        z5Var2.setLines(2);
        z5Var2.setGravity(17);
        z5Var2.setLineSpacing(0.0f, 1.15f);
        addView(z5Var2, w7.z5.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i10;
        String str;
        int i11;
        k10 k10Var = this.f27487f;
        ArrayList arrayList = k10Var.f27809g0;
        boolean z10 = k10Var.f27804b0;
        CharSequence charSequence = this.f27485b;
        z5 z5Var = this.e;
        if (z10) {
            z5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
        } else if (this.f27484a) {
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            i10 i10Var = this.f27486c;
            p6 p6Var = i10Var.E;
            if (i10 > 0) {
                str = i2.o1.k(i10, "+");
            } else {
                str = "";
            }
            p6Var.t(str, false, true);
            i10Var.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i11 = arrayList.size();
                } else {
                    i11 = 0;
                }
                z5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", i11, charSequence)));
                return;
            }
            z5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            z5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, charSequence)));
        } else {
            z5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.g6 g6Var;
        try {
            z5 z5Var = this.d;
            if (z5Var != null) {
                int i10 = org.telegram.ui.ActionBar.k6.Oh;
                g6Var = ((org.telegram.ui.ActionBar.h3) this.f27487f).resourcesProvider;
                z5Var.setEmojiColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
