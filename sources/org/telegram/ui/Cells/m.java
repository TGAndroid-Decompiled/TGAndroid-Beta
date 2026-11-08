package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class m extends FrameLayout implements org.telegram.messenger.u9, org.telegram.ui.ActionBar.a6 {
    public final int f29527a;
    public final org.telegram.ui.Components.j6 f29528b;
    public final org.telegram.ui.Components.j6 f29529c;
    public final l d;
    public ArrayList f29530e;
    public boolean f29531f;

    public m(Activity activity, int i7) {
        super(activity);
        this.f29530e = new ArrayList();
        this.f29527a = i7;
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(activity, false, false, false);
        this.f29528b = j6Var;
        j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        j6Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
        e10.addView(j6Var, c8.ha.o(-1, 18));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(activity, false, false, false);
        this.f29529c = j6Var2;
        j6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        e10.addView(j6Var2, c8.ha.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        l lVar = new l(activity, i7);
        this.d = lVar;
        lVar.b(299L);
        addView(e10, c8.ha.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(lVar, c8.ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        Drawable N0 = org.telegram.ui.ActionBar.k6.N0(false);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27944i6);
        setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(this, N0, null, N, null);
        updateColors();
        setOnClickListener(new a(this, 1));
    }

    @Override
    public final void g(ArrayList arrayList) {
        org.telegram.ui.Components.j6 j6Var;
        String str;
        String a02;
        String str2;
        String a03;
        String a04;
        boolean z9;
        int i7;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f29530e = arrayList2;
        int size = arrayList2.size();
        l lVar = this.d;
        if (size == 1) {
            org.telegram.messenger.s9 s9Var = (org.telegram.messenger.s9) this.f29530e.get(0);
            s9Var.getClass();
            if (s9Var.g(ConnectionsManager.getInstance(p10.f24470s0).getCurrentTime())) {
                lVar.a(s9Var.d.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = s9Var.f25438f;
                if (tL_starGiftAuctionState != null) {
                    i7 = Math.max(0, tL_starGiftAuctionState.next_round_at);
                } else {
                    i7 = 0;
                }
                lVar.a(i7);
            }
        } else {
            lVar.f29464f = 0;
            lVar.f29462c.b();
            lVar.f29460a.t(id.M0(2131750337, null), true, true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size2 = this.f29530e.size();
        if (size2 == 0) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.f29527a).getCurrentTime();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            j6Var = this.f29528b;
            if (i10 >= size2) {
                break;
            }
            org.telegram.messenger.s9 s9Var2 = (org.telegram.messenger.s9) this.f29530e.get(i10);
            boolean g10 = s9Var2.g(currentTime);
            int i11 = size2;
            long j3 = s9Var2.f25436c;
            z10 |= g10;
            if (j3 != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.r5(j3, j6Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            int d = s9Var2.d();
            if (d != 2 && d != 3) {
                z9 = false;
            } else {
                z9 = true;
            }
            z11 |= z9;
            i10++;
            size2 = i11;
        }
        int i12 = size2;
        spannableStringBuilder.append(' ');
        if (z10) {
            if (i12 == 1) {
                str = null;
                a04 = id.M0(2131750402, null);
            } else {
                str = null;
                a04 = id.a0(null, null, 2131750401, Integer.valueOf(i12));
            }
            spannableStringBuilder.append((CharSequence) a04);
        } else {
            str = null;
            if (i12 == 1) {
                a02 = id.M0(2131750420, null);
            } else {
                a02 = id.a0(null, null, 2131750419, Integer.valueOf(i12));
            }
            spannableStringBuilder.append((CharSequence) a02);
        }
        j6Var.c(spannableStringBuilder, true, true);
        this.f29531f = false;
        org.telegram.ui.Components.j6 j6Var2 = this.f29529c;
        if (z10) {
            j6Var2.setText(id.M0(2131750414, str));
        } else if (z11) {
            j6Var2.setText(id.M0(2131750413, str));
            this.f29531f = true;
        } else if (i12 > 1) {
            j6Var2.setText(id.M0(2131750409, str));
        } else {
            int i13 = ((org.telegram.messenger.s9) this.f29530e.get(0)).f25440i;
            if (i13 == 1) {
                a03 = id.M0(2131750412, str);
            } else if (i13 == 2) {
                a03 = id.M0(2131750411, str);
            } else if (i13 == 3) {
                a03 = id.M0(2131750410, str);
            } else {
                int i14 = i13 % 100;
                if (i14 >= 11 && i14 <= 13) {
                    str2 = null;
                    a03 = id.a0(null, null, 2131750403, Integer.valueOf(i13));
                } else {
                    int i15 = i13 % 10;
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                str2 = null;
                                a03 = id.a0(null, null, 2131750403, Integer.valueOf(i13));
                            } else {
                                str2 = null;
                                a03 = id.a0(null, null, 2131750405, Integer.valueOf(i13));
                            }
                        } else {
                            str2 = null;
                            a03 = id.a0(null, null, 2131750407, Integer.valueOf(i13));
                        }
                    } else {
                        str2 = null;
                        a03 = id.a0(null, null, 2131750404, Integer.valueOf(i13));
                    }
                }
                j6Var2.setText(id.a0(str2, str2, 2131750408, a03));
            }
            str2 = str;
            j6Var2.setText(id.a0(str2, str2, 2131750408, a03));
        }
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f29527a;
        org.telegram.messenger.w9.c(i7).f26281f.add(this);
        g(org.telegram.messenger.w9.c(i7).f26279c);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.w9.c(this.f29527a).f26281f.remove(this);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i7;
        this.f29528b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        if (this.f29531f) {
            i7 = org.telegram.ui.ActionBar.k6.f28093q7;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.f28244y6;
        }
        this.f29529c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
