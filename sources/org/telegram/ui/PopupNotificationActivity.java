package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import android.view.MotionEvent;
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
    public mv0 A;
    public int G;
    public TLRPC.User I;
    public TLRPC.Chat J;
    public CharSequence L;
    public boolean V;

    public org.telegram.ui.ActionBar.k f35831a;

    public ChatActivityEnterView f35832b;

    public org.telegram.ui.Components.n9 f35833c;
    public TextView d;

    public TextView f35834e;

    public FrameLayout f35835f;
    public TextView h;

    public n0 f35836n;

    public ViewGroup f35837r;

    public ViewGroup f35838s;
    public ViewGroup v;

    public LinearLayout f35839w;

    public LinearLayout f35840x;

    public LinearLayout f35841y;
    public final ArrayList B = new ArrayList();
    public final ArrayList C = new ArrayList();
    public final ArrayList D = new ArrayList();
    public VelocityTracker E = null;
    public final org.telegram.ui.Components.vv0[] F = new org.telegram.ui.Components.vv0[5];
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

    public final void a(int i10) {
        int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
        ViewGroup viewGroup = this.f35838s;
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams.width != iDp) {
                layoutParams.width = iDp;
                this.f35838s.setLayoutParams(layoutParams);
            }
            this.f35838s.setTranslationX((-iDp) + i10);
        }
        LinearLayout linearLayout = this.f35840x;
        if (linearLayout != null) {
            linearLayout.setTranslationX((-iDp) + i10);
        }
        ViewGroup viewGroup2 = this.f35837r;
        if (viewGroup2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            if (layoutParams2.width != iDp) {
                layoutParams2.width = iDp;
                this.f35837r.setLayoutParams(layoutParams2);
            }
            this.f35837r.setTranslationX(i10);
        }
        LinearLayout linearLayout2 = this.f35839w;
        if (linearLayout2 != null) {
            linearLayout2.setTranslationX(i10);
        }
        ViewGroup viewGroup3 = this.v;
        if (viewGroup3 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup3.getLayoutParams();
            if (layoutParams3.width != iDp) {
                layoutParams3.width = iDp;
                this.v.setLayoutParams(layoutParams3);
            }
            this.v.setTranslationX(iDp + i10);
        }
        LinearLayout linearLayout3 = this.f35841y;
        if (linearLayout3 != null) {
            linearLayout3.setTranslationX(iDp + i10);
        }
        this.f35836n.invalidate();
    }

    public final void b() {
        TLRPC.User user;
        MessageObject messageObject = this.M;
        if (messageObject == null) {
            return;
        }
        if (this.J != null) {
            TLRPC.Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(this.J.f22380id));
            if (chat == null) {
                return;
            }
            this.J = chat;
            if (this.f35833c != null) {
                this.f35833c.e(chat, new org.telegram.ui.Components.y8(this.J));
                return;
            }
            return;
        }
        if (this.I == null || (user = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(this.I.f22527id))) == null) {
            return;
        }
        this.I = user;
        if (this.f35833c != null) {
            this.f35833c.e(user, new org.telegram.ui.Components.y8(0, this.I));
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
        FrameLayout frameLayout = this.f35835f;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new ov0(this, 0));
        }
        n0 n0Var = this.f35836n;
        if (n0Var != null) {
            n0Var.getViewTreeObserver().addOnPreDrawListener(new ov0(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        org.telegram.ui.Components.dg0 dg0Var;
        MessageObject messageObject;
        org.telegram.ui.Components.dg0 dg0Var2;
        MessageObject messageObject2;
        MessageObject messageObject3;
        if (i10 == NotificationCenter.appDidLogout) {
            if (i11 == this.H) {
                i();
                finish();
                return;
            }
            return;
        }
        int i12 = 0;
        if (i10 == NotificationCenter.pushMessagesUpdated) {
            if (this.V) {
                return;
            }
            ArrayList arrayList = this.W;
            arrayList.clear();
            for (int i13 = 0; i13 < 4; i13++) {
                if (UserConfig.getInstance(i13).isClientActivated()) {
                    arrayList.addAll(NotificationsController.getInstance(i13).popupMessages);
                }
            }
            f();
            if (arrayList.isEmpty()) {
                return;
            }
            for (int i14 = 0; i14 < 3; i14++) {
                int size = (this.O - 1) + i14;
                if (arrayList.size() != 1 || (size >= 0 && size < arrayList.size())) {
                    if (size == -1) {
                        size = arrayList.size() - 1;
                    } else if (size == arrayList.size()) {
                        size = 0;
                    }
                    messageObject3 = (MessageObject) arrayList.get(size);
                } else {
                    messageObject3 = null;
                }
                if (this.N[i14] != messageObject3) {
                    q(0);
                }
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            if (this.M == null || i11 != this.H) {
                return;
            }
            int iIntValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_NAME & iIntValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & iIntValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & iIntValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & iIntValue) != 0) {
                r();
            }
            if ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & iIntValue) != 0) {
                b();
            }
            if ((iIntValue & MessagesController.UPDATE_MASK_USER_PRINT) != 0) {
                CharSequence printingString = MessagesController.getInstance(this.M.currentAccount).getPrintingString(this.M.getDialogId(), 0L, false);
                CharSequence charSequence = this.L;
                if ((charSequence == null || printingString != null) && ((charSequence != null || printingString == null) && (charSequence == null || charSequence.equals(printingString)))) {
                    return;
                }
                r();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidReset) {
            Integer num = (Integer) objArr[0];
            n0 n0Var = this.f35836n;
            if (n0Var != null) {
                int childCount = n0Var.getChildCount();
                while (i12 < childCount) {
                    View childAt = this.f35836n.getChildAt(i12);
                    if (((Integer) childAt.getTag()).intValue() == 3 && (messageObject2 = (dg0Var2 = (org.telegram.ui.Components.dg0) childAt.findViewWithTag(300)).getMessageObject()) != null && messageObject2.currentAccount == i11 && messageObject2.getId() == num.intValue()) {
                        dg0Var2.s();
                        return;
                    }
                    i12++;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
            Integer num2 = (Integer) objArr[0];
            n0 n0Var2 = this.f35836n;
            if (n0Var2 != null) {
                int childCount2 = n0Var2.getChildCount();
                while (i12 < childCount2) {
                    View childAt2 = this.f35836n.getChildAt(i12);
                    if (((Integer) childAt2.getTag()).intValue() == 3 && (messageObject = (dg0Var = (org.telegram.ui.Components.dg0) childAt2.findViewWithTag(300)).getMessageObject()) != null && messageObject.currentAccount == i11 && messageObject.getId() == num2.intValue()) {
                        dg0Var.t();
                        return;
                    }
                    i12++;
                }
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.contactsDidLoad && i11 == this.H) {
                r();
                return;
            }
            return;
        }
        n0 n0Var3 = this.f35836n;
        if (n0Var3 != null) {
            int childCount3 = n0Var3.getChildCount();
            while (i12 < childCount3) {
                View childAt3 = this.f35836n.getChildAt(i12);
                if (((Integer) childAt3.getTag()).intValue() == 1 && (textView = (TextView) childAt3.findViewWithTag(301)) != null) {
                    textView.invalidate();
                }
                i12++;
            }
        }
    }

    public final LinearLayout e(int i10, boolean z10) {
        int i11;
        ?? r10;
        ?? r11;
        ?? r12;
        Object obj;
        int size = i10;
        ArrayList arrayList = this.W;
        Object obj2 = null;
        if (arrayList.size() == 1 && (size < 0 || size >= arrayList.size())) {
            return null;
        }
        boolean z11 = false;
        if (size == -1) {
            size = arrayList.size() - 1;
        } else if (size == arrayList.size()) {
            size = 0;
        }
        MessageObject messageObject = (MessageObject) arrayList.get(size);
        TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
        if (messageObject.getDialogId() == 777000 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList2 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size2 = arrayList2.size();
            i11 = 0;
            for (int i12 = 0; i12 < size2; i12++) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList2.get(i12);
                int size3 = keyboardInlineButtonRow.buttons.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    if (hf.c.c(keyboardInlineButtonRow.buttons.get(i13), TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        i11++;
                    }
                }
            }
        } else {
            i11 = 0;
        }
        int i14 = messageObject.currentAccount;
        if (i11 <= 0 || !(replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            r10 = 0;
        } else {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size4 = arrayList3.size();
            ?? r13 = 0;
            int i15 = 0;
            while (i15 < size4) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow2 = arrayList3.get(i15);
                int size5 = keyboardInlineButtonRow2.buttons.size();
                int i16 = 0;
                while (i16 < size5) {
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow2.buttons.get(i16);
                    if (hf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        if (r11 == 0) {
                            ?? linearLayout = new LinearLayout(this);
                            linearLayout.setOrientation(r12);
                            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, r12));
                            linearLayout.setWeightSum(100.0f);
                            linearLayout.setTag("b");
                            linearLayout.setOnTouchListener(new kh.e(29));
                            r11 = linearLayout;
                        } else {
                            r11 = r11;
                        }
                        TextView textView = new TextView(this);
                        textView.setTextSize(1, 16.0f);
                        obj = null;
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23234n6, false));
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setText(keyboardInlineButton.text.toUpperCase());
                        textView.setTag(keyboardInlineButton);
                        textView.setGravity(17);
                        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                        r11.addView(textView, h7.z5.l(100.0f / i11, -1, -1));
                        textView.setOnClickListener(new hh.z0(messageObject, i14));
                    } else {
                        r12 = z11;
                        r11 = r13;
                        arrayList3 = arrayList3;
                        obj = obj2;
                    }
                    i16++;
                    obj2 = obj;
                    size4 = size4;
                    arrayList3 = arrayList3;
                    r12 = 0;
                    r11 = r11;
                }
                r12 = z11;
                r11 = r13;
                i15++;
                size4 = size4;
                arrayList3 = arrayList3;
                z11 = false;
                r13 = r11;
            }
            r10 = r13;
        }
        if (r10 != 0) {
            int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            if (z10) {
                int i17 = this.O;
                if (size == i17) {
                    r10.setTranslationX(0.0f);
                } else if (size == i17 - 1) {
                    r10.setTranslationX(-iDp);
                } else if (size == i17 + 1) {
                    r10.setTranslationX(iDp);
                }
            }
            this.A.addView(r10, layoutParams);
        }
        return r10;
    }

    public final void f() {
        ArrayList arrayList = this.W;
        if (arrayList.isEmpty()) {
            i();
            finish();
            return;
        }
        if ((this.O != 0 || this.f35832b.k0() || this.T) && this.M != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                if (messageObject.currentAccount == this.M.currentAccount && messageObject.getDialogId() == this.M.getDialogId() && messageObject.getId() == this.M.getId()) {
                    this.O = i10;
                    if (this.T) {
                        if (i10 == arrayList.size() - 1) {
                            l(3);
                        } else if (this.O == 1) {
                            l(4);
                        }
                    }
                }
            }
            this.O = 0;
            this.M = (MessageObject) arrayList.get(0);
            q(0);
        } else {
            this.O = 0;
            this.M = (MessageObject) arrayList.get(0);
            q(0);
        }
        this.h.setText(String.format("%d/%d", Integer.valueOf(this.O + 1), Integer.valueOf(arrayList.size())));
    }

    public final ViewGroup g(int i10, boolean z10) {
        ?? r10;
        ?? r11;
        ?? r12;
        ?? r13;
        org.telegram.ui.Components.dg0 dg0Var;
        int size = i10;
        ArrayList arrayList = this.W;
        if (arrayList.size() == 1 && (size < 0 || size >= arrayList.size())) {
            return null;
        }
        if (size == -1) {
            size = arrayList.size() - 1;
        } else if (size == arrayList.size()) {
            size = 0;
        }
        MessageObject messageObject = (MessageObject) arrayList.get(size);
        int i11 = messageObject.type;
        if ((i11 == 1 || i11 == 4) && !messageObject.isSecretMedia()) {
            ArrayList arrayList2 = this.C;
            if (arrayList2.size() > 0) {
                ViewGroup viewGroup = (ViewGroup) arrayList2.get(0);
                arrayList2.remove(0);
                r10 = viewGroup;
            } else {
                ?? frameLayout = new FrameLayout(this);
                FrameLayout frameLayout2 = new FrameLayout(this);
                frameLayout2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                frameLayout2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                frameLayout.addView(frameLayout2, h7.z5.c(-1.0f, -1));
                org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(this);
                n9Var.setTag(311);
                frameLayout2.addView(n9Var, h7.z5.c(-1.0f, -1));
                TextView textView = new TextView(this);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                textView.setTextSize(1, 16.0f);
                textView.setGravity(17);
                textView.setTag(312);
                frameLayout2.addView(textView, h7.z5.e(-1, -2, 17));
                frameLayout.setTag(2);
                final int i12 = 0;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {

                    public final PopupNotificationActivity f40254b;

                    {
                        this.f40254b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i13 = i12;
                        PopupNotificationActivity popupNotificationActivity = this.f40254b;
                        switch (i13) {
                            case 0:
                                int i14 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                break;
                            case 1:
                                int i15 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                break;
                            default:
                                int i16 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                break;
                        }
                    }
                });
                r10 = frameLayout;
            }
            TextView textView2 = (TextView) r10.findViewWithTag(312);
            org.telegram.ui.Components.n9 n9Var2 = (org.telegram.ui.Components.n9) r10.findViewWithTag(311);
            n9Var2.setAspectFit(true);
            int i13 = messageObject.type;
            if (i13 == 1) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 100);
                if (closestPhotoSizeWithSize == null) {
                    n9Var2.setVisibility(8);
                    textView2.setVisibility(0);
                    textView2.setTextSize(2, SharedConfig.fontSize);
                    textView2.setText(messageObject.messageText);
                    r11 = r10;
                } else {
                    boolean z11 = messageObject.type != 1 || FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(messageObject.messageOwner).exists();
                    if (messageObject.needDrawBluredPreview()) {
                        n9Var2.setVisibility(8);
                        textView2.setVisibility(0);
                        textView2.setTextSize(2, SharedConfig.fontSize);
                        textView2.setText(messageObject.messageText);
                        r11 = r10;
                    } else {
                        if (z11 || DownloadController.getInstance(messageObject.currentAccount).canDownloadMedia(messageObject)) {
                            n9Var2.j(ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "100_100", ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), "100_100_b", closestPhotoSizeWithSize.size, messageObject);
                        } else if (closestPhotoSizeWithSize2 != null) {
                            n9Var2.i(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), "100_100_b", null, null, messageObject);
                        } else {
                            n9Var2.setVisibility(8);
                            textView2.setVisibility(0);
                            textView2.setTextSize(2, SharedConfig.fontSize);
                            textView2.setText(messageObject.messageText);
                            r11 = r10;
                        }
                        n9Var2.setVisibility(0);
                        textView2.setVisibility(8);
                        r11 = r10;
                    }
                }
            } else if (i13 == 4) {
                textView2.setVisibility(8);
                textView2.setText(messageObject.messageText);
                n9Var2.setVisibility(0);
                TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                if (MessagesController.getInstance(messageObject.currentAccount).mapProvider == 2) {
                    r11 = r10;
                    n9Var2.i(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, 100, 100, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), null, null, null, messageObject);
                    r11 = r10;
                } else {
                    r11 = r10;
                    n9Var2.f(AndroidUtilities.formapMapUrl(messageObject.currentAccount, d, d10, 100, 100, true, 15, -1), null, null);
                    r11 = r10;
                }
            }
        } else if (messageObject.type == 2) {
            ArrayList arrayList3 = this.D;
            if (arrayList3.size() > 0) {
                ViewGroup viewGroup2 = (ViewGroup) arrayList3.get(0);
                arrayList3.remove(0);
                dg0Var = (org.telegram.ui.Components.dg0) viewGroup2.findViewWithTag(300);
                r13 = viewGroup2;
            } else {
                ?? frameLayout3 = new FrameLayout(this);
                ?? frameLayout4 = new FrameLayout(this);
                frameLayout4.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                frameLayout4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                frameLayout3.addView(frameLayout4, h7.z5.c(-1.0f, -1));
                FrameLayout frameLayout5 = new FrameLayout(this);
                frameLayout4.addView(frameLayout5, h7.z5.d(-1, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
                org.telegram.ui.Components.dg0 dg0Var2 = new org.telegram.ui.Components.dg0(this);
                dg0Var2.f27749f = false;
                dg0Var2.f27755y = 0;
                dg0Var2.C = 0;
                dg0Var2.F = 0;
                TextPaint textPaint = new TextPaint(1);
                dg0Var2.f27751r = textPaint;
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                dg0Var2.G = DownloadController.getInstance(dg0Var2.f27750n).generateObserverTag();
                org.telegram.ui.Components.mn0 mn0Var = new org.telegram.ui.Components.mn0(dg0Var2);
                dg0Var2.f27752s = mn0Var;
                mn0Var.h = dg0Var2;
                org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0();
                mh0Var.f30688c = 0.0f;
                mh0Var.f30690f = AndroidUtilities.dp(2.0f);
                mh0Var.f30686a = new Paint();
                mh0Var.f30687b = new Paint();
                dg0Var2.v = mh0Var;
                dg0Var2.setTag(300);
                frameLayout5.addView(dg0Var2);
                frameLayout3.setTag(3);
                final int i14 = 1;
                frameLayout3.setOnClickListener(new View.OnClickListener(this) {

                    public final PopupNotificationActivity f40254b;

                    {
                        this.f40254b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i15 = i14;
                        PopupNotificationActivity popupNotificationActivity = this.f40254b;
                        switch (i15) {
                            case 0:
                                int i16 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                break;
                            case 1:
                                int i17 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                break;
                            default:
                                int i18 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                break;
                        }
                    }
                });
                r13 = frameLayout3;
                dg0Var = dg0Var2;
            }
            dg0Var.setMessageObject(messageObject);
            r11 = r13;
            if (DownloadController.getInstance(messageObject.currentAccount).canDownloadMedia(messageObject) && dg0Var.f27755y == 2) {
                r11 = r13;
                FileLoader.getInstance(dg0Var.f27750n).loadFile(dg0Var.h.getDocument(), dg0Var.h, 1, 0);
                dg0Var.f27755y = 3;
                dg0Var.invalidate();
                r11 = r13;
            }
        } else {
            ArrayList arrayList4 = this.B;
            if (arrayList4.size() > 0) {
                ViewGroup viewGroup3 = (ViewGroup) arrayList4.get(0);
                arrayList4.remove(0);
                r12 = viewGroup3;
            } else {
                ?? frameLayout6 = new FrameLayout(this);
                ?? scrollView = new ScrollView(this);
                scrollView.setFillViewport(true);
                frameLayout6.addView(scrollView, h7.z5.c(-1.0f, -1));
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(0);
                linearLayout.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                scrollView.addView(linearLayout, h7.z5.x(-1, -2, 1));
                linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                final int i15 = 2;
                linearLayout.setOnClickListener(new View.OnClickListener(this) {

                    public final PopupNotificationActivity f40254b;

                    {
                        this.f40254b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i16 = i15;
                        PopupNotificationActivity popupNotificationActivity = this.f40254b;
                        switch (i16) {
                            case 0:
                                int i17 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                break;
                            case 1:
                                int i18 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                break;
                            default:
                                int i19 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                break;
                        }
                    }
                });
                TextView textView3 = new TextView(this);
                textView3.setTextSize(1, 16.0f);
                textView3.setTag(301);
                int i16 = org.telegram.ui.ActionBar.g6.G6;
                textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                textView3.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                textView3.setGravity(17);
                linearLayout.addView(textView3, h7.z5.q(-1, -2, 17));
                frameLayout6.setTag(1);
                r12 = frameLayout6;
            }
            TextView textView4 = (TextView) r12.findViewWithTag(301);
            textView4.setTextSize(2, SharedConfig.fontSize);
            textView4.setText(messageObject.messageText);
            r11 = r12;
        }
        r11 = r10;
        r11 = r13;
        if (r11.getParent() == null) {
            this.f35836n.addView(r11);
        }
        r11.setVisibility(0);
        if (z10) {
            int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r11.getLayoutParams();
            layoutParams.gravity = 51;
            layoutParams.height = -1;
            layoutParams.width = iDp;
            int i17 = this.O;
            if (size == i17) {
                r11.setTranslationX(0.0f);
            } else if (size == i17 - 1) {
                r11.setTranslationX(-iDp);
            } else if (size == i17 + 1) {
                r11.setTranslationX(iDp);
            }
            r11.setLayoutParams(layoutParams);
            r11.invalidate();
        }
        return r11;
    }

    public final void h(Intent intent) {
        this.V = intent != null && intent.getBooleanExtra("force", false);
        this.W.clear();
        if (this.V) {
            int intExtra = intent != null ? intent.getIntExtra("currentAccount", UserConfig.selectedAccount) : UserConfig.selectedAccount;
            if (!UserConfig.isValidAccount(intExtra)) {
                return;
            } else {
                this.W.addAll(NotificationsController.getInstance(intExtra).popupReplyMessages);
            }
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                if (UserConfig.getInstance(i10).isClientActivated()) {
                    this.W.addAll(NotificationsController.getInstance(i10).popupMessages);
                }
            }
        }
        if (((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode() || !ApplicationLoader.isScreenOn) {
            getWindow().addFlags(2623490);
        } else {
            getWindow().addFlags(2623488);
            getWindow().clearFlags(2);
        }
        if (this.M == null) {
            this.O = 0;
        }
        f();
    }

    public final void i() {
        if (this.K) {
            return;
        }
        this.K = true;
        if (this.V) {
            this.W.clear();
        }
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.appDidLogout);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.contactsDidLoad);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        ChatActivityEnterView chatActivityEnterView = this.f35832b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.B0();
        }
        if (this.P.isHeld()) {
            this.P.release();
        }
    }

    public final boolean j(MotionEvent motionEvent) {
        char c10;
        float translationX;
        ViewGroup viewGroup;
        LinearLayout linearLayout;
        final int i10 = 0;
        if (c()) {
            return false;
        }
        if (motionEvent == null || motionEvent.getAction() != 0) {
            final int i11 = 2;
            final int i12 = 1;
            if (motionEvent != null && motionEvent.getAction() == 2) {
                float x8 = motionEvent.getX();
                float f10 = this.S;
                int i13 = (int) (x8 - f10);
                if (f10 != -1.0f && !this.T && Math.abs(i13) > AndroidUtilities.dp(10.0f)) {
                    this.T = true;
                    this.S = x8;
                    AndroidUtilities.lockOrientation(this);
                    VelocityTracker velocityTracker = this.E;
                    if (velocityTracker == null) {
                        this.E = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    i13 = 0;
                }
                if (this.T) {
                    if (this.f35838s == null && i13 > 0) {
                        i13 = 0;
                    }
                    i10 = (this.v != null || i13 >= 0) ? i13 : 0;
                    VelocityTracker velocityTracker2 = this.E;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    a(i10);
                }
            } else if (motionEvent == null || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent == null || !this.T) {
                    a(0);
                } else {
                    int x10 = (int) (motionEvent.getX() - this.S);
                    int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
                    VelocityTracker velocityTracker3 = this.E;
                    if (velocityTracker3 != null) {
                        velocityTracker3.computeCurrentVelocity(1000);
                        if (this.E.getXVelocity() >= 3500.0f) {
                            c10 = 1;
                        } else if (this.E.getXVelocity() <= -3500.0f) {
                            c10 = 2;
                        } else {
                            c10 = 0;
                        }
                    } else {
                        c10 = 0;
                    }
                    if ((c10 == 1 || x10 > iDp / 3) && this.f35838s != null) {
                        translationX = iDp - this.f35837r.getTranslationX();
                        viewGroup = this.f35838s;
                        linearLayout = this.f35840x;
                        this.U = new Runnable(this) {

                            public final PopupNotificationActivity f39890b;

                            {
                                this.f39890b = this;
                            }

                            @Override
                            public final void run() {
                                int i14 = i10;
                                PopupNotificationActivity popupNotificationActivity = this.f39890b;
                                switch (i14) {
                                    case 0:
                                        popupNotificationActivity.Q = false;
                                        ArrayList arrayList = popupNotificationActivity.W;
                                        if (arrayList.size() > 1) {
                                            int i15 = popupNotificationActivity.O;
                                            if (i15 > 0) {
                                                popupNotificationActivity.O = i15 - 1;
                                            } else {
                                                popupNotificationActivity.O = arrayList.size() - 1;
                                            }
                                            popupNotificationActivity.M = (MessageObject) arrayList.get(popupNotificationActivity.O);
                                            popupNotificationActivity.q(1);
                                            popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.O + 1), Integer.valueOf(arrayList.size())));
                                        }
                                        AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                        break;
                                    case 1:
                                        popupNotificationActivity.Q = false;
                                        popupNotificationActivity.p();
                                        AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                        break;
                                    default:
                                        popupNotificationActivity.Q = false;
                                        popupNotificationActivity.a(0);
                                        AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                        break;
                                }
                            }
                        };
                    } else if ((c10 == 2 || x10 < (-iDp) / 3) && this.v != null) {
                        translationX = (-iDp) - this.f35837r.getTranslationX();
                        viewGroup = this.v;
                        linearLayout = this.f35841y;
                        this.U = new Runnable(this) {

                            public final PopupNotificationActivity f39890b;

                            {
                                this.f39890b = this;
                            }

                            @Override
                            public final void run() {
                                int i14 = i12;
                                PopupNotificationActivity popupNotificationActivity = this.f39890b;
                                switch (i14) {
                                    case 0:
                                        popupNotificationActivity.Q = false;
                                        ArrayList arrayList = popupNotificationActivity.W;
                                        if (arrayList.size() > 1) {
                                            int i15 = popupNotificationActivity.O;
                                            if (i15 > 0) {
                                                popupNotificationActivity.O = i15 - 1;
                                            } else {
                                                popupNotificationActivity.O = arrayList.size() - 1;
                                            }
                                            popupNotificationActivity.M = (MessageObject) arrayList.get(popupNotificationActivity.O);
                                            popupNotificationActivity.q(1);
                                            popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.O + 1), Integer.valueOf(arrayList.size())));
                                        }
                                        AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                        break;
                                    case 1:
                                        popupNotificationActivity.Q = false;
                                        popupNotificationActivity.p();
                                        AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                        break;
                                    default:
                                        popupNotificationActivity.Q = false;
                                        popupNotificationActivity.a(0);
                                        AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                        break;
                                }
                            }
                        };
                    } else if (this.f35837r.getTranslationX() != 0.0f) {
                        float f11 = -this.f35837r.getTranslationX();
                        ViewGroup viewGroup2 = x10 > 0 ? this.f35838s : this.v;
                        LinearLayout linearLayout2 = x10 > 0 ? this.f35840x : this.f35841y;
                        this.U = new Runnable(this) {

                            public final PopupNotificationActivity f39890b;

                            {
                                this.f39890b = this;
                            }

                            @Override
                            public final void run() {
                                int i14 = i11;
                                PopupNotificationActivity popupNotificationActivity = this.f39890b;
                                switch (i14) {
                                    case 0:
                                        popupNotificationActivity.Q = false;
                                        ArrayList arrayList = popupNotificationActivity.W;
                                        if (arrayList.size() > 1) {
                                            int i15 = popupNotificationActivity.O;
                                            if (i15 > 0) {
                                                popupNotificationActivity.O = i15 - 1;
                                            } else {
                                                popupNotificationActivity.O = arrayList.size() - 1;
                                            }
                                            popupNotificationActivity.M = (MessageObject) arrayList.get(popupNotificationActivity.O);
                                            popupNotificationActivity.q(1);
                                            popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.O + 1), Integer.valueOf(arrayList.size())));
                                        }
                                        AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                        break;
                                    case 1:
                                        popupNotificationActivity.Q = false;
                                        popupNotificationActivity.p();
                                        AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                        break;
                                    default:
                                        popupNotificationActivity.Q = false;
                                        popupNotificationActivity.a(0);
                                        AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                        break;
                                }
                            }
                        };
                        linearLayout = linearLayout2;
                        translationX = f11;
                        viewGroup = viewGroup2;
                    } else {
                        viewGroup = null;
                        linearLayout = null;
                        translationX = 0.0f;
                    }
                    if (translationX != 0.0f) {
                        int iAbs = (int) (Math.abs(translationX / iDp) * 200.0f);
                        ArrayList arrayList = new ArrayList();
                        ViewGroup viewGroup3 = this.f35837r;
                        arrayList.add(ObjectAnimator.ofFloat(viewGroup3, "translationX", viewGroup3.getTranslationX() + translationX));
                        LinearLayout linearLayout3 = this.f35839w;
                        if (linearLayout3 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(linearLayout3, "translationX", linearLayout3.getTranslationX() + translationX));
                        }
                        if (viewGroup != null) {
                            arrayList.add(ObjectAnimator.ofFloat(viewGroup, "translationX", viewGroup.getTranslationX() + translationX));
                        }
                        if (linearLayout != null) {
                            arrayList.add(ObjectAnimator.ofFloat(linearLayout, "translationX", linearLayout.getTranslationX() + translationX));
                        }
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(arrayList);
                        animatorSet.setDuration(iAbs);
                        animatorSet.addListener(new f50(this, 19));
                        animatorSet.start();
                        this.Q = true;
                        this.R = System.currentTimeMillis();
                    }
                }
                VelocityTracker velocityTracker4 = this.E;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.E = null;
                }
                this.T = false;
                this.S = -1.0f;
            }
        } else {
            this.S = motionEvent.getX();
        }
        return this.T;
    }

    public final void k() {
        if (this.M == null) {
            return;
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
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

    public final void l(int i10) {
        MessageObject messageObject;
        int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
        if (i10 == 0) {
            n(this.f35837r);
            n(this.f35838s);
            n(this.v);
            m(this.f35839w);
            m(this.f35840x);
            m(this.f35841y);
            int i11 = this.O - 1;
            while (true) {
                int i12 = this.O;
                if (i11 >= i12 + 2) {
                    break;
                }
                if (i11 == i12 - 1) {
                    this.f35838s = g(i11, true);
                    this.f35840x = e(i11, true);
                } else if (i11 == i12) {
                    this.f35837r = g(i11, true);
                    this.f35839w = e(i11, true);
                } else if (i11 == i12 + 1) {
                    this.v = g(i11, true);
                    this.f35841y = e(i11, true);
                }
                i11++;
            }
        } else if (i10 == 1) {
            n(this.v);
            m(this.f35841y);
            this.v = this.f35837r;
            this.f35837r = this.f35838s;
            this.f35838s = g(this.O - 1, true);
            this.f35841y = this.f35839w;
            this.f35839w = this.f35840x;
            this.f35840x = e(this.O - 1, true);
        } else if (i10 == 2) {
            n(this.f35838s);
            m(this.f35840x);
            this.f35838s = this.f35837r;
            this.f35837r = this.v;
            this.v = g(this.O + 1, true);
            this.f35840x = this.f35839w;
            this.f35839w = this.f35841y;
            this.f35841y = e(this.O + 1, true);
        } else if (i10 == 3) {
            ViewGroup viewGroup = this.v;
            if (viewGroup != null) {
                float translationX = viewGroup.getTranslationX();
                n(this.v);
                ViewGroup viewGroupG = g(this.O + 1, false);
                this.v = viewGroupG;
                if (viewGroupG != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroupG.getLayoutParams();
                    layoutParams.width = iDp;
                    this.v.setLayoutParams(layoutParams);
                    this.v.setTranslationX(translationX);
                    this.v.invalidate();
                }
            }
            LinearLayout linearLayout = this.f35841y;
            if (linearLayout != null) {
                float translationX2 = linearLayout.getTranslationX();
                m(this.f35841y);
                LinearLayout linearLayoutE = e(this.O + 1, false);
                this.f35841y = linearLayoutE;
                if (linearLayoutE != null) {
                    linearLayoutE.setTranslationX(translationX2);
                }
            }
        } else if (i10 == 4) {
            ViewGroup viewGroup2 = this.f35838s;
            if (viewGroup2 != null) {
                float translationX3 = viewGroup2.getTranslationX();
                n(this.f35838s);
                ViewGroup viewGroupG2 = g(0, false);
                this.f35838s = viewGroupG2;
                if (viewGroupG2 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroupG2.getLayoutParams();
                    layoutParams2.width = iDp;
                    this.f35838s.setLayoutParams(layoutParams2);
                    this.f35838s.setTranslationX(translationX3);
                    this.f35838s.invalidate();
                }
            }
            LinearLayout linearLayout2 = this.f35840x;
            if (linearLayout2 != null) {
                float translationX4 = linearLayout2.getTranslationX();
                m(this.f35840x);
                LinearLayout linearLayoutE2 = e(0, false);
                this.f35840x = linearLayoutE2;
                if (linearLayoutE2 != null) {
                    linearLayoutE2.setTranslationX(translationX4);
                }
            }
        }
        for (int i13 = 0; i13 < 3; i13++) {
            int size = (this.O - 1) + i13;
            ArrayList arrayList = this.W;
            if (arrayList.size() != 1 || (size >= 0 && size < arrayList.size())) {
                if (size == -1) {
                    size = arrayList.size() - 1;
                } else if (size == arrayList.size()) {
                    size = 0;
                }
                messageObject = (MessageObject) arrayList.get(size);
            } else {
                messageObject = null;
            }
            this.N[i13] = messageObject;
        }
    }

    public final void m(LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        this.A.removeView(linearLayout);
    }

    public final void n(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        int iIntValue = ((Integer) viewGroup.getTag()).intValue();
        viewGroup.setVisibility(8);
        if (iIntValue == 1) {
            this.B.add(viewGroup);
        } else if (iIntValue == 2) {
            this.C.add(viewGroup);
        } else if (iIntValue == 3) {
            this.D.add(viewGroup);
        }
    }

    public final void o(boolean z10) {
        if (this.f35831a == null) {
            return;
        }
        int i10 = 0;
        org.telegram.ui.Components.vv0[] vv0VarArr = this.F;
        if (!z10) {
            this.f35834e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f35834e.setCompoundDrawablePadding(0);
            while (i10 < vv0VarArr.length) {
                vv0VarArr[i10].e();
                i10++;
            }
            return;
        }
        try {
            Integer printingStringType = MessagesController.getInstance(this.M.currentAccount).getPrintingStringType(this.M.getDialogId(), 0L);
            this.f35834e.setCompoundDrawablesWithIntrinsicBounds(vv0VarArr[printingStringType.intValue()], (Drawable) null, (Drawable) null, (Drawable) null);
            this.f35834e.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
            while (i10 < vv0VarArr.length) {
                if (i10 == printingStringType.intValue()) {
                    vv0VarArr[i10].d();
                } else {
                    vv0VarArr[i10].e();
                }
                i10++;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f35832b.t0()) {
            this.f35832b.m0(true);
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
        org.telegram.ui.ActionBar.g6.R(this);
        org.telegram.ui.ActionBar.g6.J(this, false);
        AndroidUtilities.fillStatusBarHeight(this, false);
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.appDidLogout);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.contactsDidLoad);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.G = ConnectionsManager.generateClassGuid();
        this.F[0] = new org.telegram.ui.Components.l41(false);
        this.F[1] = new org.telegram.ui.Components.fp(false);
        this.F[2] = new org.telegram.ui.Components.ho0(false);
        this.F[3] = new org.telegram.ui.Components.uf0(null, false);
        this.F[4] = new org.telegram.ui.Components.jl0(false);
        gh.q4 q4Var = new gh.q4(this, this, 7);
        setContentView(q4Var);
        q4Var.setBackgroundColor(-1728053248);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        q4Var.addView(relativeLayout, h7.z5.c(-1.0f, -1));
        mv0 mv0Var = new mv0(this, this);
        this.A = mv0Var;
        mv0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        float f10 = -1;
        relativeLayout.addView(this.A, h7.z5.v(12, f10, 12, 240, 13));
        ChatActivityEnterView chatActivityEnterView = this.f35832b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.B0();
        }
        ChatActivityEnterView chatActivityEnterView2 = new ChatActivityEnterView(this, q4Var, null, false, null);
        this.f35832b = chatActivityEnterView2;
        chatActivityEnterView2.setId(1000);
        this.A.addView(this.f35832b, h7.z5.v(0, f10, 0, -2, 12));
        this.f35832b.setDelegate(new nv0(this));
        n0 n0Var = new n0(this, this, 19);
        this.f35836n = n0Var;
        this.A.addView(n0Var, 0);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(this, null);
        this.f35831a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f35831a.setBackButtonImage(R.drawable.ic_close_white);
        this.f35831a.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23322s8, false));
        this.f35831a.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23341t8, false), false);
        this.A.addView(this.f35831a);
        ViewGroup.LayoutParams layoutParams = this.f35831a.getLayoutParams();
        layoutParams.width = -1;
        this.f35831a.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.v0 v0VarG = this.f35831a.n().g(2, 0, AndroidUtilities.dp(56.0f));
        TextView textView = new TextView(this);
        this.h = textView;
        int i11 = org.telegram.ui.ActionBar.g6.B8;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(17);
        v0VarG.addView(this.h, h7.z5.c(-1.0f, 56));
        FrameLayout frameLayout = new FrameLayout(this);
        this.f35835f = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        this.f35831a.addView(this.f35835f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f35835f.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -2;
        layoutParams2.rightMargin = AndroidUtilities.dp(48.0f);
        layoutParams2.leftMargin = AndroidUtilities.dp(60.0f);
        layoutParams2.gravity = 51;
        this.f35835f.setLayoutParams(layoutParams2);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(this);
        this.f35833c = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f35835f.addView(this.f35833c);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f35833c.getLayoutParams();
        layoutParams3.width = AndroidUtilities.dp(42.0f);
        layoutParams3.height = AndroidUtilities.dp(42.0f);
        layoutParams3.topMargin = AndroidUtilities.dp(3.0f);
        this.f35833c.setLayoutParams(layoutParams3);
        TextView textView2 = new TextView(this);
        this.d = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A8, false));
        this.d.setTextSize(1, 18.0f);
        this.d.setLines(1);
        this.d.setMaxLines(1);
        this.d.setSingleLine(true);
        TextView textView3 = this.d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        this.d.setGravity(3);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f35835f.addView(this.d);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.leftMargin = AndroidUtilities.dp(54.0f);
        layoutParams4.bottomMargin = AndroidUtilities.dp(22.0f);
        layoutParams4.gravity = 80;
        this.d.setLayoutParams(layoutParams4);
        TextView textView4 = new TextView(this);
        this.f35834e = textView4;
        textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.f35834e.setTextSize(1, 14.0f);
        this.f35834e.setLines(1);
        this.f35834e.setMaxLines(1);
        this.f35834e.setSingleLine(true);
        this.f35834e.setEllipsize(truncateAt);
        this.f35834e.setGravity(3);
        this.f35835f.addView(this.f35834e);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f35834e.getLayoutParams();
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        layoutParams5.leftMargin = AndroidUtilities.dp(54.0f);
        layoutParams5.bottomMargin = AndroidUtilities.dp(4.0f);
        layoutParams5.gravity = 80;
        this.f35834e.setLayoutParams(layoutParams5);
        this.f35831a.setActionBarMenuOnItemClick(new pb0(this, 13));
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(268435462, "screen");
        this.P = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        h(getIntent());
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        i();
        MediaController.getInstance().setFeedbackView(this.f35832b, false);
        if (this.P.isHeld()) {
            this.P.release();
        }
        org.telegram.ui.Components.n9 n9Var = this.f35833c;
        if (n9Var != null) {
            n9Var.setImageDrawable(null);
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
        ChatActivityEnterView chatActivityEnterView = this.f35832b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.m0(false);
            this.f35832b.setFieldFocused(false);
        }
        int i10 = this.H;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i10).setAppPaused(true, false);
        }
    }

    @Override
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 != 3 || iArr[0] == 0) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PermissionNoAudioWithHint);
        alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new dl0(this, 7));
        i0.a.C(R.string.OK, alertDialog$Builder, null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        MediaController.getInstance().setFeedbackView(this.f35832b, true);
        ChatActivityEnterView chatActivityEnterView = this.f35832b;
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

    public final void q(int i10) {
        if (this.f35831a == null) {
            return;
        }
        int i11 = this.H;
        if (i11 != this.M.currentAccount) {
            if (i11 >= 0) {
                ConnectionsManager.getInstance(i11).setAppPaused(true, false);
            }
            int i12 = this.M.currentAccount;
            this.H = i12;
            ConnectionsManager.getInstance(i12).setAppPaused(false, false);
        }
        this.J = null;
        this.I = null;
        long dialogId = this.M.getDialogId();
        this.f35832b.a1(this.M.currentAccount, dialogId);
        if (DialogObject.isEncryptedDialog(dialogId)) {
            this.I = MessagesController.getInstance(this.M.currentAccount).getUser(Long.valueOf(org.telegram.messenger.y1.n(MessagesController.getInstance(this.M.currentAccount), dialogId).user_id));
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
                this.f35834e.setText(UserObject.getUserName(user));
            } else {
                this.f35834e.setText((CharSequence) null);
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
        l(i10);
        r();
        b();
        a(0);
    }

    public final void r() {
        MessageObject messageObject;
        TLRPC.User user;
        String str;
        if (this.f35831a == null || (messageObject = this.M) == null || this.J != null || (user = this.I) == null) {
            return;
        }
        long j10 = user.f22527id;
        if (j10 / 1000 == 777 || j10 / 1000 == 333 || ContactsController.getInstance(messageObject.currentAccount).contactsDict.get(Long.valueOf(this.I.f22527id)) != null || ((ContactsController.getInstance(this.M.currentAccount).contactsDict.size() == 0 && ContactsController.getInstance(this.M.currentAccount).isLoadingContacts()) || (str = this.I.phone) == null || str.length() == 0)) {
            this.d.setText(UserObject.getUserName(this.I));
        } else {
            this.d.setText(oe.b.c().b("+" + this.I.phone));
        }
        TLRPC.User user2 = this.I;
        if (user2 != null && user2.f22527id == 489000) {
            this.f35834e.setText(LocaleController.getString(R.string.VerifyCodesNotifications));
            return;
        }
        if (user2 != null && user2.f22527id == 777000) {
            this.f35834e.setText(LocaleController.getString(R.string.ServiceNotifications));
            return;
        }
        CharSequence printingString = MessagesController.getInstance(this.M.currentAccount).getPrintingString(this.M.getDialogId(), 0L, false);
        if (printingString != null && printingString.length() != 0) {
            this.L = printingString;
            this.f35834e.setText(printingString);
            o(true);
        } else {
            this.L = null;
            o(false);
            TLRPC.User user3 = MessagesController.getInstance(this.M.currentAccount).getUser(Long.valueOf(this.I.f22527id));
            if (user3 != null) {
                this.I = user3;
            }
            this.f35834e.setText(LocaleController.formatUserStatus(this.M.currentAccount, this.I));
        }
    }
}
