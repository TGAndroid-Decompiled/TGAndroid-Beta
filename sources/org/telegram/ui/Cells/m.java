package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class m extends FrameLayout implements org.telegram.messenger.s9, org.telegram.ui.ActionBar.c6 {
    public final int f31015a;
    public final org.telegram.ui.Components.n6 f31016b;
    public final org.telegram.ui.Components.n6 f31017c;
    public final l d;
    public ArrayList f31018e;
    public boolean f31019f;

    public m(Activity activity, int i7) {
        super(activity);
        this.f31018e = new ArrayList();
        this.f31015a = i7;
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(activity, false, false, false);
        this.f31016b = n6Var;
        n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        n6Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
        f10.addView(n6Var, c8.ma.o(-1, 18));
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(activity, false, false, false);
        this.f31017c = n6Var2;
        n6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        f10.addView(n6Var2, c8.ma.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        l lVar = new l(activity, i7);
        this.d = lVar;
        lVar.b(299L);
        addView(f10, c8.ma.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(lVar, c8.ma.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        Drawable N0 = org.telegram.ui.ActionBar.n6.N0(false);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.f29488i6);
        setBackground(N0);
        org.telegram.ui.ActionBar.u6.j(this, N0, null, M, null);
        updateColors();
        setOnClickListener(new a(this, 1));
    }

    @Override
    public final void g(ArrayList arrayList) {
        org.telegram.ui.Components.n6 n6Var;
        String str;
        String a02;
        String str2;
        String a03;
        String a04;
        boolean z10;
        int i7;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f31018e = arrayList2;
        int size = arrayList2.size();
        l lVar = this.d;
        if (size == 1) {
            org.telegram.messenger.q9 q9Var = (org.telegram.messenger.q9) this.f31018e.get(0);
            q9Var.getClass();
            if (q9Var.g(ConnectionsManager.getInstance(j10.f24773t0).getCurrentTime())) {
                lVar.a(q9Var.d.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = q9Var.f26374f;
                if (tL_starGiftAuctionState != null) {
                    i7 = Math.max(0, tL_starGiftAuctionState.next_round_at);
                } else {
                    i7 = 0;
                }
                lVar.a(i7);
            }
        } else {
            lVar.f30963f = 0;
            lVar.f30961c.b();
            lVar.f30959a.t(gd.M0(2131750320, null), true, true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size2 = this.f31018e.size();
        if (size2 == 0) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.f31015a).getCurrentTime();
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            n6Var = this.f31016b;
            if (i10 >= size2) {
                break;
            }
            org.telegram.messenger.q9 q9Var2 = (org.telegram.messenger.q9) this.f31018e.get(i10);
            boolean g10 = q9Var2.g(currentTime);
            int i11 = size2;
            long j3 = q9Var2.f26372c;
            z11 |= g10;
            if (j3 != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.x5(j3, n6Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            int d = q9Var2.d();
            if (d != 2 && d != 3) {
                z10 = false;
            } else {
                z10 = true;
            }
            z12 |= z10;
            i10++;
            size2 = i11;
        }
        int i12 = size2;
        spannableStringBuilder.append(' ');
        if (z11) {
            if (i12 == 1) {
                str = null;
                a04 = gd.M0(2131750385, null);
            } else {
                str = null;
                a04 = gd.a0(null, null, 2131750384, Integer.valueOf(i12));
            }
            spannableStringBuilder.append((CharSequence) a04);
        } else {
            str = null;
            if (i12 == 1) {
                a02 = gd.M0(2131750403, null);
            } else {
                a02 = gd.a0(null, null, 2131750402, Integer.valueOf(i12));
            }
            spannableStringBuilder.append((CharSequence) a02);
        }
        n6Var.c(spannableStringBuilder, true, true);
        this.f31019f = false;
        org.telegram.ui.Components.n6 n6Var2 = this.f31017c;
        if (z11) {
            n6Var2.setText(gd.M0(2131750397, str));
        } else if (z12) {
            n6Var2.setText(gd.M0(2131750396, str));
            this.f31019f = true;
        } else if (i12 > 1) {
            n6Var2.setText(gd.M0(2131750392, str));
        } else {
            int i13 = ((org.telegram.messenger.q9) this.f31018e.get(0)).f26376i;
            if (i13 == 1) {
                a03 = gd.M0(2131750395, str);
            } else if (i13 == 2) {
                a03 = gd.M0(2131750394, str);
            } else if (i13 == 3) {
                a03 = gd.M0(2131750393, str);
            } else {
                int i14 = i13 % 100;
                if (i14 >= 11 && i14 <= 13) {
                    str2 = null;
                    a03 = gd.a0(null, null, 2131750386, Integer.valueOf(i13));
                } else {
                    int i15 = i13 % 10;
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                str2 = null;
                                a03 = gd.a0(null, null, 2131750386, Integer.valueOf(i13));
                            } else {
                                str2 = null;
                                a03 = gd.a0(null, null, 2131750388, Integer.valueOf(i13));
                            }
                        } else {
                            str2 = null;
                            a03 = gd.a0(null, null, 2131750390, Integer.valueOf(i13));
                        }
                    } else {
                        str2 = null;
                        a03 = gd.a0(null, null, 2131750387, Integer.valueOf(i13));
                    }
                }
                n6Var2.setText(gd.a0(str2, str2, 2131750391, a03));
            }
            str2 = str;
            n6Var2.setText(gd.a0(str2, str2, 2131750391, a03));
        }
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f31015a;
        org.telegram.messenger.u9.c(i7).f27141f.add(this);
        g(org.telegram.messenger.u9.c(i7).f27139c);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.u9.c(this.f31015a).f27141f.remove(this);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i7;
        this.f31016b.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        if (this.f31019f) {
            i7 = org.telegram.ui.ActionBar.n6.f29637q7;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29788y6;
        }
        this.f31017c.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
