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
public final class j50 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public TextView f46498a;
    public TextView f46499b;
    public TextView f46500c;
    public l0 d;
    public LinearLayout f46501e;
    public LinearLayout f46502f;
    public int h;
    public AnimatorSet f46503n;
    public String f46504r;

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        char c2;
        this.actionBar.setBackButtonImage(2131231240);
        char c10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131751133, null));
        this.actionBar.setActionBarMenuOnItemClick(new hx(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, frameLayout, null);
        this.fragmentView.setOnTouchListener(new fi.a(2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46502f = linearLayout;
        linearLayout.setOrientation(1);
        this.f46502f.setWeightSum(100.0f);
        frameLayout.addView(this.f46502f, b8.mf.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        this.f46502f.addView(frameLayout2, b8.mf.l(50.0f, -1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout2.addView(imageView, b8.mf.c(-1.0f, -1));
        l0 l0Var = new l0(10, context, this);
        this.d = l0Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, l0Var, null);
        this.f46502f.addView(this.d, b8.mf.l(50.0f, -1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f46501e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f46501e.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.d.addView(this.f46501e, b8.mf.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f46499b = textView;
        int i3 = org.telegram.ui.ActionBar.k6.B6;
        org.telegram.ui.ActionBar.r6.V(textView, i3, null);
        this.f46499b.setGravity(17);
        this.f46499b.setTypeface(Typeface.MONOSPACE);
        this.f46499b.setTextSize(1, 16.0f);
        this.f46501e.addView(this.f46499b, b8.mf.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f46498a = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i3, null);
        org.telegram.ui.ActionBar.r6.H(this.f46498a, org.telegram.ui.ActionBar.k6.J6, null);
        this.f46498a.setTextSize(1, 16.0f);
        this.f46498a.setLinksClickable(true);
        this.f46498a.setClickable(true);
        this.f46498a.setGravity(17);
        this.f46498a.setMovementMethod(new org.telegram.messenger.c0(2));
        this.f46501e.addView(this.f46498a, b8.mf.e(-2, -2, 1));
        TextView textView3 = new TextView(context);
        this.f46500c = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, i3, null);
        this.f46500c.setGravity(17);
        this.f46500c.setTextSize(1, 32.0f);
        this.d.addView(this.f46500c, b8.mf.c(-2.0f, -2));
        TLRPC.EncryptedChat a12 = org.telegram.messenger.hp.s1(this.currentAccount).a1(Integer.valueOf(this.h));
        if (a12 != null) {
            org.telegram.ui.Components.z20 z20Var = new org.telegram.ui.Components.z20();
            imageView.setImageDrawable(z20Var);
            byte[] bArr = a12.key_hash;
            z20Var.f40897a = bArr;
            if (bArr == null) {
                byte[] bArr2 = new byte[16];
                System.arraycopy(Utilities.n(a12.auth_key), 0, bArr2, 0, 16);
                z20Var.f40897a = bArr2;
                a12.key_hash = bArr2;
            }
            z20Var.invalidateSelf();
            TLRPC.User a22 = org.telegram.messenger.hp.s1(this.currentAccount).a2(Long.valueOf(a12.user_id));
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
                    c10 = c10;
                }
                c2 = c10;
                spannableStringBuilder.append((CharSequence) "\n");
                for (int i12 = 0; i12 < 5; i12++) {
                    byte[] bArr4 = a12.key_hash;
                    int i13 = i12 * 4;
                    int i14 = (bArr4[i13 + 19] & 255) | ((bArr4[i13 + 16] & Byte.MAX_VALUE) << 24) | ((bArr4[i13 + 17] & 255) << 16) | ((bArr4[i13 + 18] & 255) << 8);
                    if (i12 != 0) {
                        sb2.append(" ");
                    }
                    sb2.append(org.telegram.messenger.j6.f23642c[i14 % 333]);
                }
                this.f46504r = sb2.toString();
            } else {
                c2 = 1;
            }
            this.f46499b.setText(spannableStringBuilder.toString());
            spannableStringBuilder.clear();
            String str = a22.first_name;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[c2] = str;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("EncryptionKeyDescription", null, 2131751132, objArr)));
            int indexOf = spannableStringBuilder.toString().indexOf("telegram.org");
            if (indexOf != -1) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.x31(org.telegram.messenger.bd.M0(2131751131, null), null), indexOf, indexOf + 12, 33);
            }
            this.f46498a.setText(spannableStringBuilder);
        }
        AnimatorSet animatorSet = this.f46503n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f46503n = null;
        }
        this.f46500c.setAlpha(0.0f);
        this.f46499b.setAlpha(1.0f);
        this.f46500c.setScaleX(0.0f);
        this.f46500c.setScaleY(0.0f);
        this.f46499b.setScaleX(1.0f);
        this.f46499b.setScaleY(1.0f);
        this.f46500c.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bf));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TextView textView;
        if (i3 == org.telegram.messenger.hs.f23246i4 && (textView = this.f46500c) != null) {
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
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new f7(this, 2));
    }

    @Override
    public final boolean onFragmentCreate() {
        this.h = getArguments().getInt("chat_id");
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new f7(this, 2));
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        String str;
        if (z10 && !z11 && (str = this.f46504r) != null) {
            TextView textView = this.f46500c;
            textView.setText(org.telegram.messenger.i6.m(str, textView.getPaint().getFontMetricsInt(), false, null, 0));
        }
    }
}
