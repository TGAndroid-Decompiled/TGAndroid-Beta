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
public final class o50 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public TextView f49810a;
    public TextView f49811b;
    public TextView f49812c;
    public k0 d;
    public LinearLayout f49813e;
    public LinearLayout f49814f;
    public int h;
    public AnimatorSet f49815n;
    public String f49816r;

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        char c10;
        this.actionBar.setBackButtonImage(2131231240);
        char c11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131751132, null));
        this.actionBar.setActionBarMenuOnItemClick(new lx(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, frameLayout, null);
        this.fragmentView.setOnTouchListener(new gi.a(2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f49814f = linearLayout;
        linearLayout.setOrientation(1);
        this.f49814f.setWeightSum(100.0f);
        frameLayout.addView(this.f49814f, c8.ja.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        this.f49814f.addView(frameLayout2, c8.ja.l(50.0f, -1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout2.addView(imageView, c8.ja.c(-1.0f, -1));
        k0 k0Var = new k0(10, context, this);
        this.d = k0Var;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, k0Var, null);
        this.f49814f.addView(this.d, c8.ja.l(50.0f, -1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f49813e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f49813e.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.d.addView(this.f49813e, c8.ja.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f49811b = textView;
        int i7 = org.telegram.ui.ActionBar.j6.B6;
        org.telegram.ui.ActionBar.q6.U(textView, i7, null);
        this.f49811b.setGravity(17);
        this.f49811b.setTypeface(Typeface.MONOSPACE);
        this.f49811b.setTextSize(1, 16.0f);
        this.f49813e.addView(this.f49811b, c8.ja.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f49810a = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, i7, null);
        org.telegram.ui.ActionBar.q6.G(this.f49810a, org.telegram.ui.ActionBar.j6.J6, null);
        this.f49810a.setTextSize(1, 16.0f);
        this.f49810a.setLinksClickable(true);
        this.f49810a.setClickable(true);
        this.f49810a.setGravity(17);
        this.f49810a.setMovementMethod(new org.telegram.messenger.c0(2));
        this.f49813e.addView(this.f49810a, c8.ja.e(-2, -2, 1));
        TextView textView3 = new TextView(context);
        this.f49812c = textView3;
        org.telegram.ui.ActionBar.q6.U(textView3, i7, null);
        this.f49812c.setGravity(17);
        this.f49812c.setTextSize(1, 32.0f);
        this.d.addView(this.f49812c, c8.ja.c(-2.0f, -2));
        TLRPC.EncryptedChat a12 = org.telegram.messenger.np.s1(this.currentAccount).a1(Integer.valueOf(this.h));
        if (a12 != null) {
            org.telegram.ui.Components.g30 g30Var = new org.telegram.ui.Components.g30();
            imageView.setImageDrawable(g30Var);
            byte[] bArr = a12.key_hash;
            g30Var.f34783a = bArr;
            if (bArr == null) {
                byte[] bArr2 = new byte[16];
                System.arraycopy(Utilities.n(a12.auth_key), 0, bArr2, 0, 16);
                g30Var.f34783a = bArr2;
                a12.key_hash = bArr2;
            }
            g30Var.invalidateSelf();
            TLRPC.User a22 = org.telegram.messenger.np.s1(this.currentAccount).a2(Long.valueOf(a12.user_id));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr3 = a12.key_hash;
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
                    byte[] bArr4 = a12.key_hash;
                    int i13 = i12 * 4;
                    int i14 = (bArr4[i13 + 19] & 255) | ((bArr4[i13 + 16] & Byte.MAX_VALUE) << 24) | ((bArr4[i13 + 17] & 255) << 16) | ((bArr4[i13 + 18] & 255) << 8);
                    if (i12 != 0) {
                        sb2.append(" ");
                    }
                    sb2.append(org.telegram.messenger.k6.f24641c[i14 % 333]);
                }
                this.f49816r = sb2.toString();
            } else {
                c10 = 1;
            }
            this.f49811b.setText(spannableStringBuilder.toString());
            spannableStringBuilder.clear();
            String str = a22.first_name;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[c10] = str;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("EncryptionKeyDescription", null, 2131751131, objArr)));
            int indexOf = spannableStringBuilder.toString().indexOf("telegram.org");
            if (indexOf != -1) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.h41(org.telegram.messenger.hd.M0(2131751130, null), null), indexOf, indexOf + 12, 33);
            }
            this.f49810a.setText(spannableStringBuilder);
        }
        AnimatorSet animatorSet = this.f49815n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f49815n = null;
        }
        this.f49812c.setAlpha(0.0f);
        this.f49811b.setAlpha(1.0f);
        this.f49812c.setScaleX(0.0f);
        this.f49812c.setScaleY(0.0f);
        this.f49811b.setScaleX(1.0f);
        this.f49811b.setScaleY(1.0f);
        this.f49812c.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ef));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TextView textView;
        if (i7 == org.telegram.messenger.ns.f25514i4 && (textView = this.f49812c) != null) {
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
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new e7(this, 2));
    }

    @Override
    public final boolean onFragmentCreate() {
        this.h = getArguments().getInt("chat_id");
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25514i4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25514i4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new e7(this, 2));
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        String str;
        if (z10 && !z11 && (str = this.f49816r) != null) {
            TextView textView = this.f49812c;
            textView.setText(org.telegram.messenger.j6.m(str, textView.getPaint().getFontMetricsInt(), false, null, 0));
        }
    }
}
