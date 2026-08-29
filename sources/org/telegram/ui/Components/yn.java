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
public final class yn extends LinearLayout {
    public final org.telegram.ui.ActionBar.c6 f35106a;
    public final TextView f35107b;
    public final ArrayList f35108c;
    public final ArrayList d;

    public yn(Activity activity, View view, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        Paint paint;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        this.f35108c = arrayList;
        this.d = new ArrayList();
        this.f35106a = c6Var;
        int dp = AndroidUtilities.dp(18.0f);
        if (c6Var != null) {
            paint = c6Var.G("paintChatActionBackground");
        } else {
            paint = null;
        }
        paint = paint == null ? org.telegram.ui.ActionBar.g6.S0("paintChatActionBackground") : paint;
        int i15 = org.telegram.ui.ActionBar.g6.f23002a;
        setBackground(new org.telegram.ui.ActionBar.t5(this, view, dp, paint));
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        setOrientation(1);
        if (i10 == 0) {
            TextView textView = new TextView(activity);
            this.f35107b = textView;
            textView.setTextSize(1, 15.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23158ic, c6Var));
            textView.setGravity(1);
            textView.setMaxWidth(AndroidUtilities.dp(210.0f));
            arrayList.add(textView);
            addView(textView, i7.f6.q(-2, -2, 49));
        } else if (i10 == 1) {
            TextView textView2 = new TextView(activity);
            this.f35107b = textView2;
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23158ic, c6Var));
            textView2.setGravity(1);
            textView2.setMaxWidth(AndroidUtilities.dp(210.0f));
            arrayList.add(textView2);
            addView(textView2, i7.f6.q(-2, -2, 49));
        } else {
            ?? imageView = new ImageView(activity);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_saved_messages, 120, 120, null);
            imageView.d();
            addView((View) imageView, i7.f6.t(-2, -2, 49, 0, 2, 0, 0));
        }
        TextView textView3 = new TextView(activity);
        if (i10 == 0) {
            textView3.setText(LocaleController.getString(R.string.EncryptedDescriptionTitle));
            textView3.setTextSize(1, 15.0f);
        } else if (i10 == 1) {
            textView3.setText(LocaleController.getString(R.string.GroupEmptyTitle2));
            textView3.setTextSize(1, 15.0f);
        } else {
            textView3.setText(LocaleController.getString(R.string.ChatYourSelfTitle));
            textView3.setTextSize(1, 16.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(1);
        }
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23158ic, c6Var));
        arrayList.add(textView3);
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
        addView(textView3, i7.f6.t(-2, -2, i16, 0, 8, 0, i12));
        for (int i17 = 0; i17 < 4; i17++) {
            LinearLayout f9 = org.telegram.messenger.x3.f(activity, 0);
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            addView(f9, i7.f6.t(-2, -2, i13, 0, 8, 0, 0));
            ImageView imageView2 = new ImageView(activity);
            int i18 = org.telegram.ui.ActionBar.g6.f23158ic;
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i18, this.f35106a), PorterDuff.Mode.MULTIPLY));
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
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i18, this.f35106a));
            this.f35108c.add(textView4);
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView4.setGravity(i14 | 16);
            textView4.setMaxWidth(AndroidUtilities.dp(260.0f));
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
                f9.addView(textView4, i7.f6.n(-2, -2));
                if (i10 == 0) {
                    f9.addView(imageView2, i7.f6.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                } else if (i10 == 2) {
                    f9.addView(imageView2, i7.f6.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f9.addView(imageView2, i7.f6.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                }
            } else {
                if (i10 == 0) {
                    f9.addView(imageView2, i7.f6.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                } else if (i10 == 2) {
                    f9.addView(imageView2, i7.f6.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                } else {
                    f9.addView(imageView2, i7.f6.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                }
                f9.addView(textView4, i7.f6.n(-2, -2));
            }
        }
    }

    public void setStatusText(CharSequence charSequence) {
        this.f35107b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f35108c;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((TextView) arrayList.get(i12)).setTextColor(i10);
            i12++;
        }
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i11 < arrayList2.size()) {
                ((ImageView) arrayList2.get(i11)).setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23158ic, this.f35106a), PorterDuff.Mode.MULTIPLY));
                i11++;
            } else {
                return;
            }
        }
    }
}
