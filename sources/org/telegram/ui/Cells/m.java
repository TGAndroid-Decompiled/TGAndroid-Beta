package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class m extends FrameLayout implements org.telegram.messenger.t9, org.telegram.ui.ActionBar.b6 {
    public final int f31019a;
    public final org.telegram.ui.Components.o6 f31020b;
    public final org.telegram.ui.Components.o6 f31021c;
    public final l d;
    public ArrayList f31022e;
    public boolean f31023f;

    public m(Activity activity, int i7) {
        super(activity);
        this.f31022e = new ArrayList();
        this.f31019a = i7;
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(activity, false, false, false);
        this.f31020b = o6Var;
        o6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        o6Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
        f10.addView(o6Var, c8.na.o(-1, 18));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(activity, false, false, false);
        this.f31021c = o6Var2;
        o6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        f10.addView(o6Var2, c8.na.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        l lVar = new l(activity, i7);
        this.d = lVar;
        lVar.b(299L);
        addView(f10, c8.na.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(lVar, c8.na.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        Drawable N0 = org.telegram.ui.ActionBar.m6.N0(false);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.f29439i6);
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
        this.f31022e = arrayList2;
        int size = arrayList2.size();
        l lVar = this.d;
        if (size == 1) {
            org.telegram.messenger.r9 r9Var = (org.telegram.messenger.r9) this.f31022e.get(0);
            r9Var.getClass();
            if (r9Var.g(ConnectionsManager.getInstance(k10.f24932t0).getCurrentTime())) {
                lVar.a(r9Var.d.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = r9Var.f26547f;
                if (tL_starGiftAuctionState != null) {
                    i7 = Math.max(0, tL_starGiftAuctionState.next_round_at);
                } else {
                    i7 = 0;
                }
                lVar.a(i7);
            }
        } else {
            lVar.f30948f = 0;
            lVar.f30946c.b();
            lVar.f30944a.t(hd.N0(2131750319, null), true, true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size2 = this.f31022e.size();
        if (size2 == 0) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.f31019a).getCurrentTime();
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            o6Var = this.f31020b;
            if (i10 >= size2) {
                break;
            }
            org.telegram.messenger.r9 r9Var2 = (org.telegram.messenger.r9) this.f31022e.get(i10);
            boolean g10 = r9Var2.g(currentTime);
            int i11 = size2;
            long j3 = r9Var2.f26545c;
            z11 |= g10;
            if (j3 != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(j3, o6Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            int d = r9Var2.d();
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
                a04 = hd.N0(2131750384, null);
            } else {
                str = null;
                a04 = hd.a0(null, null, 2131750383, Integer.valueOf(i12));
            }
            spannableStringBuilder.append((CharSequence) a04);
        } else {
            str = null;
            if (i12 == 1) {
                a02 = hd.N0(2131750402, null);
            } else {
                a02 = hd.a0(null, null, 2131750401, Integer.valueOf(i12));
            }
            spannableStringBuilder.append((CharSequence) a02);
        }
        o6Var.c(spannableStringBuilder, true, true);
        this.f31023f = false;
        org.telegram.ui.Components.o6 o6Var2 = this.f31021c;
        if (z11) {
            o6Var2.setText(hd.N0(2131750396, str));
        } else if (z12) {
            o6Var2.setText(hd.N0(2131750395, str));
            this.f31023f = true;
        } else if (i12 > 1) {
            o6Var2.setText(hd.N0(2131750391, str));
        } else {
            int i13 = ((org.telegram.messenger.r9) this.f31022e.get(0)).f26549i;
            if (i13 == 1) {
                a03 = hd.N0(2131750394, str);
            } else if (i13 == 2) {
                a03 = hd.N0(2131750393, str);
            } else if (i13 == 3) {
                a03 = hd.N0(2131750392, str);
            } else {
                int i14 = i13 % 100;
                if (i14 >= 11 && i14 <= 13) {
                    str2 = null;
                    a03 = hd.a0(null, null, 2131750385, Integer.valueOf(i13));
                } else {
                    int i15 = i13 % 10;
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                str2 = null;
                                a03 = hd.a0(null, null, 2131750385, Integer.valueOf(i13));
                            } else {
                                str2 = null;
                                a03 = hd.a0(null, null, 2131750387, Integer.valueOf(i13));
                            }
                        } else {
                            str2 = null;
                            a03 = hd.a0(null, null, 2131750389, Integer.valueOf(i13));
                        }
                    } else {
                        str2 = null;
                        a03 = hd.a0(null, null, 2131750386, Integer.valueOf(i13));
                    }
                }
                o6Var2.setText(hd.a0(str2, str2, 2131750390, a03));
            }
            str2 = str;
            o6Var2.setText(hd.a0(str2, str2, 2131750390, a03));
        }
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f31019a;
        org.telegram.messenger.v9.c(i7).f27302f.add(this);
        g(org.telegram.messenger.v9.c(i7).f27300c);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.v9.c(this.f31019a).f27302f.remove(this);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i7;
        this.f31020b.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        if (this.f31023f) {
            i7 = org.telegram.ui.ActionBar.m6.f29588q7;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f29739y6;
        }
        this.f31021c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
