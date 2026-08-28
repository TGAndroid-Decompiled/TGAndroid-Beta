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
public final class un extends LinearLayout {
    public final org.telegram.ui.ActionBar.b6 f33095a;
    public final TextView f33096b;
    public final ArrayList f33097c;
    public final ArrayList d;

    public un(Activity activity, View view, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity);
        Paint paint;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList = new ArrayList();
        this.f33097c = arrayList;
        this.d = new ArrayList();
        this.f33095a = b6Var;
        int dp = AndroidUtilities.dp(18.0f);
        if (b6Var != null) {
            paint = b6Var.O("paintChatActionBackground");
        } else {
            paint = null;
        }
        paint = paint == null ? org.telegram.ui.ActionBar.f6.S0("paintChatActionBackground") : paint;
        int i14 = org.telegram.ui.ActionBar.f6.f22941a;
        setBackground(new org.telegram.ui.ActionBar.s5(this, view, dp, paint));
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        setOrientation(1);
        if (i9 == 0) {
            TextView textView = new TextView(activity);
            this.f33096b = textView;
            textView.setTextSize(1, 15.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23097ic, b6Var));
            textView.setGravity(1);
            textView.setMaxWidth(AndroidUtilities.dp(210.0f));
            arrayList.add(textView);
            addView(textView, g7.e6.q(-2, -2, 49));
        } else if (i9 == 1) {
            TextView textView2 = new TextView(activity);
            this.f33096b = textView2;
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23097ic, b6Var));
            textView2.setGravity(1);
            textView2.setMaxWidth(AndroidUtilities.dp(210.0f));
            arrayList.add(textView2);
            addView(textView2, g7.e6.q(-2, -2, 49));
        } else {
            ?? imageView = new ImageView(activity);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_saved_messages, 120, 120, null);
            imageView.d();
            addView((View) imageView, g7.e6.t(-2, -2, 49, 0, 2, 0, 0));
        }
        TextView textView3 = new TextView(activity);
        if (i9 == 0) {
            textView3.setText(LocaleController.getString(R.string.EncryptedDescriptionTitle));
            textView3.setTextSize(1, 15.0f);
        } else if (i9 == 1) {
            textView3.setText(LocaleController.getString(R.string.GroupEmptyTitle2));
            textView3.setTextSize(1, 15.0f);
        } else {
            textView3.setText(LocaleController.getString(R.string.ChatYourSelfTitle));
            textView3.setTextSize(1, 16.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(1);
        }
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23097ic, b6Var));
        arrayList.add(textView3);
        textView3.setMaxWidth(AndroidUtilities.dp(260.0f));
        if (i9 != 2) {
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
        } else {
            i10 = 1;
        }
        int i15 = i10 | 48;
        if (i9 != 2) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        addView(textView3, g7.e6.t(-2, -2, i15, 0, 8, 0, i11));
        for (int i16 = 0; i16 < 4; i16++) {
            LinearLayout f10 = org.telegram.messenger.l0.f(activity, 0);
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            addView(f10, g7.e6.t(-2, -2, i12, 0, 8, 0, 0));
            ImageView imageView2 = new ImageView(activity);
            int i17 = org.telegram.ui.ActionBar.f6.f23097ic;
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i17, this.f33095a), PorterDuff.Mode.MULTIPLY));
            if (i9 == 0) {
                imageView2.setImageResource(R.drawable.ic_lock_white);
            } else if (i9 == 2) {
                imageView2.setImageResource(R.drawable.list_circle);
            } else {
                imageView2.setImageResource(R.drawable.groups_overview_check);
            }
            this.d.add(imageView2);
            TextView textView4 = new TextView(activity);
            textView4.setTextSize(1, 15.0f);
            textView4.setTextColor(org.telegram.ui.ActionBar.f6.v0(i17, this.f33095a));
            this.f33097c.add(textView4);
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView4.setGravity(i13 | 16);
            textView4.setMaxWidth(AndroidUtilities.dp(260.0f));
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            if (i9 == 0) {
                                textView4.setText(LocaleController.getString(R.string.EncryptedDescription4));
                            } else if (i9 == 2) {
                                textView4.setText(LocaleController.getString(R.string.ChatYourSelfDescription4));
                            } else {
                                textView4.setText(LocaleController.getString(R.string.GroupDescription4));
                            }
                        }
                    } else if (i9 == 0) {
                        textView4.setText(LocaleController.getString(R.string.EncryptedDescription3));
                    } else if (i9 == 2) {
                        textView4.setText(LocaleController.getString(R.string.ChatYourSelfDescription3));
                    } else {
                        textView4.setText(LocaleController.getString(R.string.GroupDescription3));
                    }
                } else if (i9 == 0) {
                    textView4.setText(LocaleController.getString(R.string.EncryptedDescription2));
                } else if (i9 == 2) {
                    textView4.setText(LocaleController.getString(R.string.ChatYourSelfDescription2));
                } else {
                    textView4.setText(LocaleController.getString(R.string.GroupDescription2));
                }
            } else if (i9 == 0) {
                textView4.setText(LocaleController.getString(R.string.EncryptedDescription1));
            } else if (i9 == 2) {
                textView4.setText(LocaleController.getString(R.string.ChatYourSelfDescription1));
            } else {
                textView4.setText(LocaleController.getString(R.string.GroupDescription1));
            }
            if (LocaleController.isRTL) {
                f10.addView(textView4, g7.e6.n(-2, -2));
                if (i9 == 0) {
                    f10.addView(imageView2, g7.e6.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                } else if (i9 == 2) {
                    f10.addView(imageView2, g7.e6.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f10.addView(imageView2, g7.e6.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                }
            } else {
                if (i9 == 0) {
                    f10.addView(imageView2, g7.e6.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                } else if (i9 == 2) {
                    f10.addView(imageView2, g7.e6.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                } else {
                    f10.addView(imageView2, g7.e6.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                }
                f10.addView(textView4, g7.e6.n(-2, -2));
            }
        }
    }

    public void setStatusText(CharSequence charSequence) {
        this.f33096b.setText(charSequence);
    }

    public void setTextColor(int i9) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f33097c;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((TextView) arrayList.get(i11)).setTextColor(i9);
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 < arrayList2.size()) {
                ((ImageView) arrayList2.get(i10)).setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23097ic, this.f33095a), PorterDuff.Mode.MULTIPLY));
                i10++;
            } else {
                return;
            }
        }
    }
}
