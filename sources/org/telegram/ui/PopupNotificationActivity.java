package org.telegram.ui;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
public class PopupNotificationActivity extends Activity implements NotificationCenter.NotificationCenterDelegate {
    public static final int X = 0;
    public lv0 A;
    public int G;
    public TLRPC.User I;
    public TLRPC.Chat J;
    public CharSequence L;
    public boolean V;
    public org.telegram.ui.ActionBar.k f35828a;
    public ChatActivityEnterView f35829b;
    public org.telegram.ui.Components.o9 f35830c;
    public TextView d;
    public TextView f35831e;
    public FrameLayout f35832f;
    public TextView h;
    public m0 f35833n;
    public ViewGroup f35834r;
    public ViewGroup f35835s;
    public ViewGroup v;
    public LinearLayout f35836w;
    public LinearLayout f35837x;
    public LinearLayout f35838y;
    public final ArrayList B = new ArrayList();
    public final ArrayList C = new ArrayList();
    public final ArrayList D = new ArrayList();
    public VelocityTracker E = null;
    public final org.telegram.ui.Components.tv0[] F = new org.telegram.ui.Components.tv0[5];
    public int H = -1;
    public boolean K = false;
    public MessageObject M = null;
    public final MessageObject[] N = new MessageObject[3];
    public int O = 0;
    public PowerManager.WakeLock P = null;
    public boolean Q = false;
    public long R = 0;
    public float S = -1.0f;
    public boolean T = false;
    public Runnable U = null;
    public final ArrayList W = new ArrayList();

