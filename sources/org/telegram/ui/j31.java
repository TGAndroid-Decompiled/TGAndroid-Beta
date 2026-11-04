package org.telegram.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j31 extends org.telegram.ui.Components.ma {
    public static final int W1 = 0;
    public final ci.c Q1;
    public final LinearLayout R1;
    public final LinearLayout S1;
    public boolean T1;
    public boolean U1;
    public org.telegram.ui.Components.f41 V1;

    public j31(final Context context, final int i3, final org.telegram.ui.ActionBar.e6 e6Var, final mi.f fVar) {
        super(1, context, e6Var, true);
        int i10;
        int i11;
        this.f28583a = i3;
        this.f36108s1 = 0.2f;
        this.Q0 = true;
        this.R0 = true;
        ci.c cVar = new ci.c(context, i3, dg.b.f8926b, e6Var);
        this.Q1 = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        this.f28589c.addView(cVar, 0, b8.mf.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        b8.pf.a(cVar);
        cVar.setOnClickListener(new ai.u(2, context, e6Var));
        TLRPC.EmojiGameInfo emojiGameInfo = org.telegram.messenger.hp.s1(i3).f23158w8;
        if (!(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo)) {
            return;
        }
        TLRPC.TL_emojiGameDiceInfo tL_emojiGameDiceInfo = (TLRPC.TL_emojiGameDiceInfo) emojiGameInfo;
        LinearLayout linearLayout = new LinearLayout(context);
        this.R1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231061);
        linearLayout.addView(imageView, b8.mf.t(80, 80, 1, 0, 0, 0, 8));
        int i12 = org.telegram.ui.ActionBar.k6.f27988j5;
        TextView b10 = b8.rf.b(context, 20.0f, i12, true, null);
        b10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131745248, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131745247, null));
        spannableStringBuilder.setSpan(new ei.m0(e6Var), length, spannableStringBuilder.length(), 33);
        b10.setText(spannableStringBuilder);
        linearLayout.addView(b10, b8.mf.k(32.0f, 0.0f, 32.0f, 8.0f, -1, -2));
        TextView b11 = b8.rf.b(context, 14.0f, i12, false, null);
        org.telegram.messenger.k5.m(b11, 17, null, 2131745249);
        linearLayout.addView(b11, b8.mf.k(32.0f, 0.0f, 32.0f, 12.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView b12 = b8.rf.b(context, 14.0f, org.telegram.ui.ActionBar.k6.L6, true, null);
        b12.setText(org.telegram.messenger.bd.M0(2131745251, null));
        linearLayout2.addView(b12, b8.mf.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        org.telegram.ui.Components.rx0 rx0Var = new org.telegram.ui.Components.rx0(context, e6Var);
        linearLayout2.addView(rx0Var, b8.mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        TableRow tableRow = new TableRow(context);
        rx0Var.addView(tableRow);
        TableRow tableRow2 = new TableRow(context);
        rx0Var.addView(tableRow2);
        a1.d dVar = new a1.d(context, new int[]{2131231056, 2131231057, 2131231058, 2131231059, 2131231060, 2131231061, 2131231061}, e6Var, rx0Var, 20);
        if (tL_emojiGameDiceInfo.params.size() == 7) {
            tableRow.addView((View) dVar.d(1, Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.d(2, Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.d(3, Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.d(4, Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.d(5, Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.d(6, Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.d(7, Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
        }
        TextView b13 = b8.rf.b(context, 14.0f, org.telegram.ui.ActionBar.k6.f28273y6, false, null);
        b13.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131231061, 0);
        wpVar.d = false;
        wpVar.I = 0.8f;
        wpVar.J = 0.8f;
        spannableStringBuilder2.setSpan(wpVar, 0, spannableStringBuilder2.length(), 33);
        b13.setText(org.telegram.messenger.g0.M2(org.telegram.messenger.bd.M0(2131745250, null), spannableStringBuilder2, "🎲"));
        linearLayout2.addView(b13, b8.mf.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.addView(linearLayout2, b8.mf.k(8.0f, 0.0f, 8.0f, 0.0f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.S1 = linearLayout3;
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(7.0f));
        linearLayout3.setClipToPadding(false);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        final org.telegram.ui.Components.gb0 gb0Var = new org.telegram.ui.Components.gb0(context, e6Var);
        gb0Var.setForceForceUseCenter(true);
        gb0Var.setText(org.telegram.messenger.bd.M0(2131745252, null));
        gb0Var.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, org.telegram.ui.ActionBar.k6.G6, e6Var);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        org.telegram.ui.ActionBar.r6.D(editTextBoldCursor, org.telegram.ui.ActionBar.k6.ig, e6Var);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.k6.f27998jg, e6Var);
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setOnFocusChangeListener(new ci.y9(gb0Var, editTextBoldCursor, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(2131231054);
        linearLayout4.addView(imageView2, b8.mf.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout4.addView(editTextBoldCursor, b8.mf.p(-1, -2, 1.0f, 119));
        gb0Var.e(editTextBoldCursor);
        gb0Var.addView(linearLayout4, b8.mf.e(-1, -2, 48));
        linearLayout3.addView(gb0Var, b8.mf.o(-1, -2));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A6, null);
        gb0Var.addView(textView, b8.mf.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        long j10 = tL_emojiGameDiceInfo.prev_stake;
        j10 = j10 <= 0 ? 1000000000L : j10;
        editTextBoldCursor.setText(ci.wb.P0(j10));
        textView.setAlpha(1.0f);
        StringBuilder sb2 = new StringBuilder("≈");
        org.telegram.messenger.r1.i().getClass();
        sb2.append(org.telegram.messenger.r1.g("USD", 2, (long) ((j10 / 1.0E9d) * ((org.telegram.messenger.i0) org.telegram.messenger.hp.s1(i3).f23167x7.f24665l.f14429b).f23413a * 100.0d), false));
        textView.setText(sb2.toString());
        final int[] iArr = {2};
        gb0Var.c(false, !TextUtils.isEmpty(editTextBoldCursor.getText()));
        editTextBoldCursor.addTextChangedListener(new i31(i3, editTextBoldCursor, gb0Var, iArr, textView));
        org.telegram.messenger.v10 v10Var = new org.telegram.messenger.v10() {
            @Override
            public final Object a(Object obj) {
                Long l10 = (Long) obj;
                TextView textView2 = new TextView(context);
                textView2.setGravity(17);
                textView2.setTextSize(1, 13.0f);
                textView2.setTypeface(org.telegram.messenger.g0.o());
                int i13 = org.telegram.ui.ActionBar.k6.Ci;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.ActionBar.r6.V(textView2, i13, e6Var2);
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(13.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, org.telegram.ui.ActionBar.k6.w0(i13, e6Var2)));
                org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.15f, i13);
                textView2.setBackground(d02);
                org.telegram.ui.ActionBar.r6.k(textView2, d02, L2, null, e6Var2);
                textView2.setText(ci.wb.R0(ci.wb.P0(l10.longValue()) + " 💎", 0.75f));
                b8.pf.a(textView2);
                textView2.setOnClickListener(new hb0(17, editTextBoldCursor, l10));
                return textView2;
            }
        };
        long[] jArr = org.telegram.messenger.hp.s1(i3).f22971b7;
        int i13 = 0;
        while (true) {
            int length2 = jArr.length;
            Pattern pattern = Utilities.f21384a;
            int i14 = 3;
            if (i13 < (length2 + 2) / 3) {
                LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
                int i15 = 0;
                while (true) {
                    int i16 = i13 * 3;
                    if (i15 < Math.min(i14, jArr.length - i16)) {
                        View view = (View) v10Var.a(Long.valueOf(jArr[i16 + i15]));
                        if (i15 == 2) {
                            i11 = 0;
                        } else {
                            i11 = 6;
                        }
                        f10.addView(view, b8.mf.q(0, 26, 1.0f, 112, 0, 0, i11, 0));
                        i15++;
                        i14 = 3;
                    }
                }
                this.S1.addView(f10, b8.mf.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                i13++;
            } else {
                gi.d dVar2 = new gi.d(context, e6Var, true);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
                org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(2131231972, 0);
                wpVar2.f40046s = org.telegram.messenger.g0.L(1.0f);
                spannableStringBuilder3.setSpan(wpVar2, 0, spannableStringBuilder3.length(), 33);
                spannableStringBuilder3.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.bd.M0(2131745253, null));
                dVar2.i(spannableStringBuilder3, false, true);
                dVar2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        double parseDouble;
                        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                        Editable text = editTextBoldCursor2.getText();
                        try {
                            if (TextUtils.isEmpty(text)) {
                                parseDouble = 0.0d;
                            } else {
                                parseDouble = Double.parseDouble(text.toString());
                            }
                            int i17 = i3;
                            int i18 = (parseDouble > (org.telegram.messenger.hp.s1(i17).f22961a7 / 1.0E9d) ? 1 : (parseDouble == (org.telegram.messenger.hp.s1(i17).f22961a7 / 1.0E9d) ? 0 : -1));
                            org.telegram.ui.Components.gb0 gb0Var2 = gb0Var;
                            int[] iArr2 = iArr;
                            if (i18 > 0) {
                                editTextBoldCursor2.setText(Double.toString(org.telegram.messenger.hp.s1(i17).f22961a7 / 1.0E9d));
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                                int i19 = -iArr2[0];
                                iArr2[0] = i19;
                                org.telegram.messenger.g0.G3(i19, gb0Var2, null);
                            } else if (!TextUtils.isEmpty(text) && parseDouble < org.telegram.messenger.hp.s1(i17).Z6 / 1.0E9d) {
                                editTextBoldCursor2.setText(Double.toString(org.telegram.messenger.hp.s1(i17).Z6 / 1.0E9d));
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                                int i20 = -iArr2[0];
                                iArr2[0] = i20;
                                org.telegram.messenger.g0.G3(i20, gb0Var2, null);
                            } else if (ci.e9.y(i17, true).f5033f.toDouble() < parseDouble) {
                                new hi.f(context, e6Var, dg.a.i((long) (parseDouble * 1.0E9d), dg.b.f8926b), true, new org.telegram.ui.Components.go(28));
                            } else {
                                fVar.a(Long.valueOf((long) (parseDouble * 1.0E9d)));
                                j31.this.dismiss();
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(dVar2, b8.mf.t(-1, 48, 87, 16, 0, 16, 10));
                ViewGroup viewGroup = this.f28586b;
                int i17 = this.f28618u0;
                viewGroup.addView(frameLayout, b8.mf.f(-2.0f, -1, 87, i17, 0, i17, 0));
                org.telegram.ui.Components.tj0 tj0Var = this.f36102l1;
                int i18 = this.f28618u0;
                tj0Var.setPadding(i18, 0, i18, org.telegram.messenger.g0.L(68.0f));
                this.V1.O(false);
                return;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.sj0 L0(org.telegram.ui.Components.tj0 tj0Var) {
        org.telegram.ui.Components.f41 f41Var = new org.telegram.ui.Components.f41(tj0Var, getContext(), this.f28583a, 0, false, new c5(this, 27), this.J0);
        this.V1 = f41Var;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.bd.M0(2131745248, null);
    }

    @Override
    public final boolean X(float f10, float f11) {
        ci.c cVar = this.Q1;
        if (f10 >= cVar.getX() && f10 <= cVar.getX() + cVar.getWidth() && f11 >= cVar.getY() && f11 <= cVar.getY() + cVar.getHeight()) {
            return false;
        }
        return super.X(f10, f11);
    }

    public final void d1() {
        boolean z10;
        float f10;
        if (this.T1 && !this.J && !this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.U1 != z10) {
            this.U1 = z10;
            ci.c cVar = this.Q1;
            if (cVar != null) {
                cVar.setEnabled(z10);
                cVar.setClickable(z10);
                ViewPropertyAnimator animate = cVar.animate();
                float f11 = 0.6f;
                float f12 = 1.0f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (z10) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!z10) {
                    f12 = 0.0f;
                }
                org.telegram.messenger.camera.q.k(scaleY, f12, 180L);
            }
        }
    }

    @Override
    public final void g0(float f10) {
        super.g0(f10);
        d1();
    }

    @Override
    public final void n0() {
        this.T1 = false;
        d1();
    }

    @Override
    public final void v() {
        this.T1 = true;
        d1();
    }
}
