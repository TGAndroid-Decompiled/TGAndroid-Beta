package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class l extends FrameLayout implements org.telegram.messenger.w9, org.telegram.ui.ActionBar.k6 {
    public final int f22201a;
    public final org.telegram.ui.Components.f6 f22202b;
    public final org.telegram.ui.Components.f6 f22203c;
    public final k d;
    public ArrayList e;
    public boolean f22204f;

    public l(Activity activity, int i10) {
        super(activity);
        this.e = new ArrayList();
        this.f22201a = i10;
        LinearLayout e = org.telegram.messenger.m5.e(activity, 1);
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(activity, false, false, false);
        this.f22202b = f6Var;
        f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f6Var.setTranslationY(-org.telegram.messenger.i0.L(1.0f));
        e.addView(f6Var, w7.b6.o(-1, 18));
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(activity, false, false, false);
        this.f22203c = f6Var2;
        f6Var2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        e.addView(f6Var2, w7.b6.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        k kVar = new k(activity, i10);
        this.d = kVar;
        kVar.b(299L);
        addView(e, w7.b6.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(kVar, w7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        Drawable N0 = org.telegram.ui.ActionBar.t6.N0(false);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f21021i6);
        setBackground(N0);
        org.telegram.ui.ActionBar.a7.k(this, N0, null, N, null);
        updateColors();
        setOnClickListener(new a(this, 1));
    }

    @Override
    public final void g(ArrayList arrayList) {
        org.telegram.ui.Components.f6 f6Var;
        String str;
        String a02;
        String str2;
        String a03;
        String a04;
        boolean z10;
        int i10;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.e = arrayList2;
        int size = arrayList2.size();
        k kVar = this.d;
        if (size == 1) {
            org.telegram.messenger.u9 u9Var = (org.telegram.messenger.u9) this.e.get(0);
            u9Var.getClass();
            if (u9Var.g(ConnectionsManager.getInstance(e20.f15506s0).getCurrentTime())) {
                kVar.a(u9Var.d.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = u9Var.f18405f;
                if (tL_starGiftAuctionState != null) {
                    i10 = Math.max(0, tL_starGiftAuctionState.next_round_at);
                } else {
                    i10 = 0;
                }
                kVar.a(i10);
            }
        } else {
            kVar.f22103f = 0;
            kVar.f22102c.b();
            kVar.f22100a.t(dd.L0(2131750345, null), true, true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size2 = this.e.size();
        if (size2 == 0) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.f22201a).getCurrentTime();
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            f6Var = this.f22202b;
            if (i11 >= size2) {
                break;
            }
            org.telegram.messenger.u9 u9Var2 = (org.telegram.messenger.u9) this.e.get(i11);
            boolean g10 = u9Var2.g(currentTime);
            int i12 = size2;
            long j10 = u9Var2.f18404c;
            z11 |= g10;
            if (j10 != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.o5(j10, f6Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            int d = u9Var2.d();
            if (d != 2 && d != 3) {
                z10 = false;
            } else {
                z10 = true;
            }
            z12 |= z10;
            i11++;
            size2 = i12;
        }
        int i13 = size2;
        spannableStringBuilder.append(' ');
        if (z11) {
            if (i13 == 1) {
                str = null;
                a04 = dd.L0(2131750410, null);
            } else {
                str = null;
                a04 = dd.a0(null, null, 2131750409, Integer.valueOf(i13));
            }
            spannableStringBuilder.append((CharSequence) a04);
        } else {
            str = null;
            if (i13 == 1) {
                a02 = dd.L0(2131750428, null);
            } else {
                a02 = dd.a0(null, null, 2131750427, Integer.valueOf(i13));
            }
            spannableStringBuilder.append((CharSequence) a02);
        }
        f6Var.c(spannableStringBuilder, true, true);
        this.f22204f = false;
        org.telegram.ui.Components.f6 f6Var2 = this.f22203c;
        if (z11) {
            f6Var2.setText(dd.L0(2131750422, str));
        } else if (z12) {
            f6Var2.setText(dd.L0(2131750421, str));
            this.f22204f = true;
        } else if (i13 > 1) {
            f6Var2.setText(dd.L0(2131750417, str));
        } else {
            int i14 = ((org.telegram.messenger.u9) this.e.get(0)).f18407i;
            if (i14 == 1) {
                a03 = dd.L0(2131750420, str);
            } else if (i14 == 2) {
                a03 = dd.L0(2131750419, str);
            } else if (i14 == 3) {
                a03 = dd.L0(2131750418, str);
            } else {
                int i15 = i14 % 100;
                if (i15 >= 11 && i15 <= 13) {
                    str2 = null;
                    a03 = dd.a0(null, null, 2131750411, Integer.valueOf(i14));
                } else {
                    int i16 = i14 % 10;
                    if (i16 != 1) {
                        if (i16 != 2) {
                            if (i16 != 3) {
                                str2 = null;
                                a03 = dd.a0(null, null, 2131750411, Integer.valueOf(i14));
                            } else {
                                str2 = null;
                                a03 = dd.a0(null, null, 2131750413, Integer.valueOf(i14));
                            }
                        } else {
                            str2 = null;
                            a03 = dd.a0(null, null, 2131750415, Integer.valueOf(i14));
                        }
                    } else {
                        str2 = null;
                        a03 = dd.a0(null, null, 2131750412, Integer.valueOf(i14));
                    }
                }
                f6Var2.setText(dd.a0(str2, str2, 2131750416, a03));
            }
            str2 = str;
            f6Var2.setText(dd.a0(str2, str2, 2131750416, a03));
        }
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f22201a;
        org.telegram.messenger.y9.c(i10).f19568f.add(this);
        g(org.telegram.messenger.y9.c(i10).f19567c);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.y9.c(this.f22201a).f19568f.remove(this);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i10;
        this.f22202b.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        if (this.f22204f) {
            i10 = org.telegram.ui.ActionBar.t6.f21171q7;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21312y6;
        }
        this.f22203c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