    public final void a(int i9) {
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
        ViewGroup viewGroup = this.f35835s;
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams.width != dp) {
                layoutParams.width = dp;
                this.f35835s.setLayoutParams(layoutParams);
            }
            this.f35835s.setTranslationX((-dp) + i9);
        }
        LinearLayout linearLayout = this.f35837x;
        if (linearLayout != null) {
            linearLayout.setTranslationX((-dp) + i9);
        }
        ViewGroup viewGroup2 = this.f35834r;
        if (viewGroup2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            if (layoutParams2.width != dp) {
                layoutParams2.width = dp;
                this.f35834r.setLayoutParams(layoutParams2);
            }
            this.f35834r.setTranslationX(i9);
        }
        LinearLayout linearLayout2 = this.f35836w;
        if (linearLayout2 != null) {
            linearLayout2.setTranslationX(i9);
        }
        ViewGroup viewGroup3 = this.v;
        if (viewGroup3 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup3.getLayoutParams();
            if (layoutParams3.width != dp) {
                layoutParams3.width = dp;
                this.v.setLayoutParams(layoutParams3);
            }
            this.v.setTranslationX(dp + i9);
        }
        LinearLayout linearLayout3 = this.f35838y;
        if (linearLayout3 != null) {
            linearLayout3.setTranslationX(dp + i9);
        }
        this.f35833n.invalidate();
    }

    public final void b() {
        TLRPC.User user;
        MessageObject messageObject = this.M;
        if (messageObject != null) {
            if (this.J != null) {
                TLRPC.Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(this.J.f22380id));
                if (chat != null) {
                    this.J = chat;
                    if (this.f35830c != null) {
                        this.f35830c.e(chat, new org.telegram.ui.Components.z8(this.J));
                    }
                }
            } else if (this.I != null && (user = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(this.I.f22527id))) != null) {
                this.I = user;
                if (this.f35830c != null) {
                    this.f35830c.e(user, new org.telegram.ui.Components.z8(0, this.I));
                }
            }
        }
    }

    public final boolean c() {
        if (this.Q && this.R < System.currentTimeMillis() - 400) {
            this.Q = false;
            Runnable runnable = this.U;
            if (runnable != null) {
                runnable.run();
                this.U = null;
            }
        }
        return this.Q;
    }

    public final void d() {
        FrameLayout frameLayout = this.f35832f;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new nv0(this, 0));
        }
        m0 m0Var = this.f35833n;
        if (m0Var != null) {
            m0Var.getViewTreeObserver().addOnPreDrawListener(new nv0(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TextView textView;
        org.telegram.ui.Components.bg0 bg0Var;
        MessageObject messageObject;
        org.telegram.ui.Components.bg0 bg0Var2;
        MessageObject messageObject2;
        MessageObject messageObject3;
        if (i9 == NotificationCenter.appDidLogout) {
            if (i10 == this.H) {
                i();
                finish();
                return;
            }
            return;
        }
        int i11 = 0;
        if (i9 == NotificationCenter.pushMessagesUpdated) {
            if (!this.V) {
                ArrayList arrayList = this.W;
                arrayList.clear();
                for (int i12 = 0; i12 < 4; i12++) {
                    if (UserConfig.getInstance(i12).isClientActivated()) {
                        arrayList.addAll(NotificationsController.getInstance(i12).popupMessages);
                    }
                }
                f();
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < 3; i13++) {
                        int i14 = (this.O - 1) + i13;
                        if (arrayList.size() == 1 && (i14 < 0 || i14 >= arrayList.size())) {
                            messageObject3 = null;
                        } else {
                            if (i14 == -1) {
                                i14 = arrayList.size() - 1;
                            } else if (i14 == arrayList.size()) {
                                i14 = 0;
                            }
                            messageObject3 = (MessageObject) arrayList.get(i14);
                        }
                        if (this.N[i13] != messageObject3) {
                            q(0);
                        }
                    }
                }
            }
        } else if (i9 == NotificationCenter.updateInterfaces) {
            if (this.M != null && i10 == this.H) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0) {
                    r();
                }
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0) {
                    b();
                }
                if ((intValue & MessagesController.UPDATE_MASK_USER_PRINT) != 0) {
                    CharSequence printingString = MessagesController.getInstance(this.M.currentAccount).getPrintingString(this.M.getDialogId(), 0L, false);
                    CharSequence charSequence = this.L;
                    if ((charSequence != null && printingString == null) || ((charSequence == null && printingString != null) || (charSequence != null && !charSequence.equals(printingString)))) {
                        r();
                    }
                }
            }
        } else if (i9 == NotificationCenter.messagePlayingDidReset) {
            Integer num = (Integer) objArr[0];
            m0 m0Var = this.f35833n;
            if (m0Var != null) {
                int childCount = m0Var.getChildCount();
                while (i11 < childCount) {
                    View childAt = this.f35833n.getChildAt(i11);
                    if (((Integer) childAt.getTag()).intValue() == 3 && (messageObject2 = (bg0Var2 = (org.telegram.ui.Components.bg0) childAt.findViewWithTag(300)).getMessageObject()) != null && messageObject2.currentAccount == i10 && messageObject2.getId() == num.intValue()) {
                        bg0Var2.r();
                        return;
                    }
                    i11++;
                }
            }
        } else if (i9 == NotificationCenter.messagePlayingProgressDidChanged) {
            Integer num2 = (Integer) objArr[0];
            m0 m0Var2 = this.f35833n;
            if (m0Var2 != null) {
                int childCount2 = m0Var2.getChildCount();
                while (i11 < childCount2) {
                    View childAt2 = this.f35833n.getChildAt(i11);
                    if (((Integer) childAt2.getTag()).intValue() == 3 && (messageObject = (bg0Var = (org.telegram.ui.Components.bg0) childAt2.findViewWithTag(300)).getMessageObject()) != null && messageObject.currentAccount == i10 && messageObject.getId() == num2.intValue()) {
                        bg0Var.s();
                        return;
                    }
                    i11++;
                }
            }
        } else if (i9 == NotificationCenter.emojiLoaded) {
            m0 m0Var3 = this.f35833n;
            if (m0Var3 != null) {
                int childCount3 = m0Var3.getChildCount();
                while (i11 < childCount3) {
                    View childAt3 = this.f35833n.getChildAt(i11);
                    if (((Integer) childAt3.getTag()).intValue() == 1 && (textView = (TextView) childAt3.findViewWithTag(301)) != null) {
                        textView.invalidate();
                    }
                    i11++;
                }
            }
        } else if (i9 == NotificationCenter.contactsDidLoad && i10 == this.H) {
            r();
        }
    }

    public final LinearLayout e(int i9, boolean z10) {
        int i10;
        LinearLayout linearLayout;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList;
        int i11;
        Object obj;
        int i12 = i9;
        ArrayList arrayList2 = this.W;
        Object obj2 = null;
        if (arrayList2.size() == 1 && (i12 < 0 || i12 >= arrayList2.size())) {
            return null;
        }
        boolean z11 = false;
        if (i12 == -1) {
            i12 = arrayList2.size() - 1;
        } else if (i12 == arrayList2.size()) {
            i12 = 0;
        }
        MessageObject messageObject = (MessageObject) arrayList2.get(i12);
        TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
        if (messageObject.getDialogId() == 777000 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size = arrayList3.size();
            i10 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i13);
                int size2 = keyboardInlineButtonRow.buttons.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    if (gf.c.c(keyboardInlineButtonRow.buttons.get(i14), TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        i10++;
                    }
                }
            }
        } else {
            i10 = 0;
        }
        int i15 = messageObject.currentAccount;
        if (i10 > 0 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList4 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size3 = arrayList4.size();
            LinearLayout linearLayout2 = null;
            int i16 = 0;
            while (i16 < size3) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow2 = arrayList4.get(i16);
                int size4 = keyboardInlineButtonRow2.buttons.size();
                int i17 = 0;
                ?? r62 = z11;
                while (i17 < size4) {
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow2.buttons.get(i17);
                    if (gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        if (linearLayout2 == null) {
                            linearLayout2 = new LinearLayout(this);
                            linearLayout2.setOrientation(r62);
                            arrayList = arrayList4;
                            linearLayout2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, r62));
                            linearLayout2.setWeightSum(100.0f);
                            linearLayout2.setTag("b");
                            linearLayout2.setOnTouchListener(new jh.d(29));
                        } else {
                            arrayList = arrayList4;
                        }
                        TextView textView = new TextView(this);
                        textView.setTextSize(1, 16.0f);
                        i11 = size3;
                        obj = null;
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23179n6, false));
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setText(keyboardInlineButton.text.toUpperCase());
                        textView.setTag(keyboardInlineButton);
                        textView.setGravity(17);
                        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                        linearLayout2.addView(textView, g7.e6.l(100.0f / i10, -1, -1));
                        textView.setOnClickListener(new gh.z0(messageObject, i15));
                    } else {
                        arrayList = arrayList4;
                        i11 = size3;
                        obj = obj2;
                    }
                    i17++;
                    obj2 = obj;
                    size3 = i11;
                    arrayList4 = arrayList;
                    r62 = 0;
                }
                i16++;
                size3 = size3;
                arrayList4 = arrayList4;
                z11 = false;
            }
            linearLayout = linearLayout2;
        } else {
            linearLayout = null;
        }
        if (linearLayout != null) {
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            if (z10) {
                int i18 = this.O;
                if (i12 == i18) {
                    linearLayout.setTranslationX(0.0f);
                } else if (i12 == i18 - 1) {
                    linearLayout.setTranslationX(-dp);
                } else if (i12 == i18 + 1) {
                    linearLayout.setTranslationX(dp);
                }
            }
            this.A.addView(linearLayout, layoutParams);
        }
        return linearLayout;
    }

    public final void f() {
        ArrayList arrayList = this.W;
        if (arrayList.isEmpty()) {
            i();
            finish();
            return;
        }
        if ((this.O != 0 || this.f35829b.j0() || this.T) && this.M != null) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i9);
                if (messageObject.currentAccount == this.M.currentAccount && messageObject.getDialogId() == this.M.getDialogId() && messageObject.getId() == this.M.getId()) {
                    this.O = i9;
                    if (this.T) {
                        if (i9 == arrayList.size() - 1) {
                            l(3);
                        } else if (this.O == 1) {
                            l(4);
                        }
                    }
                    this.h.setText(String.format("%d/%d", Integer.valueOf(this.O + 1), Integer.valueOf(arrayList.size())));
                }
            }
        }
        this.O = 0;
        this.M = (MessageObject) arrayList.get(0);
        q(0);
        this.h.setText(String.format("%d/%d", Integer.valueOf(this.O + 1), Integer.valueOf(arrayList.size())));
    }

    public final ViewGroup g(int i9, boolean z10) {
        ViewGroup frameLayout;
        boolean z11;
        org.telegram.ui.Components.bg0 bg0Var;
        int i10 = i9;
        ArrayList arrayList = this.W;
        if (arrayList.size() == 1 && (i10 < 0 || i10 >= arrayList.size())) {
            return null;
        }
        if (i10 == -1) {
            i10 = arrayList.size() - 1;
        } else if (i10 == arrayList.size()) {
            i10 = 0;
        }
        MessageObject messageObject = (MessageObject) arrayList.get(i10);
        int i11 = messageObject.type;
        if ((i11 == 1 || i11 == 4) && !messageObject.isSecretMedia()) {
            ArrayList arrayList2 = this.C;
            if (arrayList2.size() > 0) {
                frameLayout = (ViewGroup) arrayList2.get(0);
                arrayList2.remove(0);
            } else {
                frameLayout = new FrameLayout(this);
                FrameLayout frameLayout2 = new FrameLayout(this);
                frameLayout2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                frameLayout2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                frameLayout.addView(frameLayout2, g7.e6.c(-1.0f, -1));
                org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(this);
                o9Var.setTag(311);
                frameLayout2.addView(o9Var, g7.e6.c(-1.0f, -1));
                TextView textView = new TextView(this);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
                textView.setTextSize(1, 16.0f);
                textView.setGravity(17);
                textView.setTag(312);
                frameLayout2.addView(textView, g7.e6.e(-1, -2, 17));
                frameLayout.setTag(2);
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final PopupNotificationActivity f39935b;

                    {
                        this.f39935b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i12 = r2;
                        PopupNotificationActivity popupNotificationActivity = this.f39935b;
                        switch (i12) {
                            case 0:
                                int i13 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                return;
                            case 1:
                                int i14 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                return;
                            default:
                                int i15 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                return;
                        }
                    }
                });
            }
            TextView textView2 = (TextView) frameLayout.findViewWithTag(312);
            org.telegram.ui.Components.o9 o9Var2 = (org.telegram.ui.Components.o9) frameLayout.findViewWithTag(311);
            o9Var2.setAspectFit(true);
            int i12 = messageObject.type;
            if (i12 == 1) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 100);
                if (closestPhotoSizeWithSize != null) {
                    if (messageObject.type == 1 && !FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(messageObject.messageOwner).exists()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!messageObject.needDrawBluredPreview()) {
                        if (!z11 && !DownloadController.getInstance(messageObject.currentAccount).canDownloadMedia(messageObject)) {
                            if (closestPhotoSizeWithSize2 != null) {
                                o9Var2.i(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), "100_100_b", null, null, messageObject);
                            }
                        } else {
                            o9Var2.j(ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "100_100", ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), "100_100_b", closestPhotoSizeWithSize.size, messageObject);
                        }
                        o9Var2.setVisibility(0);
                        textView2.setVisibility(8);
                    }
                }
                o9Var2.setVisibility(8);
                textView2.setVisibility(0);
                textView2.setTextSize(2, SharedConfig.fontSize);
                textView2.setText(messageObject.messageText);
            } else if (i12 == 4) {
                textView2.setVisibility(8);
                textView2.setText(messageObject.messageText);
                o9Var2.setVisibility(0);
                TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d9 = geoPoint._long;
                if (MessagesController.getInstance(messageObject.currentAccount).mapProvider == 2) {
                    o9Var2.i(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, 100, 100, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), null, null, null, messageObject);
                } else {
                    o9Var2.f(AndroidUtilities.formapMapUrl(messageObject.currentAccount, d, d9, 100, 100, true, 15, -1), null, null);
                }
            }
        } else if (messageObject.type == 2) {
            ArrayList arrayList3 = this.D;
            if (arrayList3.size() > 0) {
                ViewGroup viewGroup = (ViewGroup) arrayList3.get(0);
                arrayList3.remove(0);
                bg0Var = (org.telegram.ui.Components.bg0) viewGroup.findViewWithTag(300);
                frameLayout = viewGroup;
            } else {
                ViewGroup frameLayout3 = new FrameLayout(this);
                FrameLayout frameLayout4 = new FrameLayout(this);
                frameLayout4.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                frameLayout4.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                frameLayout3.addView(frameLayout4, g7.e6.c(-1.0f, -1));
                FrameLayout frameLayout5 = new FrameLayout(this);
                frameLayout4.addView(frameLayout5, g7.e6.d(-1, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
                ?? a0Var = new org.telegram.ui.Cells.a0(this);
                a0Var.f27199f = false;
                a0Var.f27205y = 0;
                a0Var.C = 0;
                a0Var.F = 0;
                TextPaint textPaint = new TextPaint(1);
                a0Var.f27201r = textPaint;
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                a0Var.G = DownloadController.getInstance(a0Var.f27200n).generateObserverTag();
                org.telegram.ui.Components.ln0 ln0Var = new org.telegram.ui.Components.ln0(a0Var);
                a0Var.f27202s = ln0Var;
                ln0Var.h = a0Var;
                ?? obj = new Object();
                obj.f30093c = 0.0f;
                obj.f30095f = AndroidUtilities.dp(2.0f);
                obj.f30091a = new Paint();
                obj.f30092b = new Paint();
                a0Var.v = obj;
                a0Var.setTag(300);
                frameLayout5.addView(a0Var);
                frameLayout3.setTag(3);
                frameLayout3.setOnClickListener(new View.OnClickListener(this) {
                    public final PopupNotificationActivity f39935b;

                    {
                        this.f39935b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i122 = r2;
                        PopupNotificationActivity popupNotificationActivity = this.f39935b;
                        switch (i122) {
                            case 0:
                                int i13 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                return;
                            case 1:
                                int i14 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                return;
                            default:
                                int i15 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                return;
                        }
                    }
                });
                frameLayout = frameLayout3;
                bg0Var = a0Var;
            }
            bg0Var.setMessageObject(messageObject);
            if (DownloadController.getInstance(messageObject.currentAccount).canDownloadMedia(messageObject) && bg0Var.f27205y == 2) {
                FileLoader.getInstance(bg0Var.f27200n).loadFile(bg0Var.h.getDocument(), bg0Var.h, 1, 0);
                bg0Var.f27205y = 3;
                bg0Var.invalidate();
            }
        } else {
            ArrayList arrayList4 = this.B;
            if (arrayList4.size() > 0) {
                arrayList4.remove(0);
                frameLayout = (ViewGroup) arrayList4.get(0);
            } else {
                frameLayout = new FrameLayout(this);
                ScrollView scrollView = new ScrollView(this);
                scrollView.setFillViewport(true);
                frameLayout.addView(scrollView, g7.e6.c(-1.0f, -1));
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(0);
                linearLayout.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                scrollView.addView(linearLayout, g7.e6.x(-1, -2, 1));
                linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                linearLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final PopupNotificationActivity f39935b;

                    {
                        this.f39935b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i122 = r2;
                        PopupNotificationActivity popupNotificationActivity = this.f39935b;
                        switch (i122) {
                            case 0:
                                int i13 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                return;
                            case 1:
                                int i14 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                return;
                            default:
                                int i15 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                return;
                        }
                    }
                });
                TextView textView3 = new TextView(this);
                textView3.setTextSize(1, 16.0f);
                textView3.setTag(301);
                int i13 = org.telegram.ui.ActionBar.f6.G6;
                textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
                textView3.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
                textView3.setGravity(17);
                linearLayout.addView(textView3, g7.e6.q(-1, -2, 17));
                frameLayout.setTag(1);
            }
            TextView textView4 = (TextView) frameLayout.findViewWithTag(301);
            textView4.setTextSize(2, SharedConfig.fontSize);
            textView4.setText(messageObject.messageText);
        }
        if (frameLayout.getParent() == null) {
            this.f35833n.addView(frameLayout);
        }
        frameLayout.setVisibility(0);
        if (z10) {
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.gravity = 51;
            layoutParams.height = -1;
            layoutParams.width = dp;
            int i14 = this.O;
            if (i10 == i14) {
                frameLayout.setTranslationX(0.0f);
            } else if (i10 == i14 - 1) {
                frameLayout.setTranslationX(-dp);
            } else if (i10 == i14 + 1) {
                frameLayout.setTranslationX(dp);
            }
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.invalidate();
        }
        return frameLayout;
    }

    public final void h(Intent intent) {
        boolean z10;
        int i9;
        if (intent != null && intent.getBooleanExtra("force", false)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.V = z10;
        this.W.clear();
        if (this.V) {
            if (intent != null) {
                i9 = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
            } else {
                i9 = UserConfig.selectedAccount;
            }
            if (!UserConfig.isValidAccount(i9)) {
                return;
            }
            this.W.addAll(NotificationsController.getInstance(i9).popupReplyMessages);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                if (UserConfig.getInstance(i10).isClientActivated()) {
                    this.W.addAll(NotificationsController.getInstance(i10).popupMessages);
                }
            }
        }
        if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode() && ApplicationLoader.isScreenOn) {
            getWindow().addFlags(2623488);
            getWindow().clearFlags(2);
        } else {
            getWindow().addFlags(2623490);
        }
        if (this.M == null) {
            this.O = 0;
        }
        f();
    }

    public final void i() {
        if (!this.K) {
            this.K = true;
            if (this.V) {
                this.W.clear();
            }
            for (int i9 = 0; i9 < 4; i9++) {
                NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.appDidLogout);
                NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.updateInterfaces);
                NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
                NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingDidReset);
                NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.contactsDidLoad);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.pushMessagesUpdated);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            ChatActivityEnterView chatActivityEnterView = this.f35829b;
            if (chatActivityEnterView != null) {
                chatActivityEnterView.A0();
            }
            if (this.P.isHeld()) {
                this.P.release();
            }
        }
    }

    public final boolean j(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PopupNotificationActivity.j(android.view.MotionEvent):boolean");
    }

    public final void k() {
        if (this.M == null) {
            return;
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, LaunchActivity.class);
        long dialogId = this.M.getDialogId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            intent.putExtra("encId", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            intent.putExtra("userId", dialogId);
        } else if (DialogObject.isChatDialog(dialogId)) {
            intent.putExtra("chatId", -dialogId);
        }
        intent.putExtra("currentAccount", this.M.currentAccount);
        intent.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
        intent.setFlags(32768);
        startActivity(intent);
        i();
        finish();
    }

    public final void l(int i9) {
        MessageObject messageObject;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
        if (i9 == 0) {
            n(this.f35834r);
            n(this.f35835s);
            n(this.v);
            m(this.f35836w);
            m(this.f35837x);
            m(this.f35838y);
            int i10 = this.O - 1;
            while (true) {
                int i11 = this.O;
                if (i10 >= i11 + 2) {
                    break;
                }
                if (i10 == i11 - 1) {
                    this.f35835s = g(i10, true);
                    this.f35837x = e(i10, true);
                } else if (i10 == i11) {
                    this.f35834r = g(i10, true);
                    this.f35836w = e(i10, true);
                } else if (i10 == i11 + 1) {
                    this.v = g(i10, true);
                    this.f35838y = e(i10, true);
                }
                i10++;
            }
        } else if (i9 == 1) {
            n(this.v);
            m(this.f35838y);
            this.v = this.f35834r;
            this.f35834r = this.f35835s;
            this.f35835s = g(this.O - 1, true);
            this.f35838y = this.f35836w;
            this.f35836w = this.f35837x;
            this.f35837x = e(this.O - 1, true);
        } else if (i9 == 2) {
            n(this.f35835s);
            m(this.f35837x);
            this.f35835s = this.f35834r;
            this.f35834r = this.v;
            this.v = g(this.O + 1, true);
            this.f35837x = this.f35836w;
            this.f35836w = this.f35838y;
            this.f35838y = e(this.O + 1, true);
        } else if (i9 == 3) {
            ViewGroup viewGroup = this.v;
            if (viewGroup != null) {
                float translationX = viewGroup.getTranslationX();
                n(this.v);
                ViewGroup g10 = g(this.O + 1, false);
                this.v = g10;
                if (g10 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g10.getLayoutParams();
                    layoutParams.width = dp;
                    this.v.setLayoutParams(layoutParams);
                    this.v.setTranslationX(translationX);
                    this.v.invalidate();
                }
            }
            LinearLayout linearLayout = this.f35838y;
            if (linearLayout != null) {
                float translationX2 = linearLayout.getTranslationX();
                m(this.f35838y);
                LinearLayout e10 = e(this.O + 1, false);
                this.f35838y = e10;
                if (e10 != null) {
                    e10.setTranslationX(translationX2);
                }
            }
        } else if (i9 == 4) {
            ViewGroup viewGroup2 = this.f35835s;
            if (viewGroup2 != null) {
                float translationX3 = viewGroup2.getTranslationX();
                n(this.f35835s);
                ViewGroup g11 = g(0, false);
                this.f35835s = g11;
                if (g11 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g11.getLayoutParams();
                    layoutParams2.width = dp;
                    this.f35835s.setLayoutParams(layoutParams2);
                    this.f35835s.setTranslationX(translationX3);
                    this.f35835s.invalidate();
                }
            }
            LinearLayout linearLayout2 = this.f35837x;
            if (linearLayout2 != null) {
                float translationX4 = linearLayout2.getTranslationX();
                m(this.f35837x);
                LinearLayout e11 = e(0, false);
                this.f35837x = e11;
                if (e11 != null) {
                    e11.setTranslationX(translationX4);
                }
            }
        }
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = (this.O - 1) + i12;
            ArrayList arrayList = this.W;
            if (arrayList.size() == 1 && (i13 < 0 || i13 >= arrayList.size())) {
                messageObject = null;
            } else {
                if (i13 == -1) {
                    i13 = arrayList.size() - 1;
                } else if (i13 == arrayList.size()) {
                    i13 = 0;
                }
                messageObject = (MessageObject) arrayList.get(i13);
            }
            this.N[i12] = messageObject;
        }
    }

    public final void m(LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        this.A.removeView(linearLayout);
    }

    public final void n(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int intValue = ((Integer) viewGroup.getTag()).intValue();
            viewGroup.setVisibility(8);
            if (intValue == 1) {
                this.B.add(viewGroup);
            } else if (intValue == 2) {
                this.C.add(viewGroup);
            } else if (intValue == 3) {
                this.D.add(viewGroup);
            }
        }
    }

    public final void o(boolean z10) {
        if (this.f35828a != null) {
            int i9 = 0;
            org.telegram.ui.Components.tv0[] tv0VarArr = this.F;
            if (z10) {
                try {
                    Integer printingStringType = MessagesController.getInstance(this.M.currentAccount).getPrintingStringType(this.M.getDialogId(), 0L);
                    this.f35831e.setCompoundDrawablesWithIntrinsicBounds(tv0VarArr[printingStringType.intValue()], (Drawable) null, (Drawable) null, (Drawable) null);
                    this.f35831e.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                    while (i9 < tv0VarArr.length) {
                        if (i9 == printingStringType.intValue()) {
                            tv0VarArr[i9].d();
                        } else {
                            tv0VarArr[i9].e();
                        }
                        i9++;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            }
            this.f35831e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f35831e.setCompoundDrawablePadding(0);
            while (i9 < tv0VarArr.length) {
                tv0VarArr[i9].e();
                i9++;
            }
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f35829b.s0()) {
            this.f35829b.l0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        d();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.f6.R(this);
        org.telegram.ui.ActionBar.f6.J(this, false);
        AndroidUtilities.fillStatusBarHeight(this, false);
        for (int i9 = 0; i9 < 4; i9++) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.appDidLogout);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.updateInterfaces);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.messagePlayingDidReset);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.contactsDidLoad);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.G = ConnectionsManager.generateClassGuid();
        this.F[0] = new org.telegram.ui.Components.j41(false);
        this.F[1] = new org.telegram.ui.Components.hp(false);
        this.F[2] = new org.telegram.ui.Components.go0(false);
        this.F[3] = new org.telegram.ui.Components.rf0(null, false);
        this.F[4] = new org.telegram.ui.Components.gl0(false);
        fh.x4 x4Var = new fh.x4(this, this, 7);
        setContentView(x4Var);
        x4Var.setBackgroundColor(-1728053248);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        x4Var.addView(relativeLayout, g7.e6.c(-1.0f, -1));
        lv0 lv0Var = new lv0(this, this);
        this.A = lv0Var;
        lv0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        float f10 = -1;
        relativeLayout.addView(this.A, g7.e6.v(12, f10, 12, 240, 13));
        ChatActivityEnterView chatActivityEnterView = this.f35829b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.A0();
        }
        ChatActivityEnterView chatActivityEnterView2 = new ChatActivityEnterView(this, x4Var, null, false, null);
        this.f35829b = chatActivityEnterView2;
        chatActivityEnterView2.setId(1000);
        this.A.addView(this.f35829b, g7.e6.v(0, f10, 0, -2, 12));
        this.f35829b.setDelegate(new mv0(this));
        m0 m0Var = new m0(this, this, 19);
        this.f35833n = m0Var;
        this.A.addView(m0Var, 0);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(this, null);
        this.f35828a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f35828a.setBackButtonImage(R.drawable.ic_close_white);
        this.f35828a.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23269s8, false));
        this.f35828a.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23287t8, false), false);
        this.A.addView(this.f35828a);
        ViewGroup.LayoutParams layoutParams = this.f35828a.getLayoutParams();
        layoutParams.width = -1;
        this.f35828a.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.w0 g10 = this.f35828a.n().g(2, 0, AndroidUtilities.dp(56.0f));
        TextView textView = new TextView(this);
        this.h = textView;
        int i10 = org.telegram.ui.ActionBar.f6.B8;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(17);
        g10.addView(this.h, g7.e6.c(-1.0f, 56));
        FrameLayout frameLayout = new FrameLayout(this);
        this.f35832f = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        this.f35828a.addView(this.f35832f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f35832f.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -2;
        layoutParams2.rightMargin = AndroidUtilities.dp(48.0f);
        layoutParams2.leftMargin = AndroidUtilities.dp(60.0f);
        layoutParams2.gravity = 51;
        this.f35832f.setLayoutParams(layoutParams2);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(this);
        this.f35830c = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f35832f.addView(this.f35830c);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f35830c.getLayoutParams();
        layoutParams3.width = AndroidUtilities.dp(42.0f);
        layoutParams3.height = AndroidUtilities.dp(42.0f);
        layoutParams3.topMargin = AndroidUtilities.dp(3.0f);
        this.f35830c.setLayoutParams(layoutParams3);
        TextView textView2 = new TextView(this);
        this.d = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A8, false));
        this.d.setTextSize(1, 18.0f);
        this.d.setLines(1);
        this.d.setMaxLines(1);
        this.d.setSingleLine(true);
        TextView textView3 = this.d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        this.d.setGravity(3);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f35832f.addView(this.d);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.leftMargin = AndroidUtilities.dp(54.0f);
        layoutParams4.bottomMargin = AndroidUtilities.dp(22.0f);
        layoutParams4.gravity = 80;
        this.d.setLayoutParams(layoutParams4);
        TextView textView4 = new TextView(this);
        this.f35831e = textView4;
        textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.f35831e.setTextSize(1, 14.0f);
        this.f35831e.setLines(1);
        this.f35831e.setMaxLines(1);
        this.f35831e.setSingleLine(true);
        this.f35831e.setEllipsize(truncateAt);
        this.f35831e.setGravity(3);
        this.f35832f.addView(this.f35831e);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f35831e.getLayoutParams();
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        layoutParams5.leftMargin = AndroidUtilities.dp(54.0f);
        layoutParams5.bottomMargin = AndroidUtilities.dp(4.0f);
        layoutParams5.gravity = 80;
        this.f35831e.setLayoutParams(layoutParams5);
        this.f35828a.setActionBarMenuOnItemClick(new cd0(this, 12));
        PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(268435462, "screen");
        this.P = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        h(getIntent());
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        i();
        MediaController.getInstance().setFeedbackView(this.f35829b, false);
        if (this.P.isHeld()) {
            this.P.release();
        }
        org.telegram.ui.Components.o9 o9Var = this.f35830c;
        if (o9Var != null) {
            o9Var.setImageDrawable(null);
        }
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        h(intent);
    }

    @Override
    public final void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
        ChatActivityEnterView chatActivityEnterView = this.f35829b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.l0(false);
            this.f35829b.setFieldFocused(false);
        }
        int i9 = this.H;
        if (i9 >= 0) {
            ConnectionsManager.getInstance(i9).setAppPaused(true, false);
        }
    }

    @Override
    public final void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i9, strArr, iArr);
        if (i9 == 3 && iArr[0] != 0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PermissionNoAudioWithHint);
            alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new dl0(this, 7));
            org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        MediaController.getInstance().setFeedbackView(this.f35829b, true);
        ChatActivityEnterView chatActivityEnterView = this.f35829b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setFieldFocused(true);
        }
        d();
        b();
        this.P.acquire(7000L);
    }

    public final void p() {
        ArrayList arrayList = this.W;
        if (arrayList.size() > 1) {
            if (this.O < arrayList.size() - 1) {
                this.O++;
            } else {
                this.O = 0;
            }
            this.M = (MessageObject) arrayList.get(this.O);
            q(2);
            this.h.setText(String.format("%d/%d", Integer.valueOf(this.O + 1), Integer.valueOf(arrayList.size())));
        }
    }

    public final void q(int i9) {
        if (this.f35828a == null) {
            return;
        }
        int i10 = this.H;
        if (i10 != this.M.currentAccount) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(i10).setAppPaused(true, false);
            }
            int i11 = this.M.currentAccount;
            this.H = i11;
            ConnectionsManager.getInstance(i11).setAppPaused(false, false);
        }
        this.J = null;
        this.I = null;
        long dialogId = this.M.getDialogId();
        this.f35829b.b1(this.M.currentAccount, dialogId);
        if (DialogObject.isEncryptedDialog(dialogId)) {
            this.I = MessagesController.getInstance(this.M.currentAccount).getUser(Long.valueOf(org.telegram.messenger.l0.l(MessagesController.getInstance(this.M.currentAccount), dialogId).user_id));
        } else if (DialogObject.isUserDialog(dialogId)) {
            this.I = MessagesController.getInstance(this.M.currentAccount).getUser(Long.valueOf(dialogId));
        } else if (DialogObject.isChatDialog(dialogId)) {
            this.J = MessagesController.getInstance(this.M.currentAccount).getChat(Long.valueOf(-dialogId));
            if (this.M.isFromUser()) {
                this.I = MessagesController.getInstance(this.M.currentAccount).getUser(Long.valueOf(this.M.messageOwner.from_id.user_id));
            }
        }
        TLRPC.Chat chat = this.J;
        if (chat != null) {
            this.d.setText(chat.title);
            TLRPC.User user = this.I;
            if (user != null) {
                this.f35831e.setText(UserObject.getUserName(user));
            } else {
                this.f35831e.setText((CharSequence) null);
            }
            this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.d.setCompoundDrawablePadding(0);
        } else {
            TLRPC.User user2 = this.I;
            if (user2 != null) {
                this.d.setText(UserObject.getUserName(user2));
                if (DialogObject.isEncryptedDialog(dialogId)) {
                    this.d.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_lock_white, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                } else {
                    this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(0);
                }
            }
        }
        l(i9);
        r();
        b();
        a(0);
    }

    public final void r() {
        MessageObject messageObject;
        TLRPC.User user;
        if (this.f35828a != null && (messageObject = this.M) != null && this.J == null && (user = this.I) != null) {
            long j10 = user.f22527id;
            if (j10 / 1000 != 777 && j10 / 1000 != 333 && ContactsController.getInstance(messageObject.currentAccount).contactsDict.get(Long.valueOf(this.I.f22527id)) == null && (ContactsController.getInstance(this.M.currentAccount).contactsDict.size() != 0 || !ContactsController.getInstance(this.M.currentAccount).isLoadingContacts())) {
                String str = this.I.phone;
                if (str != null && str.length() != 0) {
                    TextView textView = this.d;
                    ne.b c10 = ne.b.c();
                    textView.setText(c10.b("+" + this.I.phone));
                } else {
                    this.d.setText(UserObject.getUserName(this.I));
                }
            } else {
                this.d.setText(UserObject.getUserName(this.I));
            }
            TLRPC.User user2 = this.I;
            if (user2 != null && user2.f22527id == 489000) {
                this.f35831e.setText(LocaleController.getString(R.string.VerifyCodesNotifications));
            } else if (user2 != null && user2.f22527id == 777000) {
                this.f35831e.setText(LocaleController.getString(R.string.ServiceNotifications));
            } else {
                CharSequence printingString = MessagesController.getInstance(this.M.currentAccount).getPrintingString(this.M.getDialogId(), 0L, false);
                if (printingString != null && printingString.length() != 0) {
                    this.L = printingString;
                    this.f35831e.setText(printingString);
                    o(true);
                    return;
                }
                this.L = null;
                o(false);
                TLRPC.User user3 = MessagesController.getInstance(this.M.currentAccount).getUser(Long.valueOf(this.I.f22527id));
                if (user3 != null) {
                    this.I = user3;
                }
                this.f35831e.setText(LocaleController.formatUserStatus(this.M.currentAccount, this.I));
            }
        }
    }
}
