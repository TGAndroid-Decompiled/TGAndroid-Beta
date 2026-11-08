package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class ln extends LinearLayout {
    public final org.telegram.ui.ActionBar.f6 f35720a;
    public final TextView f35721b;
    public final ArrayList f35722c;
    public final ArrayList d;

    public ln(Activity activity, View view, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        Paint paint;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList = new ArrayList();
        this.f35722c = arrayList;
        this.d = new ArrayList();
        this.f35720a = f6Var;
        int L = org.telegram.messenger.g0.L(18.0f);
        if (f6Var != null) {
            paint = f6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        paint = paint == null ? org.telegram.ui.ActionBar.k6.V0("paintChatActionBackground") : paint;
        int i14 = org.telegram.ui.ActionBar.k6.f27788a;
        setBackground(new org.telegram.ui.ActionBar.w5(this, view, L, paint));
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        setOrientation(1);
        if (i7 == 0) {
            TextView textView = new TextView(activity);
            this.f35721b = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Wc, f6Var);
            textView.setGravity(1);
            textView.setMaxWidth(org.telegram.messenger.g0.L(210.0f));
            arrayList.add(textView);
            addView(textView, c8.ha.r(-2, -2, 49));
        } else if (i7 == 1) {
            TextView textView2 = new TextView(activity);
            this.f35721b = textView2;
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Wc, f6Var);
            textView2.setGravity(1);
            textView2.setMaxWidth(org.telegram.messenger.g0.L(210.0f));
            arrayList.add(textView2);
            addView(textView2, c8.ha.r(-2, -2, 49));
        } else {
            ?? imageView = new ImageView(activity);
            imageView.setAutoRepeat(true);
            imageView.f(2131624326, 120, 120, null);
            imageView.d();
            addView((View) imageView, c8.ha.t(-2, -2, 49, 0, 2, 0, 0));
        }
        TextView textView3 = new TextView(activity);
        if (i7 == 0) {
            textView3.setText(org.telegram.messenger.id.M0(2131751136, null));
            textView3.setTextSize(1, 15.0f);
        } else if (i7 == 1) {
            textView3.setText(org.telegram.messenger.id.M0(2131749438, null));
            textView3.setTextSize(1, 15.0f);
        } else {
            textView3.setText(org.telegram.messenger.id.M0(2131752183, null));
            textView3.setTextSize(1, 16.0f);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setGravity(1);
        }
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.Wc, f6Var);
        arrayList.add(textView3);
        float f10 = 260.0f;
        textView3.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
        if (i7 != 2) {
            if (org.telegram.messenger.id.f23157a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
        } else {
            i10 = 1;
        }
        int i15 = i10 | 48;
        if (i7 != 2) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        addView(textView3, c8.ha.t(-2, -2, i15, 0, 8, 0, i11));
        int i16 = 0;
        while (i16 < 4) {
            LinearLayout e10 = org.telegram.messenger.k5.e(activity, 0);
            if (org.telegram.messenger.id.f23157a0) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            addView(e10, c8.ha.t(-2, -2, i12, 0, 8, 0, 0));
            ImageView imageView2 = new ImageView(activity);
            float f11 = f10;
            int i17 = org.telegram.ui.ActionBar.k6.Wc;
            org.telegram.ui.ActionBar.r6.t(imageView2, i17, f6Var, PorterDuff.Mode.MULTIPLY);
            if (i7 == 0) {
                imageView2.setImageResource(2131231311);
            } else if (i7 == 2) {
                imageView2.setImageResource(2131231623);
            } else {
                imageView2.setImageResource(2131231235);
            }
            this.d.add(imageView2);
            TextView textView4 = new TextView(activity);
            textView4.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.V(textView4, i17, f6Var);
            this.f35722c.add(textView4);
            if (org.telegram.messenger.id.f23157a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView4.setGravity(i13 | 16);
            textView4.setMaxWidth(org.telegram.messenger.g0.L(f11));
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            if (i7 == 0) {
                                textView4.setText(org.telegram.messenger.id.M0(2131751137, null));
                            } else if (i7 == 2) {
                                textView4.setText(org.telegram.messenger.id.M0(2131752185, null));
                            } else {
                                textView4.setText(org.telegram.messenger.id.M0(2131749446, null));
                            }
                        }
                    } else if (i7 == 0) {
                        textView4.setText(org.telegram.messenger.id.M0(2131751138, null));
                    } else if (i7 == 2) {
                        textView4.setText(org.telegram.messenger.id.M0(2131752186, null));
                    } else {
                        textView4.setText(org.telegram.messenger.id.M0(2131749447, null));
                    }
                } else if (i7 == 0) {
                    textView4.setText(org.telegram.messenger.id.M0(2131751139, null));
                } else if (i7 == 2) {
                    textView4.setText(org.telegram.messenger.id.M0(2131752187, null));
                } else {
                    textView4.setText(org.telegram.messenger.id.M0(2131749448, null));
                }
            } else if (i7 == 0) {
                textView4.setText(org.telegram.messenger.id.M0(2131751140, null));
            } else if (i7 == 2) {
                textView4.setText(org.telegram.messenger.id.M0(2131752188, null));
            } else {
                textView4.setText(org.telegram.messenger.id.M0(2131749449, null));
            }
            if (org.telegram.messenger.id.f23157a0) {
                e10.addView(textView4, c8.ha.o(-2, -2));
                if (i7 == 0) {
                    e10.addView(imageView2, c8.ha.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                } else if (i7 == 2) {
                    e10.addView(imageView2, c8.ha.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    e10.addView(imageView2, c8.ha.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                }
            } else {
                if (i7 == 0) {
                    e10.addView(imageView2, c8.ha.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                } else if (i7 == 2) {
                    e10.addView(imageView2, c8.ha.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                } else {
                    e10.addView(imageView2, c8.ha.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                }
                e10.addView(textView4, c8.ha.o(-2, -2));
            }
            i16++;
            f10 = f11;
        }
    }

    public void setStatusText(CharSequence charSequence) {
        this.f35721b.setText(charSequence);
    }

    public void setTextColor(int i7) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f35722c;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((TextView) arrayList.get(i11)).setTextColor(i7);
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 < arrayList2.size()) {
                ((ImageView) arrayList2.get(i10)).setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, this.f35720a), PorterDuff.Mode.MULTIPLY));
                i10++;
            } else {
                return;
            }
        }
    }
}
