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
public final class re0 {
    public final ue0 f30692a;

    public re0(ue0 ue0Var) {
        this.f30692a = ue0Var;
    }

    public final ViewGroup a(Context context, int i10) {
        boolean z4;
        String str;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        LinearLayout linearLayout;
        AndroidUtilities.VcardItem vcardItem;
        int i15;
        boolean z11;
        int i16;
        int i17;
        float f10;
        int i18;
        float f11;
        int i19;
        int i20;
        float f12;
        int i21;
        float f13;
        int i22;
        float f14;
        float f15;
        int i23;
        int i24;
        int i25;
        ue0 ue0Var = this.f30692a;
        ArrayList arrayList = ue0Var.I;
        ArrayList arrayList2 = ue0Var.J;
        if (i10 == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            ?? frameLayout = new FrameLayout(context);
            TextView textView = new TextView(context);
            frameLayout.f31044a = textView;
            int i26 = org.telegram.ui.ActionBar.k6.G6;
            int i27 = ue0.L;
            int themedColor = ue0Var.getThemedColor(i26);
            boolean z12 = ue0Var.G;
            textView.setTextColor(themedColor);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            if (LocaleController.isRTL) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            textView.setGravity(i16 | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            int i28 = i17 | 48;
            if (z13) {
                if (z12) {
                    i25 = 17;
                } else {
                    i25 = 64;
                }
                f10 = i25;
            } else {
                f10 = 72.0f;
            }
            if (z13) {
                f11 = 72.0f;
            } else {
                if (z12) {
                    i18 = 17;
                } else {
                    i18 = 64;
                }
                f11 = i18;
            }
            frameLayout.addView(textView, k7.c6.d(-1, -1.0f, i28, f10, 10.0f, f11, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f31045b = textView2;
            textView2.setTextColor(ue0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f22053z6));
            textView2.setTextSize(1, 13.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            textView2.setGravity(i19);
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            if (z14) {
                if (z12) {
                    i24 = 17;
                } else {
                    i24 = 64;
                }
                f12 = i24;
            } else {
                f12 = 72.0f;
            }
            if (z14) {
                f13 = 72.0f;
            } else {
                if (z12) {
                    i21 = 17;
                } else {
                    i21 = 64;
                }
                f13 = i21;
            }
            frameLayout.addView(textView2, k7.c6.d(-2, -2.0f, i20, f12, 35.0f, f13, 0.0f));
            ImageView imageView = new ImageView(context);
            frameLayout.f31046c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(ue0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21821m6), PorterDuff.Mode.MULTIPLY));
            boolean z15 = LocaleController.isRTL;
            if (z15) {
                i22 = 5;
            } else {
                i22 = 3;
            }
            int i29 = i22 | 48;
            if (z15) {
                f14 = 0.0f;
            } else {
                f14 = 20.0f;
            }
            if (z15) {
                f15 = 20.0f;
            } else {
                f15 = 0.0f;
            }
            frameLayout.addView(imageView, k7.c6.d(-2, -2.0f, i29, f14, 20.0f, f15, 0.0f));
            linearLayout = frameLayout;
            if (!z12) {
                Switch r92 = new Switch(context, null);
                frameLayout.d = r92;
                int i30 = org.telegram.ui.ActionBar.k6.M6;
                int i31 = org.telegram.ui.ActionBar.k6.N6;
                int i32 = org.telegram.ui.ActionBar.k6.f21659d6;
                r92.d(i30, i31, i32, i32);
                if (LocaleController.isRTL) {
                    i23 = 3;
                } else {
                    i23 = 5;
                }
                frameLayout.addView(r92, k7.c6.d(37, 40.0f, i23 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                linearLayout = frameLayout;
            }
        } else {
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = ue0Var.K;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((AndroidUtilities.VcardItem) arrayList2.get(0)).getValue(true);
                z10 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus != null && userStatus.expires != 0) {
                    i11 = ((org.telegram.ui.ActionBar.h3) ue0Var).currentAccount;
                    str = LocaleController.formatUserStatus(i11, tL_userContact_old2);
                } else {
                    str = null;
                }
                z10 = true;
            }
            z8 z8Var = new z8((org.telegram.ui.ActionBar.g6) null);
            z8Var.u(AndroidUtilities.dp(30.0f));
            i12 = ((org.telegram.ui.ActionBar.h3) ue0Var).currentAccount;
            z8Var.m(i12, tL_userContact_old2);
            p9 p9Var = new p9(context);
            p9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
            p9Var.e(tL_userContact_old2, z8Var);
            linearLayout2.addView(p9Var, k7.c6.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.ui.b.g(17.0f, 1, textView3);
            textView3.setTextColor(ue0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21766j5));
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            if (str != null) {
                i13 = 0;
            } else {
                i13 = 27;
            }
            linearLayout2.addView(textView3, k7.c6.t(-2, -2, 49, 10, 10, 10, i13));
            linearLayout = linearLayout2;
            if (str != null) {
                TextView g10 = org.telegram.messenger.y3.g(context, 1, 14.0f);
                g10.setTextColor(ue0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21911r5));
                g10.setSingleLine(true);
                g10.setEllipsize(truncateAt);
                g10.setText(str);
                if (z10) {
                    i14 = 27;
                } else {
                    i14 = 11;
                }
                linearLayout2.addView(g10, k7.c6.t(-2, -2, 49, 10, 3, 10, i14));
                linearLayout = linearLayout2;
            }
        }
        if (z4) {
            se0 se0Var = (se0) linearLayout;
            int i33 = ue0Var.C;
            if (i10 >= i33 && i10 < ue0Var.D) {
                vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i10 - i33);
                i15 = R.drawable.msg_calls;
            } else {
                vcardItem = (AndroidUtilities.VcardItem) arrayList.get(i10 - ue0Var.E);
                int i34 = vcardItem.type;
                if (i34 == 1) {
                    i15 = R.drawable.msg_mention;
                } else if (i34 == 2) {
                    i15 = R.drawable.msg_location;
                } else if (i34 == 3) {
                    i15 = R.drawable.msg_link;
                } else if (i34 == 4) {
                    i15 = R.drawable.msg_info;
                } else if (i34 == 5) {
                    i15 = R.drawable.msg_calendar2;
                } else if (i34 == 6) {
                    if ("ORG".equalsIgnoreCase(vcardItem.getRawType(true))) {
                        i15 = R.drawable.msg_work;
                    } else {
                        i15 = R.drawable.msg_jobtitle;
                    }
                } else if (i34 == 20) {
                    i15 = R.drawable.msg_info;
                } else {
                    i15 = R.drawable.msg_info;
                }
            }
            if (i10 != ue0Var.B - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            ImageView imageView2 = se0Var.f31046c;
            se0Var.f31044a.setText(vcardItem.getValue(true));
            se0Var.f31045b.setText(vcardItem.getType());
            Switch r82 = se0Var.d;
            if (r82 != null) {
                r82.c(vcardItem.checked, false);
            }
            if (i15 != 0) {
                imageView2.setImageResource(i15);
            } else {
                imageView2.setImageDrawable(null);
            }
            se0Var.f31047e = z11;
            se0Var.setWillNotDraw(!z11);
        }
        return linearLayout;
    }
}
