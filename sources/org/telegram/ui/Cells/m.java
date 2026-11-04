package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class m extends FrameLayout implements org.telegram.messenger.o9, org.telegram.ui.ActionBar.z5 {
    public final int f29607a;
    public final org.telegram.ui.Components.h6 f29608b;
    public final org.telegram.ui.Components.h6 f29609c;
    public final l d;
    public ArrayList f29610e;
    public boolean f29611f;

    public m(Activity activity, int i3) {
        super(activity);
        this.f29610e = new ArrayList();
        this.f29607a = i3;
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(activity, false, false, false);
        this.f29608b = h6Var;
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
        e10.addView(h6Var, mf.o(-1, 18));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(activity, false, false, false);
        this.f29609c = h6Var2;
        h6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        e10.addView(h6Var2, mf.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        l lVar = new l(activity, i3);
        this.d = lVar;
        lVar.b(299L);
        addView(e10, mf.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(lVar, mf.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        Drawable N0 = org.telegram.ui.ActionBar.k6.N0(false);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27972i6);
        setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(this, N0, null, N, null);
        updateColors();
        setOnClickListener(new a(this, 1));
    }

    @Override
    public final void g(ArrayList arrayList) {
        org.telegram.ui.Components.h6 h6Var;
        String str;
        String a02;
        String str2;
        String a03;
        String a04;
        boolean z10;
        int i3;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f29610e = arrayList2;
        int size = arrayList2.size();
        l lVar = this.d;
        if (size == 1) {
            org.telegram.messenger.m9 m9Var = (org.telegram.messenger.m9) this.f29610e.get(0);
            m9Var.getClass();
            if (m9Var.g(ConnectionsManager.getInstance(h10.f22829t0).getCurrentTime())) {
                lVar.a(m9Var.d.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = m9Var.f24180f;
                if (tL_starGiftAuctionState != null) {
                    i3 = Math.max(0, tL_starGiftAuctionState.next_round_at);
                } else {
                    i3 = 0;
                }
                lVar.a(i3);
            }
        } else {
            lVar.f29521f = 0;
            lVar.f29519c.b();
            lVar.f29517a.t(bd.M0(2131750344, null), true, true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size2 = this.f29610e.size();
        if (size2 == 0) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.f29607a).getCurrentTime();
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            h6Var = this.f29608b;
            if (i10 >= size2) {
                break;
            }
            org.telegram.messenger.m9 m9Var2 = (org.telegram.messenger.m9) this.f29610e.get(i10);
            boolean g7 = m9Var2.g(currentTime);
            int i11 = size2;
            long j10 = m9Var2.f24178c;
            z11 |= g7;
            if (j10 != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(j10, h6Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            int d = m9Var2.d();
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
                a04 = bd.M0(2131750409, null);
            } else {
                str = null;
                a04 = bd.a0(null, null, 2131750408, Integer.valueOf(i12));
            }
            spannableStringBuilder.append((CharSequence) a04);
        } else {
            str = null;
            if (i12 == 1) {
                a02 = bd.M0(2131750427, null);
            } else {
                a02 = bd.a0(null, null, 2131750426, Integer.valueOf(i12));
            }
            spannableStringBuilder.append((CharSequence) a02);
        }
        h6Var.c(spannableStringBuilder, true, true);
        this.f29611f = false;
        org.telegram.ui.Components.h6 h6Var2 = this.f29609c;
        if (z11) {
            h6Var2.setText(bd.M0(2131750421, str));
        } else if (z12) {
            h6Var2.setText(bd.M0(2131750420, str));
            this.f29611f = true;
        } else if (i12 > 1) {
            h6Var2.setText(bd.M0(2131750416, str));
        } else {
            int i13 = ((org.telegram.messenger.m9) this.f29610e.get(0)).f24182i;
            if (i13 == 1) {
                a03 = bd.M0(2131750419, str);
            } else if (i13 == 2) {
                a03 = bd.M0(2131750418, str);
            } else if (i13 == 3) {
                a03 = bd.M0(2131750417, str);
            } else {
                int i14 = i13 % 100;
                if (i14 >= 11 && i14 <= 13) {
                    str2 = null;
                    a03 = bd.a0(null, null, 2131750410, Integer.valueOf(i13));
                } else {
                    int i15 = i13 % 10;
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                str2 = null;
                                a03 = bd.a0(null, null, 2131750410, Integer.valueOf(i13));
                            } else {
                                str2 = null;
                                a03 = bd.a0(null, null, 2131750412, Integer.valueOf(i13));
                            }
                        } else {
                            str2 = null;
                            a03 = bd.a0(null, null, 2131750414, Integer.valueOf(i13));
                        }
                    } else {
                        str2 = null;
                        a03 = bd.a0(null, null, 2131750411, Integer.valueOf(i13));
                    }
                }
                h6Var2.setText(bd.a0(str2, str2, 2131750415, a03));
            }
            str2 = str;
            h6Var2.setText(bd.a0(str2, str2, 2131750415, a03));
        }
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = this.f29607a;
        org.telegram.messenger.q9.c(i3).f24866f.add(this);
        g(org.telegram.messenger.q9.c(i3).f24864c);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.q9.c(this.f29607a).f24866f.remove(this);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i3;
        this.f29608b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        if (this.f29611f) {
            i3 = org.telegram.ui.ActionBar.k6.f28122q7;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.f28273y6;
        }
        this.f29609c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
