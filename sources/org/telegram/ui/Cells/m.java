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
public final class m extends FrameLayout implements org.telegram.messenger.s9, org.telegram.ui.ActionBar.b6 {
    public final int f31050a;
    public final org.telegram.ui.Components.o6 f31051b;
    public final org.telegram.ui.Components.o6 f31052c;
    public final l d;
    public ArrayList f31053e;
    public boolean f31054f;

    public m(Activity activity, int i7) {
        super(activity);
        this.f31053e = new ArrayList();
        this.f31050a = i7;
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(activity, false, false, false);
        this.f31051b = o6Var;
        o6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        o6Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
        f10.addView(o6Var, c8.ma.o(-1, 18));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(activity, false, false, false);
        this.f31052c = o6Var2;
        o6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        f10.addView(o6Var2, c8.ma.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        l lVar = new l(activity, i7);
        this.d = lVar;
        lVar.b(299L);
        addView(f10, c8.ma.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(lVar, c8.ma.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        Drawable N0 = org.telegram.ui.ActionBar.m6.N0(false);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.f29470i6);
        setBackground(N0);
        org.telegram.ui.ActionBar.t6.j(this, N0, null, M, null);
        updateColors();
        setOnClickListener(new a(this, 1));
    }

    @Override
    public final void g(ArrayList arrayList) {
        org.telegram.ui.Components.o6 o6Var;
        String str;
        String a02;
        String str2;
        String a03;
        String a04;
        boolean z10;
        int i7;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f31053e = arrayList2;
        int size = arrayList2.size();
        l lVar = this.d;
        if (size == 1) {
            org.telegram.messenger.q9 q9Var = (org.telegram.messenger.q9) this.f31053e.get(0);
            q9Var.getClass();
            if (q9Var.g(ConnectionsManager.getInstance(j10.f24798t0).getCurrentTime())) {
                lVar.a(q9Var.d.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = q9Var.f26400f;
                if (tL_starGiftAuctionState != null) {
                    i7 = Math.max(0, tL_starGiftAuctionState.next_round_at);
                } else {
                    i7 = 0;
                }
                lVar.a(i7);
            }
        } else {
            lVar.f30979f = 0;
            lVar.f30977c.b();
            lVar.f30975a.t(gd.N0(2131750319, null), true, true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size2 = this.f31053e.size();
        if (size2 == 0) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.f31050a).getCurrentTime();
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            o6Var = this.f31051b;
            if (i10 >= size2) {
                break;
            }
            org.telegram.messenger.q9 q9Var2 = (org.telegram.messenger.q9) this.f31053e.get(i10);
            boolean g10 = q9Var2.g(currentTime);
            int i11 = size2;
            long j3 = q9Var2.f26398c;
            z11 |= g10;
            if (j3 != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(j3, o6Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
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
                a04 = gd.N0(2131750384, null);
            } else {
                str = null;
                a04 = gd.a0(null, null, 2131750383, Integer.valueOf(i12));
            }
            spannableStringBuilder.append((CharSequence) a04);
        } else {
            str = null;
            if (i12 == 1) {
                a02 = gd.N0(2131750402, null);
            } else {
                a02 = gd.a0(null, null, 2131750401, Integer.valueOf(i12));
            }
            spannableStringBuilder.append((CharSequence) a02);
        }
        o6Var.c(spannableStringBuilder, true, true);
        this.f31054f = false;
        org.telegram.ui.Components.o6 o6Var2 = this.f31052c;
        if (z11) {
            o6Var2.setText(gd.N0(2131750396, str));
        } else if (z12) {
            o6Var2.setText(gd.N0(2131750395, str));
            this.f31054f = true;
        } else if (i12 > 1) {
            o6Var2.setText(gd.N0(2131750391, str));
        } else {
            int i13 = ((org.telegram.messenger.q9) this.f31053e.get(0)).f26402i;
            if (i13 == 1) {
                a03 = gd.N0(2131750394, str);
            } else if (i13 == 2) {
                a03 = gd.N0(2131750393, str);
            } else if (i13 == 3) {
                a03 = gd.N0(2131750392, str);
            } else {
                int i14 = i13 % 100;
                if (i14 >= 11 && i14 <= 13) {
                    str2 = null;
                    a03 = gd.a0(null, null, 2131750385, Integer.valueOf(i13));
                } else {
                    int i15 = i13 % 10;
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                str2 = null;
                                a03 = gd.a0(null, null, 2131750385, Integer.valueOf(i13));
                            } else {
                                str2 = null;
                                a03 = gd.a0(null, null, 2131750387, Integer.valueOf(i13));
                            }
                        } else {
                            str2 = null;
                            a03 = gd.a0(null, null, 2131750389, Integer.valueOf(i13));
                        }
                    } else {
                        str2 = null;
                        a03 = gd.a0(null, null, 2131750386, Integer.valueOf(i13));
                    }
                }
                o6Var2.setText(gd.a0(str2, str2, 2131750390, a03));
            }
            str2 = str;
            o6Var2.setText(gd.a0(str2, str2, 2131750390, a03));
        }
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f31050a;
        org.telegram.messenger.u9.c(i7).f27167f.add(this);
        g(org.telegram.messenger.u9.c(i7).f27165c);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.u9.c(this.f31050a).f27167f.remove(this);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i7;
        this.f31051b.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        if (this.f31054f) {
            i7 = org.telegram.ui.ActionBar.m6.f29619q7;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f29770y6;
        }
        this.f31052c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
