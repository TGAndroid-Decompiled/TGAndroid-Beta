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
public final class tn extends LinearLayout {
    public final org.telegram.ui.ActionBar.p6 f30656a;
    public final TextView f30657b;
    public final ArrayList f30658c;
    public final ArrayList d;

    public tn(Activity activity, View view, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        Paint paint;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        this.f30658c = arrayList;
        this.d = new ArrayList();
        this.f30656a = p6Var;
        int L = org.telegram.messenger.i0.L(18.0f);
        if (p6Var != null) {
            paint = p6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        paint = paint == null ? org.telegram.ui.ActionBar.t6.V0("paintChatActionBackground") : paint;
        int i15 = org.telegram.ui.ActionBar.t6.f20865a;
        setBackground(new org.telegram.ui.ActionBar.g6(this, view, L, paint));
        setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f));
        setOrientation(1);
        if (i10 == 0) {
            TextView textView = new TextView(activity);
            this.f30657b = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Wc, p6Var);
            textView.setGravity(1);
            textView.setMaxWidth(org.telegram.messenger.i0.L(210.0f));
            arrayList.add(textView);
            addView(textView, w7.b6.r(-2, -2, 49));
        } else if (i10 == 1) {
            TextView textView2 = new TextView(activity);
            this.f30657b = textView2;
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Wc, p6Var);
            textView2.setGravity(1);
            textView2.setMaxWidth(org.telegram.messenger.i0.L(210.0f));
            arrayList.add(textView2);
            addView(textView2, w7.b6.r(-2, -2, 49));
        } else {
            ?? imageView = new ImageView(activity);
            imageView.setAutoRepeat(true);
            imageView.f(2131624324, 120, 120, null);
            imageView.d();
            addView((View) imageView, w7.b6.t(-2, -2, 49, 0, 2, 0, 0));
        }
        TextView textView3 = new TextView(activity);
        if (i10 == 0) {
            textView3.setText(org.telegram.messenger.cd.L0(2131751136, null));
            textView3.setTextSize(1, 15.0f);
        } else if (i10 == 1) {
            textView3.setText(org.telegram.messenger.cd.L0(2131749446, null));
            textView3.setTextSize(1, 15.0f);
        } else {
            textView3.setText(org.telegram.messenger.cd.L0(2131752183, null));
            textView3.setTextSize(1, 16.0f);
            textView3.setTypeface(org.telegram.messenger.i0.o());
            textView3.setGravity(1);
        }
        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.Wc, p6Var);
        arrayList.add(textView3);
        float f7 = 260.0f;
        textView3.setMaxWidth(org.telegram.messenger.i0.L(260.0f));
        if (i10 != 2) {
            if (org.telegram.messenger.cd.X) {
                i11 = 5;
            } else {
                i11 = 3;
            }
        } else {
            i11 = 1;
        }
        int i16 = i11 | 48;
        if (i10 != 2) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        addView(textView3, w7.b6.t(-2, -2, i16, 0, 8, 0, i12));
        int i17 = 0;
        while (i17 < 4) {
            LinearLayout e = org.telegram.messenger.m5.e(activity, 0);
            if (org.telegram.messenger.cd.X) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            addView(e, w7.b6.t(-2, -2, i13, 0, 8, 0, 0));
            ImageView imageView2 = new ImageView(activity);
            float f10 = f7;
            int i18 = org.telegram.ui.ActionBar.t6.Wc;
            org.telegram.ui.ActionBar.a7.t(imageView2, i18, p6Var, PorterDuff.Mode.MULTIPLY);
            if (i10 == 0) {
                imageView2.setImageResource(2131231312);
            } else if (i10 == 2) {
                imageView2.setImageResource(2131231624);
            } else {
                imageView2.setImageResource(2131231236);
            }
            this.d.add(imageView2);
            TextView textView4 = new TextView(activity);
            textView4.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.a7.V(textView4, i18, p6Var);
            this.f30658c.add(textView4);
            if (org.telegram.messenger.cd.X) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView4.setGravity(i14 | 16);
            textView4.setMaxWidth(org.telegram.messenger.i0.L(f10));
            if (i17 != 0) {
                if (i17 != 1) {
                    if (i17 != 2) {
                        if (i17 == 3) {
                            if (i10 == 0) {
                                textView4.setText(org.telegram.messenger.cd.L0(2131751137, null));
                            } else if (i10 == 2) {
                                textView4.setText(org.telegram.messenger.cd.L0(2131752185, null));
                            } else {
                                textView4.setText(org.telegram.messenger.cd.L0(2131749454, null));
                            }
                        }
                    } else if (i10 == 0) {
                        textView4.setText(org.telegram.messenger.cd.L0(2131751138, null));
                    } else if (i10 == 2) {
                        textView4.setText(org.telegram.messenger.cd.L0(2131752186, null));
                    } else {
                        textView4.setText(org.telegram.messenger.cd.L0(2131749455, null));
                    }
                } else if (i10 == 0) {
                    textView4.setText(org.telegram.messenger.cd.L0(2131751139, null));
                } else if (i10 == 2) {
                    textView4.setText(org.telegram.messenger.cd.L0(2131752187, null));
                } else {
                    textView4.setText(org.telegram.messenger.cd.L0(2131749456, null));
                }
            } else if (i10 == 0) {
                textView4.setText(org.telegram.messenger.cd.L0(2131751140, null));
            } else if (i10 == 2) {
                textView4.setText(org.telegram.messenger.cd.L0(2131752188, null));
            } else {
                textView4.setText(org.telegram.messenger.cd.L0(2131749457, null));
            }
            if (org.telegram.messenger.cd.X) {
                e.addView(textView4, w7.b6.o(-2, -2));
                if (i10 == 0) {
                    e.addView(imageView2, w7.b6.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                } else if (i10 == 2) {
                    e.addView(imageView2, w7.b6.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    e.addView(imageView2, w7.b6.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                }
            } else {
                if (i10 == 0) {
                    e.addView(imageView2, w7.b6.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                } else if (i10 == 2) {
                    e.addView(imageView2, w7.b6.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                } else {
                    e.addView(imageView2, w7.b6.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                }
                e.addView(textView4, w7.b6.o(-2, -2));
            }
            i17++;
            f7 = f10;
        }
    }

    public void setStatusText(CharSequence charSequence) {
        this.f30657b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f30658c;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((TextView) arrayList.get(i12)).setTextColor(i10);
            i12++;
        }
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i11 < arrayList2.size()) {
                ((ImageView) arrayList2.get(i11)).setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wc, this.f30656a), PorterDuff.Mode.MULTIPLY));
                i11++;
            } else {
                return;
            }
        }
    }
}
