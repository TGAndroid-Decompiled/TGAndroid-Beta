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
public final class k51 extends org.telegram.ui.Components.ha {
    public static final int V1 = 0;
    public final rh.a P1;
    public final LinearLayout Q1;
    public final LinearLayout R1;
    public boolean S1;
    public boolean T1;
    public org.telegram.ui.Components.q51 U1;

    public k51(final Context context, final int i10, final org.telegram.ui.ActionBar.p6 p6Var, final ag.e0 e0Var) {
        super(1, context, p6Var, true);
        int i11;
        int i12;
        this.f21584a = i10;
        this.f26730r1 = 0.2f;
        this.P0 = true;
        this.Q0 = true;
        rh.a aVar = new rh.a(context, i10, sf.b.f48268b, p6Var);
        this.P1 = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        this.f21590c.addView(aVar, 0, w7.b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.e6.a(aVar);
        aVar.setOnClickListener(new f51(0, context, p6Var));
        TLRPC.EmojiGameInfo emojiGameInfo = org.telegram.messenger.wp.r1(i10).f19292x8;
        if (!(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo)) {
            return;
        }
        TLRPC.TL_emojiGameDiceInfo tL_emojiGameDiceInfo = (TLRPC.TL_emojiGameDiceInfo) emojiGameInfo;
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(4.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231061);
        linearLayout.addView(imageView, w7.b6.t(80, 80, 1, 0, 0, 0, 8));
        int i13 = org.telegram.ui.ActionBar.t6.f21038j5;
        TextView b10 = w7.g6.b(context, 20.0f, i13, true, null);
        b10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.dd.L0(2131745256, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(2131745255, null));
        spannableStringBuilder.setSpan(new th.z(p6Var), length, spannableStringBuilder.length(), 33);
        b10.setText(spannableStringBuilder);
        linearLayout.addView(b10, w7.b6.k(32.0f, 0.0f, 32.0f, 8.0f, -1, -2));
        TextView b11 = w7.g6.b(context, 14.0f, i13, false, null);
        org.telegram.messenger.m5.l(b11, 17, null, 2131745257);
        linearLayout.addView(b11, w7.b6.k(32.0f, 0.0f, 32.0f, 12.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView b12 = w7.g6.b(context, 14.0f, org.telegram.ui.ActionBar.t6.L6, true, null);
        b12.setText(org.telegram.messenger.dd.L0(2131745259, null));
        linearLayout2.addView(b12, w7.b6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        org.telegram.ui.Components.xy0 xy0Var = new org.telegram.ui.Components.xy0(context, p6Var);
        linearLayout2.addView(xy0Var, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        TableRow tableRow = new TableRow(context);
        xy0Var.addView(tableRow);
        TableRow tableRow2 = new TableRow(context);
        xy0Var.addView(tableRow2);
        a1.d dVar = new a1.d(context, new int[]{2131231056, 2131231057, 2131231058, 2131231059, 2131231060, 2131231061, 2131231061}, p6Var, xy0Var, 17);
        if (tL_emojiGameDiceInfo.params.size() == 7) {
            tableRow.addView((View) dVar.d(1, Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.d(2, Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.d(3, Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.d(4, Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.d(5, Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.d(6, Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.d(7, Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
        }
        TextView b13 = w7.g6.b(context, 14.0f, org.telegram.ui.ActionBar.t6.f21312y6, false, null);
        b13.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131231061, 0);
        dqVar.d = false;
        dqVar.H = 0.8f;
        dqVar.I = 0.8f;
        spannableStringBuilder2.setSpan(dqVar, 0, spannableStringBuilder2.length(), 33);
        b13.setText(org.telegram.messenger.i0.L2(org.telegram.messenger.dd.L0(2131745258, null), spannableStringBuilder2, "🎲"));
        linearLayout2.addView(b13, w7.b6.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.addView(linearLayout2, w7.b6.k(8.0f, 0.0f, 8.0f, 0.0f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.R1 = linearLayout3;
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(7.0f));
        linearLayout3.setClipToPadding(false);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        final org.telegram.ui.Components.ec0 ec0Var = new org.telegram.ui.Components.ec0(context, p6Var);
        ec0Var.setForceForceUseCenter(true);
        ec0Var.setText(org.telegram.messenger.dd.L0(2131745260, null));
        ec0Var.setLeftPadding(org.telegram.messenger.i0.L(36.0f));
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, org.telegram.ui.ActionBar.t6.G6, p6Var);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = org.telegram.messenger.i0.L(16.0f);
        editTextBoldCursor.setPadding(org.telegram.messenger.i0.L(6.0f), L, L, L);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        org.telegram.ui.ActionBar.a7.D(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f21029ig, p6Var);
        org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.t6.f21049jg, p6Var);
        if (org.telegram.messenger.dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        editTextBoldCursor.setGravity(i11);
        editTextBoldCursor.setOnFocusChangeListener(new g51(ec0Var, editTextBoldCursor, 0));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(2131231054);
        linearLayout4.addView(imageView2, w7.b6.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout4.addView(editTextBoldCursor, w7.b6.p(-1, -2, 1.0f, 119));
        ec0Var.e(editTextBoldCursor);
        ec0Var.addView(linearLayout4, w7.b6.e(-1, -2, 48));
        linearLayout3.addView(ec0Var, w7.b6.o(-1, -2));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.A6, null);
        ec0Var.addView(textView, w7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        long j10 = tL_emojiGameDiceInfo.prev_stake;
        j10 = j10 <= 0 ? 1000000000L : j10;
        editTextBoldCursor.setText(rh.h8.P0(j10));
        textView.setAlpha(1.0f);
        StringBuilder sb2 = new StringBuilder("≈");
        org.telegram.messenger.u1.i().getClass();
        sb2.append(org.telegram.messenger.u1.g("USD", 2, (long) ((j10 / 1.0E9d) * ((org.telegram.messenger.k0) org.telegram.messenger.wp.r1(i10).f19300y7.f18036l.f13481b).f16536a * 100.0d), false));
        textView.setText(sb2.toString());
        final int[] iArr = {2};
        ec0Var.c(false, !TextUtils.isEmpty(editTextBoldCursor.getText()));
        int i14 = 3;
        editTextBoldCursor.addTextChangedListener(new j51(i10, editTextBoldCursor, ec0Var, iArr, textView));
        org.telegram.messenger.s20 s20Var = new org.telegram.messenger.s20() {
            @Override
            public final Object a(Object obj) {
                Long l4 = (Long) obj;
                TextView textView2 = new TextView(context);
                textView2.setGravity(17);
                textView2.setTextSize(1, 13.0f);
                textView2.setTypeface(org.telegram.messenger.i0.o());
                int i15 = org.telegram.ui.ActionBar.t6.Ci;
                org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                org.telegram.ui.ActionBar.a7.V(textView2, i15, p6Var2);
                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(13.0f), org.telegram.ui.ActionBar.t6.r1(0.15f, org.telegram.ui.ActionBar.t6.w0(i15, p6Var2)));
                org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.15f, i15);
                textView2.setBackground(d02);
                org.telegram.ui.ActionBar.a7.k(textView2, d02, L2, null, p6Var2);
                textView2.setText(rh.h8.R0(rh.h8.P0(l4.longValue()) + " 💎", 0.75f));
                w7.e6.a(textView2);
                textView2.setOnClickListener(new qv0(5, editTextBoldCursor, l4));
                return textView2;
            }
        };
        long[] jArr = org.telegram.messenger.wp.r1(i10).f19103c7;
        int i15 = 0;
        while (true) {
            int length2 = jArr.length;
            Pattern pattern = Utilities.f14519a;
            if (i15 < (length2 + 2) / i14) {
                LinearLayout f7 = org.telegram.messenger.m5.f(context, 0);
                int i16 = 0;
                while (true) {
                    int i17 = i15 * 3;
                    if (i16 < Math.min(i14, jArr.length - i17)) {
                        View view = (View) s20Var.a(Long.valueOf(jArr[i17 + i16]));
                        if (i16 == 2) {
                            i12 = 0;
                        } else {
                            i12 = 6;
                        }
                        f7.addView(view, w7.b6.q(0, 26, 1.0f, 112, 0, 0, i12, 0));
                        i16++;
                        i14 = 3;
                    }
                }
                this.R1.addView(f7, w7.b6.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                i15++;
                i14 = 3;
            } else {
                vh.d dVar2 = new vh.d(context, p6Var, true);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
                org.telegram.ui.Components.dq dqVar2 = new org.telegram.ui.Components.dq(2131231971, 0);
                dqVar2.f25569s = org.telegram.messenger.i0.L(1.0f);
                spannableStringBuilder3.setSpan(dqVar2, 0, spannableStringBuilder3.length(), 33);
                spannableStringBuilder3.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.dd.L0(2131745261, null));
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
                            int i18 = i10;
                            int i19 = (parseDouble > (org.telegram.messenger.wp.r1(i18).f19093b7 / 1.0E9d) ? 1 : (parseDouble == (org.telegram.messenger.wp.r1(i18).f19093b7 / 1.0E9d) ? 0 : -1));
                            org.telegram.ui.Components.ec0 ec0Var2 = ec0Var;
                            int[] iArr2 = iArr;
                            if (i19 > 0) {
                                editTextBoldCursor2.setText(Double.toString(org.telegram.messenger.wp.r1(i18).f19093b7 / 1.0E9d));
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                                int i20 = -iArr2[0];
                                iArr2[0] = i20;
                                org.telegram.messenger.i0.F3(i20, ec0Var2, null);
                            } else if (!TextUtils.isEmpty(text) && parseDouble < org.telegram.messenger.wp.r1(i18).f19083a7 / 1.0E9d) {
                                editTextBoldCursor2.setText(Double.toString(org.telegram.messenger.wp.r1(i18).f19083a7 / 1.0E9d));
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                                int i21 = -iArr2[0];
                                iArr2[0] = i21;
                                org.telegram.messenger.i0.F3(i21, ec0Var2, null);
                            } else if (rh.e6.y(i18, true).f46866f.toDouble() < parseDouble) {
                                new wh.f(context, p6Var, sf.a.i((long) (parseDouble * 1.0E9d), sf.b.f48268b), true, new org.telegram.ui.Components.voip.n0(15));
                            } else {
                                e0Var.a(Long.valueOf((long) (parseDouble * 1.0E9d)));
                                k51.this.dismiss();
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(dVar2, w7.b6.t(-1, 48, 87, 16, 0, 16, 10));
                ViewGroup viewGroup = this.f21587b;
                int i18 = this.f21616t0;
                viewGroup.addView(frameLayout, w7.b6.f(-2.0f, -1, 87, i18, 0, i18, 0));
                org.telegram.ui.Components.uk0 uk0Var = this.f26724k1;
                int i19 = this.f21616t0;
                uk0Var.setPadding(i19, 0, i19, org.telegram.messenger.i0.L(68.0f));
                this.U1.O(false);
                return;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tk0 L0(org.telegram.ui.Components.uk0 uk0Var) {
        org.telegram.ui.Components.q51 q51Var = new org.telegram.ui.Components.q51(uk0Var, getContext(), this.f21584a, 0, false, new z4(this, 27), this.I0);
        this.U1 = q51Var;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.dd.L0(2131745256, null);
    }

    @Override
    public final boolean Y(float f7, float f10) {
        rh.a aVar = this.P1;
        if (f7 >= aVar.getX() && f7 <= aVar.getX() + aVar.getWidth() && f10 >= aVar.getY() && f10 <= aVar.getY() + aVar.getHeight()) {
            return false;
        }
        return super.Y(f7, f10);
    }

    public final void d1() {
        boolean z10;
        float f7;
        if (this.S1 && !this.I && !this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.T1 != z10) {
            this.T1 = z10;
            rh.a aVar = this.P1;
            if (aVar != null) {
                aVar.setEnabled(z10);
                aVar.setClickable(z10);
                ViewPropertyAnimator animate = aVar.animate();
                float f10 = 0.6f;
                float f11 = 1.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (z10) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!z10) {
                    f11 = 0.0f;
                }
                org.telegram.messenger.a30.l(scaleY, f11, 180L);
            }
        }
    }

    @Override
    public final void g0(float f7) {
        super.g0(f7);
        d1();
    }

    @Override
    public final void n0() {
        this.S1 = false;
        d1();
    }

    @Override
    public final void w() {
        this.S1 = true;
        d1();
    }
}
