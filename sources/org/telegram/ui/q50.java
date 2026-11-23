package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q50 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public TextView f51073a;
    public TextView f51074b;
    public TextView f51075c;
    public k0 d;
    public LinearLayout f51076e;
    public LinearLayout f51077f;
    public int h;
    public AnimatorSet f51078n;
    public String f51079r;

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
    }

    @Override
    public final View createView(Context context) {
        char c10;
        this.actionBar.setBackButtonImage(2131231240);
        char c11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131751120, null));
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29324a7, frameLayout, null);
        this.fragmentView.setOnTouchListener(new gi.a(2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f51077f = linearLayout;
        linearLayout.setOrientation(1);
        this.f51077f.setWeightSum(100.0f);
        frameLayout.addView(this.f51077f, c8.ma.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        this.f51077f.addView(frameLayout2, c8.ma.l(50.0f, -1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout2.addView(imageView, c8.ma.c(-1.0f, -1));
        k0 k0Var = new k0(10, context, this);
        this.d = k0Var;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, k0Var, null);
        this.f51077f.addView(this.d, c8.ma.l(50.0f, -1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f51076e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f51076e.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.d.addView(this.f51076e, c8.ma.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f51074b = textView;
        int i7 = org.telegram.ui.ActionBar.m6.B6;
        org.telegram.ui.ActionBar.t6.U(textView, i7, null);
        this.f51074b.setGravity(17);
        this.f51074b.setTypeface(Typeface.MONOSPACE);
        this.f51074b.setTextSize(1, 16.0f);
        this.f51076e.addView(this.f51074b, c8.ma.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f51073a = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, i7, null);
        org.telegram.ui.ActionBar.t6.G(this.f51073a, org.telegram.ui.ActionBar.m6.J6, null);
        this.f51073a.setTextSize(1, 16.0f);
        this.f51073a.setLinksClickable(true);
        this.f51073a.setClickable(true);
        this.f51073a.setGravity(17);
        this.f51073a.setMovementMethod(new org.telegram.messenger.c0(2));
        this.f51076e.addView(this.f51073a, c8.ma.e(-2, -2, 1));
        TextView textView3 = new TextView(context);
        this.f51075c = textView3;
        org.telegram.ui.ActionBar.t6.U(textView3, i7, null);
        this.f51075c.setGravity(17);
        this.f51075c.setTextSize(1, 32.0f);
        this.d.addView(this.f51075c, c8.ma.c(-2.0f, -2));
        TLRPC.EncryptedChat c12 = org.telegram.messenger.np.u1(this.currentAccount).c1(Integer.valueOf(this.h));
        if (c12 != null) {
            org.telegram.ui.Components.r30 r30Var = new org.telegram.ui.Components.r30();
            imageView.setImageDrawable(r30Var);
            byte[] bArr = c12.key_hash;
            r30Var.f39061a = bArr;
            if (bArr == null) {
                byte[] bArr2 = new byte[16];
                System.arraycopy(Utilities.n(c12.auth_key), 0, bArr2, 0, 16);
                r30Var.f39061a = bArr2;
                c12.key_hash = bArr2;
            }
            r30Var.invalidateSelf();
            TLRPC.User c22 = org.telegram.messenger.np.u1(this.currentAccount).c2(Long.valueOf(c12.user_id));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr3 = c12.key_hash;
            if (bArr3.length > 16) {
                String f10 = Utilities.f(bArr3);
                int i10 = 0;
                while (i10 < 32) {
                    if (i10 != 0) {
                        if (i10 % 8 == 0) {
                            spannableStringBuilder.append('\n');
                        } else if (i10 % 4 == 0) {
                            spannableStringBuilder.append(' ');
                        }
                    }
                    int i11 = i10 * 2;
                    spannableStringBuilder.append((CharSequence) f10.substring(i11, i11 + 2));
                    spannableStringBuilder.append(' ');
                    i10++;
                    c11 = c11;
                }
                c10 = c11;
                spannableStringBuilder.append((CharSequence) "\n");
                for (int i12 = 0; i12 < 5; i12++) {
                    byte[] bArr4 = c12.key_hash;
                    int i13 = i12 * 4;
                    int i14 = (bArr4[i13 + 19] & 255) | ((bArr4[i13 + 16] & Byte.MAX_VALUE) << 24) | ((bArr4[i13 + 17] & 255) << 16) | ((bArr4[i13 + 18] & 255) << 8);
                    if (i12 != 0) {
                        sb2.append(" ");
                    }
                    sb2.append(org.telegram.messenger.k6.f25019c[i14 % 333]);
                }
                this.f51079r = sb2.toString();
            } else {
                c10 = 1;
            }
            this.f51074b.setText(spannableStringBuilder.toString());
            spannableStringBuilder.clear();
            String str = c22.first_name;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[c10] = str;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("EncryptionKeyDescription", null, 2131751119, objArr)));
            int indexOf = spannableStringBuilder.toString().indexOf("telegram.org");
            if (indexOf != -1) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.u41(org.telegram.messenger.hd.N0(2131751118, null), null), indexOf, indexOf + 12, 33);
            }
            this.f51073a.setText(spannableStringBuilder);
        }
        AnimatorSet animatorSet = this.f51078n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f51078n = null;
        }
        this.f51075c.setAlpha(0.0f);
        this.f51074b.setAlpha(1.0f);
        this.f51075c.setScaleX(0.0f);
        this.f51075c.setScaleY(0.0f);
        this.f51074b.setScaleX(1.0f);
        this.f51074b.setScaleY(1.0f);
        this.f51075c.setTag(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ef));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TextView textView;
        if (i7 == org.telegram.messenger.ls.f25342l4 && (textView = this.f51075c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new d7(this, 2));
    }

    @Override
    public final boolean onFragmentCreate() {
        this.h = getArguments().getInt("chat_id");
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25342l4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25342l4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new d7(this, 2));
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        String str;
        if (z10 && !z11 && (str = this.f51079r) != null) {
            TextView textView = this.f51075c;
            textView.setText(org.telegram.messenger.j6.m(str, textView.getPaint().getFontMetricsInt(), false, null, 0));
        }
    }
}
