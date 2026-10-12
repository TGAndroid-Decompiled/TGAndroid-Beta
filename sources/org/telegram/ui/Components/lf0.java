package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class lf0 {
    public final of0 f27037a;

    public lf0(of0 of0Var) {
        this.f27037a = of0Var;
    }

    public final ViewGroup a(Context context, int i10) {
        boolean z10;
        boolean z11;
        String str;
        int i11;
        int i12;
        int i13;
        LinearLayout linearLayout;
        AndroidUtilities.VcardItem vcardItem;
        int i14;
        boolean z12;
        int i15;
        int i16;
        float f7;
        int i17;
        float f10;
        int i18;
        int i19;
        float f11;
        int i20;
        float f12;
        int i21;
        float f13;
        float f14;
        int i22;
        int i23;
        int i24;
        of0 of0Var = this.f27037a;
        ArrayList arrayList = of0Var.L;
        ArrayList arrayList2 = of0Var.M;
        if (i10 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            ?? frameLayout = new FrameLayout(context);
            TextView textView = new TextView(context);
            frameLayout.f27387a = textView;
            int i25 = org.telegram.ui.ActionBar.g6.G6;
            int i26 = of0.O;
            int themedColor = of0Var.getThemedColor(i25);
            boolean z13 = of0Var.J;
            textView.setTextColor(themedColor);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            if (LocaleController.isRTL) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            textView.setGravity(i15 | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i27 = i16 | 48;
            if (z14) {
                if (z13) {
                    i24 = 17;
                } else {
                    i24 = 64;
                }
                f7 = i24;
            } else {
                f7 = 72.0f;
            }
            if (z14) {
                f10 = 72.0f;
            } else {
                if (z13) {
                    i17 = 17;
                } else {
                    i17 = 64;
                }
                f10 = i17;
            }
            frameLayout.addView(textView, w7.a6.a(-1.0f, f7, 10.0f, f10, 0.0f, -1, i27));
            TextView textView2 = new TextView(context);
            frameLayout.f27388b = textView2;
            textView2.setTextColor(of0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20305z6));
            textView2.setTextSize(1, 13.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            textView2.setGravity(i18);
            boolean z15 = LocaleController.isRTL;
            if (z15) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            if (z15) {
                if (z13) {
                    i23 = 17;
                } else {
                    i23 = 64;
                }
                f11 = i23;
            } else {
                f11 = 72.0f;
            }
            if (z15) {
                f12 = 72.0f;
            } else {
                if (z13) {
                    i20 = 17;
                } else {
                    i20 = 64;
                }
                f12 = i20;
            }
            frameLayout.addView(textView2, w7.a6.a(-2.0f, f11, 35.0f, f12, 0.0f, -2, i19));
            ImageView imageView = new ImageView(context);
            frameLayout.f27389c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(of0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20064m6), PorterDuff.Mode.MULTIPLY));
            boolean z16 = LocaleController.isRTL;
            if (z16) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            int i28 = i21 | 48;
            if (z16) {
                f13 = 0.0f;
            } else {
                f13 = 20.0f;
            }
            if (z16) {
                f14 = 20.0f;
            } else {
                f14 = 0.0f;
            }
            frameLayout.addView(imageView, w7.a6.a(-2.0f, f13, 20.0f, f14, 0.0f, -2, i28));
            linearLayout = frameLayout;
            if (!z13) {
                Switch r92 = new Switch(context, null);
                frameLayout.d = r92;
                int i29 = org.telegram.ui.ActionBar.g6.M6;
                int i30 = org.telegram.ui.ActionBar.g6.N6;
                int i31 = org.telegram.ui.ActionBar.g6.f19901d6;
                r92.d(i29, i30, i31, i31);
                if (LocaleController.isRTL) {
                    i22 = 3;
                } else {
                    i22 = 5;
                }
                frameLayout.addView(r92, w7.a6.a(40.0f, 22.0f, 0.0f, 22.0f, 0.0f, 37, i22 | 16));
                linearLayout = frameLayout;
            }
        } else {
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = of0Var.N;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((AndroidUtilities.VcardItem) arrayList2.get(0)).getValue(true);
                z11 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus != null && userStatus.expires != 0) {
                    i11 = ((org.telegram.ui.ActionBar.e3) of0Var).currentAccount;
                    str = LocaleController.formatUserStatus(i11, tL_userContact_old2);
                    z11 = true;
                } else {
                    z11 = true;
                    str = null;
                }
            }
            k9 k9Var = new k9((org.telegram.ui.ActionBar.c6) null);
            k9Var.u(AndroidUtilities.dp(30.0f));
            i12 = ((org.telegram.ui.ActionBar.e3) of0Var).currentAccount;
            k9Var.m(i12, tL_userContact_old2);
            z9 z9Var = new z9(context);
            z9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
            z9Var.e(tL_userContact_old2, k9Var);
            linearLayout2.addView(z9Var, w7.a6.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.messenger.yh.k(17.0f, 1, textView3);
            textView3.setTextColor(of0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20007j5));
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            int i32 = 27;
            if (str != null) {
                i13 = 0;
            } else {
                i13 = 27;
            }
            linearLayout2.addView(textView3, w7.a6.t(-2, -2, 49, 10, 10, 10, i13));
            linearLayout = linearLayout2;
            if (str != null) {
                TextView g10 = org.telegram.messenger.q.g(context, 1, 14.0f);
                g10.setTextColor(of0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20157r5));
                g10.setSingleLine(true);
                g10.setEllipsize(truncateAt);
                g10.setText(str);
                if (!z11) {
                    i32 = 11;
                }
                linearLayout2.addView(g10, w7.a6.t(-2, -2, 49, 10, 3, 10, i32));
                linearLayout = linearLayout2;
            }
        }
        if (z10) {
            mf0 mf0Var = (mf0) linearLayout;
            int i33 = of0Var.F;
            if (i10 >= i33 && i10 < of0Var.G) {
                vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i10 - i33);
                i14 = R.drawable.msg_calls;
            } else {
                vcardItem = (AndroidUtilities.VcardItem) arrayList.get(i10 - of0Var.H);
                int i34 = vcardItem.type;
                if (i34 == 1) {
                    i14 = R.drawable.msg_mention;
                } else if (i34 == 2) {
                    i14 = R.drawable.msg_location;
                } else if (i34 == 3) {
                    i14 = R.drawable.msg_link;
                } else if (i34 == 4) {
                    i14 = R.drawable.msg_info;
                } else if (i34 == 5) {
                    i14 = R.drawable.msg_calendar2;
                } else if (i34 == 6) {
                    if ("ORG".equalsIgnoreCase(vcardItem.getRawType(true))) {
                        i14 = R.drawable.msg_work;
                    } else {
                        i14 = R.drawable.msg_jobtitle;
                    }
                } else if (i34 == 20) {
                    i14 = R.drawable.msg_info;
                } else {
                    i14 = R.drawable.msg_info;
                }
            }
            if (i10 != of0Var.E - 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView2 = mf0Var.f27389c;
            mf0Var.f27387a.setText(vcardItem.getValue(true));
            mf0Var.f27388b.setText(vcardItem.getType());
            Switch r82 = mf0Var.d;
            if (r82 != null) {
                r82.c(vcardItem.checked, false);
            }
            if (i14 != 0) {
                imageView2.setImageResource(i14);
            } else {
                imageView2.setImageDrawable(null);
            }
            mf0Var.e = z12;
            mf0Var.setWillNotDraw(!z12);
        }
        return linearLayout;
    }
}
