package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.we1;

public abstract class f9 {
    public static void a(org.telegram.ui.rn rnVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11, int i12) {
        org.telegram.ui.ActionBar.b5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat == null && user == null) || (parentLayout = rnVar.getParentLayout()) == null) {
            return;
        }
        if (parentLayout.getPulledDialogs() == null) {
            parentLayout.setPulledDialogs(new ArrayList());
        }
        for (e9 e9Var : parentLayout.getPulledDialogs()) {
            if (tL_forumTopic == null && e9Var.f27988f == j10) {
                return;
            }
            if (tL_forumTopic != null && (tL_forumTopic2 = e9Var.f27987e) != null && tL_forumTopic2.f22432id == tL_forumTopic.f22432id) {
                return;
            }
        }
        e9 e9Var2 = new e9();
        e9Var2.f27984a = org.telegram.ui.rn.class;
        e9Var2.f27985b = i10;
        e9Var2.f27988f = j10;
        e9Var2.h = i12;
        e9Var2.f27989g = i11;
        e9Var2.f27986c = chat;
        e9Var2.d = user;
        e9Var2.f27987e = tL_forumTopic;
        parentLayout.getPulledDialogs().add(e9Var2);
    }

    public static org.telegram.ui.ActionBar.n1 b(org.telegram.ui.ActionBar.n2 n2Var, View view, long j10, long j11, org.telegram.ui.ActionBar.c6 c6Var) {
        long j12;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.b5 b5Var;
        TLRPC.Chat chat;
        TLRPC.User user;
        long jA;
        Class<ProfileActivity> cls;
        TLRPC.User userI;
        int i10;
        int i11;
        List list;
        int i12;
        org.telegram.ui.ActionBar.b5 b5Var2;
        long j13;
        ArrayList arrayList2;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        Rect rect;
        AtomicReference atomicReference;
        int size;
        boolean z10;
        int i13;
        int iDp;
        boolean z11;
        boolean z12;
        e9 e9Var;
        TLRPC.Chat chat2;
        TLRPC.User user2;
        TLRPC.TL_forumTopic tL_forumTopic;
        n9 n9Var;
        boolean z13;
        int iDp2;
        TextView textView;
        y8 y8Var;
        boolean z14;
        boolean z15;
        TLRPC.UserProfilePhoto userProfilePhoto;
        Drawable drawable;
        String string;
        BitmapDrawable bitmapDrawable;
        TLRPC.ChatPhoto chatPhoto;
        Drawable drawable2;
        BitmapDrawable bitmapDrawable2;
        int i14;
        int i15;
        int i16;
        org.telegram.ui.ActionBar.b5 parentLayout = n2Var.getParentLayout();
        Activity parentActivity = n2Var.getParentActivity();
        View fragmentView = n2Var.getFragmentView();
        if (parentLayout == null || parentActivity == null || fragmentView == null) {
            return null;
        }
        if (j11 == 0 || ChatObject.isMonoForum(n2Var.getCurrentAccount(), j10)) {
            j12 = 0;
            arrayList = new ArrayList();
            org.telegram.ui.ActionBar.b5 parentLayout2 = n2Var.getParentLayout();
            if (parentLayout2 != null) {
                List fragmentStack = parentLayout2.getFragmentStack();
                List pulledDialogs = parentLayout2.getPulledDialogs();
                if (fragmentStack != null) {
                    int size2 = fragmentStack.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) fragmentStack.get(i17);
                        if (n2Var2 instanceof org.telegram.ui.rn) {
                            org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var2;
                            if (rnVar.N3 != 0) {
                                list = fragmentStack;
                                i12 = size2;
                                b5Var2 = parentLayout;
                            } else if (!rnVar.A9()) {
                                chat = rnVar.f42026e;
                                userI = rnVar.i();
                                jA = rnVar.a();
                                i10 = rnVar.f42182qa;
                                i11 = rnVar.f42196ra;
                                cls = org.telegram.ui.rn.class;
                                list = fragmentStack;
                                i12 = size2;
                                j13 = jA;
                                if (j13 == j10 && !(j10 == 0 && UserObject.isUserSelf(userI))) {
                                    b5Var2 = parentLayout;
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= arrayList.size()) {
                                            e9 e9Var2 = new e9();
                                            e9Var2.f27984a = cls;
                                            e9Var2.f27985b = i17;
                                            e9Var2.f27986c = chat;
                                            e9Var2.d = userI;
                                            e9Var2.f27988f = j13;
                                            e9Var2.f27989g = i10;
                                            e9Var2.h = i11;
                                            if (chat != null || userI != null) {
                                                arrayList.add(e9Var2);
                                                break;
                                            }
                                            break;
                                        }
                                        int i19 = i18;
                                        if (((e9) arrayList.get(i18)).f27988f == j13) {
                                            break;
                                        }
                                        i18 = i19 + 1;
                                    }
                                } else {
                                    b5Var2 = parentLayout;
                                }
                            } else {
                                list = fragmentStack;
                                i12 = size2;
                                b5Var2 = parentLayout;
                            }
                        } else {
                            if (n2Var2 instanceof ProfileActivity) {
                                ProfileActivity profileActivity = (ProfileActivity) n2Var2;
                                chat = profileActivity.A2;
                                try {
                                    user = profileActivity.f36043r2.user;
                                } catch (Exception unused) {
                                    user = null;
                                }
                                jA = profileActivity.a();
                                cls = ProfileActivity.class;
                                userI = user;
                                i10 = 0;
                                i11 = 0;
                                list = fragmentStack;
                                i12 = size2;
                                j13 = jA;
                                if (j13 == j10) {
                                }
                            } else {
                                list = fragmentStack;
                                i12 = size2;
                            }
                            b5Var2 = parentLayout;
                        }
                        i17++;
                        fragmentStack = list;
                        size2 = i12;
                        parentLayout = b5Var2;
                    }
                }
                b5Var = parentLayout;
                if (pulledDialogs != null) {
                    for (int size3 = pulledDialogs.size() - 1; size3 >= 0; size3--) {
                        e9 e9Var3 = (e9) pulledDialogs.get(size3);
                        if (e9Var3.f27988f != j10) {
                            int i20 = 0;
                            while (true) {
                                if (i20 >= arrayList.size()) {
                                    arrayList.add(e9Var3);
                                    break;
                                }
                                if (((e9) arrayList.get(i20)).f27988f == e9Var3.f27988f) {
                                    break;
                                }
                                i20++;
                            }
                        }
                    }
                }
                Collections.sort(arrayList, new k9.a(20));
            }
            arrayList2 = arrayList;
            if (arrayList2.size() <= 0) {
                return null;
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, parentActivity, c6Var);
            rect = new Rect();
            n2Var.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate().getPadding(rect);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
            atomicReference = new AtomicReference();
            size = arrayList2.size();
            z10 = false;
            i13 = 0;
            while (i13 < size) {
                if (i13 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i13 == size - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e9Var = (e9) arrayList2.get(i13);
                chat2 = e9Var.f27986c;
                user2 = e9Var.d;
                tL_forumTopic = e9Var.f27987e;
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                ArrayList arrayList3 = arrayList2;
                frameLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                n9Var = new n9(parentActivity);
                z13 = z10;
                if (chat2 == null || user2 != null) {
                    if (chat2 == null && chat2.forum) {
                        iDp2 = AndroidUtilities.dp(8.0f);
                    } else {
                        iDp2 = AndroidUtilities.dp(16.0f);
                    }
                    n9Var.setRoundRadius(iDp2);
                } else {
                    n9Var.setRoundRadius(0);
                }
                frameLayout.addView(n9Var, h7.z5.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                textView = new TextView(parentActivity);
                AtomicReference atomicReference2 = atomicReference;
                textView.setLines(1);
                int i21 = size;
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var));
                textView.setEllipsize(TextUtils.TruncateAt.END);
                frameLayout.addView(textView, h7.z5.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
                y8Var.f34858p = 0.8f;
                if (tL_forumTopic != null) {
                    if (tL_forumTopic.f22432id == 1) {
                        n9Var.setImageDrawable(wf.c.c(fragmentView.getContext(), 1.0f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ac, c6Var), false));
                    } else if (tL_forumTopic.icon_emoji_id != j12) {
                        n9Var.setAnimatedEmojiDrawable(new k5(10, n2Var.getCurrentAccount(), tL_forumTopic.icon_emoji_id));
                    } else {
                        n9Var.setImageDrawable(wf.c.e(tL_forumTopic));
                    }
                    textView.setText(tL_forumTopic.title);
                } else {
                    i13 = i13;
                    if (chat2 != null) {
                        y8Var.k(n2Var.getCurrentAccount(), chat2);
                        chatPhoto = chat2.photo;
                        if (chatPhoto != null && (bitmapDrawable2 = chatPhoto.strippedBitmap) != null) {
                            drawable2 = y8Var;
                            drawable2 = y8Var;
                            drawable2 = bitmapDrawable2;
                        }
                        drawable2 = y8Var;
                        drawable2 = y8Var;
                        drawable2 = y8Var;
                        n9Var.h(ImageLocation.getForChat(n2Var.getCurrentAccount(), chat2, 1), "50_50", drawable2, chat2);
                        textView.setText(chat2.title);
                    } else if (user2 != null) {
                        userProfilePhoto = user2.photo;
                        if (userProfilePhoto != null || (bitmapDrawable = userProfilePhoto.strippedBitmap) == null) {
                            drawable = bitmapDrawable;
                            drawable = y8Var;
                        }
                        drawable = bitmapDrawable;
                        if (e9Var.f27984a == org.telegram.ui.rn.class || !UserObject.isUserSelf(user2)) {
                            if (UserObject.isReplyUser(user2)) {
                                string = LocaleController.getString(R.string.RepliesTitle);
                                y8Var.g(12);
                                n9Var.setImageDrawable(y8Var);
                            } else if (UserObject.isDeleted(user2)) {
                                string = LocaleController.getString(R.string.HiddenName);
                                y8Var.m(n2Var.getCurrentAccount(), user2);
                                n9Var.h(ImageLocation.getForUser(n2Var.getCurrentAccount(), user2, 1), "50_50", y8Var, user2);
                            } else {
                                String userName = UserObject.getUserName(user2);
                                y8Var.m(n2Var.getCurrentAccount(), user2);
                                n9Var.h(ImageLocation.getForUser(n2Var.getCurrentAccount(), user2, 1), "50_50", drawable, user2);
                                string = userName;
                            }
                            textView.setText(string);
                            z15 = false;
                            z14 = true;
                        } else {
                            string = LocaleController.getString(R.string.SavedMessages);
                            y8Var.g(1);
                            n9Var.setImageDrawable(y8Var);
                        }
                        textView.setText(string);
                        z15 = false;
                        z14 = true;
                    } else {
                        e9Var = e9Var;
                        n9Var.setImageDrawable(parentActivity.getDrawable(R.drawable.msg_viewchats).mutate());
                        n9Var.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                        n9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var), PorterDuff.Mode.MULTIPLY));
                        textView.setText(LocaleController.getString(R.string.AllChats));
                        z14 = z13;
                        z15 = true;
                    }
                    frameLayout.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 2, -1));
                    org.telegram.ui.ActionBar.b5 b5Var3 = b5Var;
                    atomicReference = atomicReference2;
                    frameLayout.setOnClickListener(new jh.b0(atomicReference, e9Var, b5Var3, tL_forumTopic, n2Var, 9));
                    if (z11) {
                        i14 = 3;
                    } else {
                        i14 = 0;
                    }
                    if (z12) {
                        i15 = 3;
                    } else {
                        i15 = 0;
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, h7.z5.p(-1, 44, 0.0f, 0, 0, i14, 0, i15));
                    if (z15) {
                        View frameLayout2 = new FrameLayout(parentActivity);
                        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H8, c6Var));
                        frameLayout2.setTag(R.id.fit_width_tag, 1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, h7.z5.n(-1, 8));
                    }
                    i13++;
                    arrayList2 = arrayList3;
                    b5Var = b5Var3;
                    z10 = z14;
                    size = i21;
                }
                e9Var = e9Var;
                z15 = false;
                z14 = true;
                frameLayout.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 2, -1));
                org.telegram.ui.ActionBar.b5 b5Var4 = b5Var;
                atomicReference = atomicReference2;
                frameLayout.setOnClickListener(new jh.b0(atomicReference, e9Var, b5Var4, tL_forumTopic, n2Var, 9));
                if (z11) {
                    i14 = 3;
                } else {
                    i14 = 0;
                }
                if (z12) {
                    i15 = 3;
                } else {
                    i15 = 0;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, h7.z5.p(-1, 44, 0.0f, 0, 0, i14, 0, i15));
                if (z15) {
                    View frameLayout3 = new FrameLayout(parentActivity);
                    frameLayout3.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H8, c6Var));
                    frameLayout3.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, h7.z5.n(-1, 8));
                }
                i13++;
                arrayList2 = arrayList3;
                b5Var = b5Var4;
                z10 = z14;
                size = i21;
            }
            if (!z10) {
                return null;
            }
            org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            atomicReference.set(n1Var);
            n1Var.f23684e = true;
            n1Var.f23683c = 220;
            n1Var.setOutsideTouchable(true);
            n1Var.setClippingEnabled(true);
            n1Var.setAnimationStyle(R.style.PopupContextAnimation);
            n1Var.setFocusable(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            n1Var.setInputMethodMode(2);
            n1Var.setSoftInputMode(0);
            n1Var.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            iDp = AndroidUtilities.dp(7.0f) - rect.left;
            if (AndroidUtilities.isTablet()) {
                int[] iArr = new int[2];
                fragmentView.getLocationInWindow(iArr);
                iDp += iArr[0];
            }
            n1Var.showAtLocation(fragmentView, 51, iDp, (view.getBottom() - rect.top) - AndroidUtilities.dp(1.0f));
            return n1Var;
        }
        arrayList = new ArrayList();
        org.telegram.ui.ActionBar.b5 parentLayout3 = n2Var.getParentLayout();
        if (parentLayout3 == null) {
            j12 = 0;
        } else {
            j12 = 0;
            List pulledDialogs2 = parentLayout3.getPulledDialogs();
            if (pulledDialogs2 != null) {
                i16 = -1;
                for (int i22 = 0; i22 < pulledDialogs2.size(); i22++) {
                    e9 e9Var4 = (e9) pulledDialogs2.get(i22);
                    TLRPC.TL_forumTopic tL_forumTopic2 = e9Var4.f27987e;
                    if (tL_forumTopic2 != null && tL_forumTopic2.f22432id != j11) {
                        int i23 = e9Var4.f27985b;
                        if (i23 >= i16) {
                            i16 = i23;
                        }
                        arrayList.add(e9Var4);
                    }
                }
            } else {
                i16 = -1;
            }
            if (parentLayout3.getFragmentStack().size() <= 1 || !(parentLayout3.getFragmentStack().get(parentLayout3.getFragmentStack().size() - 2) instanceof we1)) {
                e9 e9Var5 = new e9();
                arrayList.add(e9Var5);
                e9Var5.f27985b = -1;
                e9Var5.f27984a = we1.class;
                e9Var5.f27986c = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j10));
            } else {
                e9 e9Var6 = new e9();
                arrayList.add(e9Var6);
                e9Var6.f27985b = i16 + 1;
                e9Var6.f27984a = org.telegram.ui.gy.class;
                e9 e9Var7 = new e9();
                arrayList.add(e9Var7);
                e9Var7.f27985b = -1;
                e9Var7.f27984a = we1.class;
                e9Var7.f27986c = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j10));
            }
            Collections.sort(arrayList, new k9.a(21));
        }
        b5Var = parentLayout;
        arrayList2 = arrayList;
        if (arrayList2.size() <= 0) {
            return null;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, parentActivity, c6Var);
        rect = new Rect();
        n2Var.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate().getPadding(rect);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
        atomicReference = new AtomicReference();
        size = arrayList2.size();
        z10 = false;
        i13 = 0;
        while (i13 < size) {
            if (i13 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i13 == size - 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            e9Var = (e9) arrayList2.get(i13);
            chat2 = e9Var.f27986c;
            user2 = e9Var.d;
            tL_forumTopic = e9Var.f27987e;
            FrameLayout frameLayout4 = new FrameLayout(parentActivity);
            ArrayList arrayList4 = arrayList2;
            frameLayout4.setMinimumWidth(AndroidUtilities.dp(200.0f));
            n9Var = new n9(parentActivity);
            z13 = z10;
            if (chat2 == null) {
                if (chat2 == null) {
                    iDp2 = AndroidUtilities.dp(16.0f);
                } else {
                    iDp2 = AndroidUtilities.dp(16.0f);
                }
                n9Var.setRoundRadius(iDp2);
            } else {
                if (chat2 == null) {
                    iDp2 = AndroidUtilities.dp(16.0f);
                } else {
                    iDp2 = AndroidUtilities.dp(16.0f);
                }
                n9Var.setRoundRadius(iDp2);
            }
            frameLayout4.addView(n9Var, h7.z5.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
            textView = new TextView(parentActivity);
            AtomicReference atomicReference3 = atomicReference;
            textView.setLines(1);
            int i24 = size;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var));
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout4.addView(textView, h7.z5.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
            y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
            y8Var.f34858p = 0.8f;
            if (tL_forumTopic != null) {
                if (tL_forumTopic.f22432id == 1) {
                    n9Var.setImageDrawable(wf.c.c(fragmentView.getContext(), 1.0f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ac, c6Var), false));
                } else if (tL_forumTopic.icon_emoji_id != j12) {
                    n9Var.setAnimatedEmojiDrawable(new k5(10, n2Var.getCurrentAccount(), tL_forumTopic.icon_emoji_id));
                } else {
                    n9Var.setImageDrawable(wf.c.e(tL_forumTopic));
                }
                textView.setText(tL_forumTopic.title);
            } else {
                i13 = i13;
                if (chat2 != null) {
                    y8Var.k(n2Var.getCurrentAccount(), chat2);
                    chatPhoto = chat2.photo;
                    if (chatPhoto != null) {
                        drawable2 = y8Var;
                        drawable2 = y8Var;
                        drawable2 = bitmapDrawable2;
                    }
                    drawable2 = y8Var;
                    drawable2 = y8Var;
                    drawable2 = y8Var;
                    n9Var.h(ImageLocation.getForChat(n2Var.getCurrentAccount(), chat2, 1), "50_50", drawable2, chat2);
                    textView.setText(chat2.title);
                } else if (user2 != null) {
                    userProfilePhoto = user2.photo;
                    if (userProfilePhoto != null) {
                        drawable = bitmapDrawable;
                        drawable = y8Var;
                    } else {
                        drawable = bitmapDrawable;
                        drawable = y8Var;
                    }
                    drawable = bitmapDrawable;
                    if (e9Var.f27984a == org.telegram.ui.rn.class) {
                        if (UserObject.isReplyUser(user2)) {
                            string = LocaleController.getString(R.string.RepliesTitle);
                            y8Var.g(12);
                            n9Var.setImageDrawable(y8Var);
                        } else if (UserObject.isDeleted(user2)) {
                            string = LocaleController.getString(R.string.HiddenName);
                            y8Var.m(n2Var.getCurrentAccount(), user2);
                            n9Var.h(ImageLocation.getForUser(n2Var.getCurrentAccount(), user2, 1), "50_50", y8Var, user2);
                        } else {
                            String userName2 = UserObject.getUserName(user2);
                            y8Var.m(n2Var.getCurrentAccount(), user2);
                            n9Var.h(ImageLocation.getForUser(n2Var.getCurrentAccount(), user2, 1), "50_50", drawable, user2);
                            string = userName2;
                        }
                    } else if (UserObject.isReplyUser(user2)) {
                        string = LocaleController.getString(R.string.RepliesTitle);
                        y8Var.g(12);
                        n9Var.setImageDrawable(y8Var);
                    } else if (UserObject.isDeleted(user2)) {
                        string = LocaleController.getString(R.string.HiddenName);
                        y8Var.m(n2Var.getCurrentAccount(), user2);
                        n9Var.h(ImageLocation.getForUser(n2Var.getCurrentAccount(), user2, 1), "50_50", y8Var, user2);
                    } else {
                        String userName3 = UserObject.getUserName(user2);
                        y8Var.m(n2Var.getCurrentAccount(), user2);
                        n9Var.h(ImageLocation.getForUser(n2Var.getCurrentAccount(), user2, 1), "50_50", drawable, user2);
                        string = userName3;
                    }
                    textView.setText(string);
                    z15 = false;
                    z14 = true;
                } else {
                    e9Var = e9Var;
                    n9Var.setImageDrawable(parentActivity.getDrawable(R.drawable.msg_viewchats).mutate());
                    n9Var.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                    n9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var), PorterDuff.Mode.MULTIPLY));
                    textView.setText(LocaleController.getString(R.string.AllChats));
                    z14 = z13;
                    z15 = true;
                }
                frameLayout4.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 2, -1));
                org.telegram.ui.ActionBar.b5 b5Var5 = b5Var;
                atomicReference = atomicReference3;
                frameLayout4.setOnClickListener(new jh.b0(atomicReference, e9Var, b5Var5, tL_forumTopic, n2Var, 9));
                if (z11) {
                    i14 = 3;
                } else {
                    i14 = 0;
                }
                if (z12) {
                    i15 = 3;
                } else {
                    i15 = 0;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout4, h7.z5.p(-1, 44, 0.0f, 0, 0, i14, 0, i15));
                if (z15) {
                    View frameLayout5 = new FrameLayout(parentActivity);
                    frameLayout5.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H8, c6Var));
                    frameLayout5.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout5, h7.z5.n(-1, 8));
                }
                i13++;
                arrayList2 = arrayList4;
                b5Var = b5Var5;
                z10 = z14;
                size = i24;
            }
            e9Var = e9Var;
            z15 = false;
            z14 = true;
            frameLayout4.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 2, -1));
            org.telegram.ui.ActionBar.b5 b5Var6 = b5Var;
            atomicReference = atomicReference3;
            frameLayout4.setOnClickListener(new jh.b0(atomicReference, e9Var, b5Var6, tL_forumTopic, n2Var, 9));
            if (z11) {
                i14 = 3;
            } else {
                i14 = 0;
            }
            if (z12) {
                i15 = 3;
            } else {
                i15 = 0;
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout4, h7.z5.p(-1, 44, 0.0f, 0, 0, i14, 0, i15));
            if (z15) {
                View frameLayout6 = new FrameLayout(parentActivity);
                frameLayout6.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H8, c6Var));
                frameLayout6.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout6, h7.z5.n(-1, 8));
            }
            i13++;
            arrayList2 = arrayList4;
            b5Var = b5Var6;
            z10 = z14;
            size = i24;
        }
        if (!z10) {
            return null;
        }
        org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        atomicReference.set(n1Var2);
        n1Var2.f23684e = true;
        n1Var2.f23683c = 220;
        n1Var2.setOutsideTouchable(true);
        n1Var2.setClippingEnabled(true);
        n1Var2.setAnimationStyle(R.style.PopupContextAnimation);
        n1Var2.setFocusable(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        n1Var2.setInputMethodMode(2);
        n1Var2.setSoftInputMode(0);
        n1Var2.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        iDp = AndroidUtilities.dp(7.0f) - rect.left;
        if (AndroidUtilities.isTablet()) {
            int[] iArr2 = new int[2];
            fragmentView.getLocationInWindow(iArr2);
            iDp += iArr2[0];
        }
        n1Var2.showAtLocation(fragmentView, 51, iDp, (view.getBottom() - rect.top) - AndroidUtilities.dp(1.0f));
        return n1Var2;
    }
}
