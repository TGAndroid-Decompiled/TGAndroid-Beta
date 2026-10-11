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
public final class of0 {
    public final rf0 f29499a;

    public of0(rf0 rf0Var) {
        this.f29499a = rf0Var;
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
        rf0 rf0Var = this.f29499a;
        ArrayList arrayList = rf0Var.L;
        ArrayList arrayList2 = rf0Var.M;
        if (i10 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            ?? frameLayout = new FrameLayout(context);
            TextView textView = new TextView(context);
            frameLayout.f29863a = textView;
            int i25 = org.telegram.ui.ActionBar.h6.G6;
            int i26 = rf0.O;
            int themedColor = rf0Var.getThemedColor(i25);
            boolean z13 = rf0Var.J;
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
            frameLayout.addView(textView, w7.x5.a(-1.0f, f7, 10.0f, f10, 0.0f, -1, i27));
            TextView textView2 = new TextView(context);
            frameLayout.f29864b = textView2;
            textView2.setTextColor(rf0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21225z6));
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
            frameLayout.addView(textView2, w7.x5.a(-2.0f, f11, 35.0f, f12, 0.0f, -2, i19));
            ImageView imageView = new ImageView(context);
            frameLayout.f29865c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(rf0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20987m6), PorterDuff.Mode.MULTIPLY));
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
            frameLayout.addView(imageView, w7.x5.a(-2.0f, f13, 20.0f, f14, 0.0f, -2, i28));
            linearLayout = frameLayout;
            if (!z13) {
                Switch r92 = new Switch(context, null);
                frameLayout.d = r92;
                int i29 = org.telegram.ui.ActionBar.h6.M6;
                int i30 = org.telegram.ui.ActionBar.h6.N6;
                int i31 = org.telegram.ui.ActionBar.h6.f20822d6;
                r92.d(i29, i30, i31, i31);
                if (LocaleController.isRTL) {
                    i22 = 3;
                } else {
                    i22 = 5;
                }
                frameLayout.addView(r92, w7.x5.a(40.0f, 22.0f, 0.0f, 22.0f, 0.0f, 37, i22 | 16));
                linearLayout = frameLayout;
            }
        } else {
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = rf0Var.N;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((AndroidUtilities.VcardItem) arrayList2.get(0)).getValue(true);
                z11 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus != null && userStatus.expires != 0) {
                    i11 = ((org.telegram.ui.ActionBar.e3) rf0Var).currentAccount;
                    str = LocaleController.formatUserStatus(i11, tL_userContact_old2);
                    z11 = true;
                } else {
                    z11 = true;
                    str = null;
                }
            }
            j9 j9Var = new j9((org.telegram.ui.ActionBar.d6) null);
            j9Var.u(AndroidUtilities.dp(30.0f));
            i12 = ((org.telegram.ui.ActionBar.e3) rf0Var).currentAccount;
            j9Var.m(i12, tL_userContact_old2);
            y9 y9Var = new y9(context);
            y9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
            y9Var.e(tL_userContact_old2, j9Var);
            linearLayout2.addView(y9Var, w7.x5.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.messenger.ai.k(17.0f, 1, textView3);
            textView3.setTextColor(rf0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20930j5));
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
            linearLayout2.addView(textView3, w7.x5.t(-2, -2, 49, 10, 10, 10, i13));
            linearLayout = linearLayout2;
            if (str != null) {
                TextView f15 = org.telegram.messenger.q.f(context, 1, 14.0f);
                f15.setTextColor(rf0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21080r5));
                f15.setSingleLine(true);
                f15.setEllipsize(truncateAt);
                f15.setText(str);
                if (!z11) {
                    i32 = 11;
                }
                linearLayout2.addView(f15, w7.x5.t(-2, -2, 49, 10, 3, 10, i32));
                linearLayout = linearLayout2;
            }
        }
        if (z10) {
            pf0 pf0Var = (pf0) linearLayout;
            int i33 = rf0Var.F;
            if (i10 >= i33 && i10 < rf0Var.G) {
                vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i10 - i33);
                i14 = R.drawable.msg_calls;
            } else {
                vcardItem = (AndroidUtilities.VcardItem) arrayList.get(i10 - rf0Var.H);
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
            if (i10 != rf0Var.E - 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView2 = pf0Var.f29865c;
            pf0Var.f29863a.setText(vcardItem.getValue(true));
            pf0Var.f29864b.setText(vcardItem.getType());
            Switch r82 = pf0Var.d;
            if (r82 != null) {
                r82.c(vcardItem.checked, false);
            }
            if (i14 != 0) {
                imageView2.setImageResource(i14);
            } else {
                imageView2.setImageDrawable(null);
            }
            pf0Var.f29866e = z12;
            pf0Var.setWillNotDraw(!z12);
        }
        return linearLayout;
    }
}
