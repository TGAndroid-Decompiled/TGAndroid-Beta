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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qo extends LinearLayout {
    public final org.telegram.ui.ActionBar.u6 f31975a;
    public final TextView f31976b;
    public final ArrayList f31977c;
    public final ArrayList d;

    public qo(Activity activity, View view, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity);
        Paint paint;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        this.f31977c = arrayList;
        this.d = new ArrayList();
        this.f31975a = u6Var;
        int dp = AndroidUtilities.dp(18.0f);
        if (u6Var != null) {
            paint = u6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        paint = paint == null ? org.telegram.ui.ActionBar.y6.U0("paintChatActionBackground") : paint;
        int i15 = org.telegram.ui.ActionBar.y6.f23293a;
        setBackground(new org.telegram.ui.ActionBar.l6(this, view, dp, paint));
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        setOrientation(1);
        if (i10 == 0) {
            TextView textView = new TextView(activity);
            this.f31976b = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23454ic, u6Var);
            textView.setGravity(1);
            textView.setMaxWidth(AndroidUtilities.dp(210.0f));
            arrayList.add(textView);
            addView(textView, kb1.u(-2, -2, 49));
        } else if (i10 == 1) {
            TextView textView2 = new TextView(activity);
            this.f31976b = textView2;
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23454ic, u6Var);
            textView2.setGravity(1);
            textView2.setMaxWidth(AndroidUtilities.dp(210.0f));
            arrayList.add(textView2);
            addView(textView2, kb1.u(-2, -2, 49));
        } else {
            ?? imageView = new ImageView(activity);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_saved_messages, 120, 120, null);
            imageView.d();
            addView((View) imageView, kb1.x(-2, -2, 49, 0, 2, 0, 0));
        }
        TextView textView3 = new TextView(activity);
        if (i10 == 0) {
            org.telegram.ui.d3.o(R.string.EncryptedDescriptionTitle, textView3, 1, 15.0f);
        } else if (i10 == 1) {
            org.telegram.ui.d3.o(R.string.GroupEmptyTitle2, textView3, 1, 15.0f);
        } else {
            textView3.setText(LocaleController.getString(R.string.ChatYourSelfTitle));
            textView3.setTextSize(1, 16.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(1);
        }
        org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.f23454ic, u6Var);
        arrayList.add(textView3);
        float f7 = 260.0f;
        textView3.setMaxWidth(AndroidUtilities.dp(260.0f));
        if (i10 != 2) {
            if (LocaleController.isRTL) {
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
        addView(textView3, kb1.x(-2, -2, i16, 0, 8, 0, i12));
        int i17 = 0;
        while (i17 < 4) {
            LinearLayout f10 = org.telegram.messenger.t.f(activity, 0);
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            addView(f10, kb1.x(-2, -2, i13, 0, 8, 0, 0));
            ImageView imageView2 = new ImageView(activity);
            int i18 = org.telegram.ui.ActionBar.y6.f23454ic;
            float f11 = f7;
            org.telegram.ui.ActionBar.f7.t(imageView2, i18, u6Var, PorterDuff.Mode.MULTIPLY);
            if (i10 == 0) {
                imageView2.setImageResource(R.drawable.ic_lock_white);
            } else if (i10 == 2) {
                imageView2.setImageResource(R.drawable.list_circle);
            } else {
                imageView2.setImageResource(R.drawable.groups_overview_check);
            }
            this.d.add(imageView2);
            TextView textView4 = new TextView(activity);
            textView4.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.f7.V(textView4, i18, u6Var);
            this.f31977c.add(textView4);
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView4.setGravity(i14 | 16);
            textView4.setMaxWidth(AndroidUtilities.dp(f11));
            if (i17 != 0) {
                if (i17 != 1) {
                    if (i17 != 2) {
                        if (i17 == 3) {
                            if (i10 == 0) {
                                textView4.setText(LocaleController.getString(R.string.EncryptedDescription4));
                            } else if (i10 == 2) {
                                textView4.setText(LocaleController.getString(R.string.ChatYourSelfDescription4));
                            } else {
                                textView4.setText(LocaleController.getString(R.string.GroupDescription4));
                            }
                        }
                    } else if (i10 == 0) {
                        textView4.setText(LocaleController.getString(R.string.EncryptedDescription3));
                    } else if (i10 == 2) {
                        textView4.setText(LocaleController.getString(R.string.ChatYourSelfDescription3));
                    } else {
                        textView4.setText(LocaleController.getString(R.string.GroupDescription3));
                    }
                } else if (i10 == 0) {
                    textView4.setText(LocaleController.getString(R.string.EncryptedDescription2));
                } else if (i10 == 2) {
                    textView4.setText(LocaleController.getString(R.string.ChatYourSelfDescription2));
                } else {
                    textView4.setText(LocaleController.getString(R.string.GroupDescription2));
                }
            } else if (i10 == 0) {
                textView4.setText(LocaleController.getString(R.string.EncryptedDescription1));
            } else if (i10 == 2) {
                textView4.setText(LocaleController.getString(R.string.ChatYourSelfDescription1));
            } else {
                textView4.setText(LocaleController.getString(R.string.GroupDescription1));
            }
            if (LocaleController.isRTL) {
                f10.addView(textView4, kb1.r(-2, -2));
                if (i10 == 0) {
                    f10.addView(imageView2, kb1.o(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                } else if (i10 == 2) {
                    f10.addView(imageView2, kb1.o(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f10.addView(imageView2, kb1.o(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                }
            } else {
                if (i10 == 0) {
                    f10.addView(imageView2, kb1.o(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                } else if (i10 == 2) {
                    f10.addView(imageView2, kb1.o(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                } else {
                    f10.addView(imageView2, kb1.o(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                }
                f10.addView(textView4, kb1.r(-2, -2));
            }
            i17++;
            f7 = f11;
        }
    }

    public void setStatusText(CharSequence charSequence) {
        this.f31976b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f31977c;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((TextView) arrayList.get(i12)).setTextColor(i10);
            i12++;
        }
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i11 < arrayList2.size()) {
                ((ImageView) arrayList2.get(i11)).setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23454ic, this.f31975a), PorterDuff.Mode.MULTIPLY));
                i11++;
            } else {
                return;
            }
        }
    }
}
