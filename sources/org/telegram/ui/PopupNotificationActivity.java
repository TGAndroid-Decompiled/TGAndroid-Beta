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
    public static final int f35877b0 = 0;
    public dw0 E;
    public int K;
    public TLRPC.User M;
    public TLRPC.Chat N;
    public CharSequence P;
    public boolean Z;
    public org.telegram.ui.ActionBar.k f35878a;
    public ChatActivityEnterView f35880b;
    public org.telegram.ui.Components.y9 f35881c;
    public TextView d;
    public TextView e;
    public FrameLayout f35882f;
    public TextView h;
    public k0 f35883n;
    public ViewGroup f35884r;
    public ViewGroup f35885s;
    public ViewGroup v;
    public LinearLayout f35886w;
    public LinearLayout f35887x;
    public LinearLayout f35888y;
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public VelocityTracker I = null;
    public final org.telegram.ui.Components.sx0[] J = new org.telegram.ui.Components.sx0[5];
    public int L = -1;
    public boolean O = false;
    public MessageObject Q = null;
    public final MessageObject[] R = new MessageObject[3];
    public int S = 0;
    public PowerManager.WakeLock T = null;
    public boolean U = false;
    public long V = 0;
    public float W = -1.0f;
    public boolean X = false;
    public Runnable Y = null;
    public final ArrayList f35879a0 = new ArrayList();

    public final void a(int i10) {
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
        ViewGroup viewGroup = this.f35885s;
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams.width != dp) {
                layoutParams.width = dp;
                this.f35885s.setLayoutParams(layoutParams);
            }
            this.f35885s.setTranslationX((-dp) + i10);
        }
        LinearLayout linearLayout = this.f35887x;
        if (linearLayout != null) {
            linearLayout.setTranslationX((-dp) + i10);
        }
        ViewGroup viewGroup2 = this.f35884r;
        if (viewGroup2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            if (layoutParams2.width != dp) {
                layoutParams2.width = dp;
                this.f35884r.setLayoutParams(layoutParams2);
            }
            this.f35884r.setTranslationX(i10);
        }
        LinearLayout linearLayout2 = this.f35886w;
        if (linearLayout2 != null) {
            linearLayout2.setTranslationX(i10);
        }
        ViewGroup viewGroup3 = this.v;
        if (viewGroup3 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup3.getLayoutParams();
            if (layoutParams3.width != dp) {
                layoutParams3.width = dp;
                this.v.setLayoutParams(layoutParams3);
            }
            this.v.setTranslationX(dp + i10);
        }
        LinearLayout linearLayout3 = this.f35888y;
        if (linearLayout3 != null) {
            linearLayout3.setTranslationX(dp + i10);
        }
        this.f35883n.invalidate();
    }

    public final void b() {
        TLRPC.User user;
        MessageObject messageObject = this.Q;
        if (messageObject != null) {
            if (this.N != null) {
                TLRPC.Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(this.N.f22028id));
                if (chat != null) {
                    this.N = chat;
                    if (this.f35881c != null) {
                        this.f35881c.f(chat, new org.telegram.ui.Components.j9(this.N));
                    }
                }
            } else if (this.M != null && (user = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(this.M.f22177id))) != null) {
                this.M = user;
                if (this.f35881c != null) {
                    this.f35881c.f(user, new org.telegram.ui.Components.j9(0, this.M));
                }
            }
        }
    }

    public final boolean c() {
        if (this.U && this.V < System.currentTimeMillis() - 400) {
            this.U = false;
            Runnable runnable = this.Y;
            if (runnable != null) {
                runnable.run();
                this.Y = null;
            }
        }
        return this.U;
    }

    public final void d() {
        FrameLayout frameLayout = this.f35882f;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new fw0(this, 0));
        }
        k0 k0Var = this.f35883n;
        if (k0Var != null) {
            k0Var.getViewTreeObserver().addOnPreDrawListener(new fw0(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        org.telegram.ui.Components.ph0 ph0Var;
        MessageObject messageObject;
        org.telegram.ui.Components.ph0 ph0Var2;
        MessageObject messageObject2;
        MessageObject messageObject3;
        if (i10 == NotificationCenter.appDidLogout) {
            if (i11 == this.L) {
                i();
                finish();
                return;
            }
            return;
        }
        int i12 = 0;
        if (i10 == NotificationCenter.pushMessagesUpdated) {
            if (!this.Z) {
                ArrayList arrayList = this.f35879a0;
                arrayList.clear();
                for (int i13 = 0; i13 < 4; i13++) {
                    if (UserConfig.getInstance(i13).isClientActivated()) {
                        arrayList.addAll(NotificationsController.getInstance(i13).popupMessages);
                    }
                }
                f();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < 3; i14++) {
                        int i15 = (this.S - 1) + i14;
                        if (arrayList.size() == 1 && (i15 < 0 || i15 >= arrayList.size())) {
                            messageObject3 = null;
                        } else {
                            if (i15 == -1) {
                                i15 = arrayList.size() - 1;
                            } else if (i15 == arrayList.size()) {
                                i15 = 0;
                            }
                            messageObject3 = (MessageObject) arrayList.get(i15);
                        }
                        if (this.R[i14] != messageObject3) {
                            q(0);
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (this.Q != null && i11 == this.L) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0) {
                    r();
                }
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0) {
                    b();
                }
                if ((intValue & MessagesController.UPDATE_MASK_USER_PRINT) != 0) {
                    CharSequence printingString = MessagesController.getInstance(this.Q.currentAccount).getPrintingString(this.Q.getDialogId(), 0L, false);
                    CharSequence charSequence = this.P;
                    if ((charSequence != null && printingString == null) || ((charSequence == null && printingString != null) || (charSequence != null && !charSequence.equals(printingString)))) {
                        r();
                    }
                }
            }
        } else if (i10 == NotificationCenter.messagePlayingDidReset) {
            Integer num = (Integer) objArr[0];
            k0 k0Var = this.f35883n;
            if (k0Var != null) {
                int childCount = k0Var.getChildCount();
                while (i12 < childCount) {
                    View childAt = this.f35883n.getChildAt(i12);
                    if (((Integer) childAt.getTag()).intValue() == 3 && (messageObject2 = (ph0Var2 = (org.telegram.ui.Components.ph0) childAt.findViewWithTag(300)).getMessageObject()) != null && messageObject2.currentAccount == i11 && messageObject2.getId() == num.intValue()) {
                        ph0Var2.q();
                        return;
                    }
                    i12++;
                }
            }
        } else if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
            Integer num2 = (Integer) objArr[0];
            k0 k0Var2 = this.f35883n;
            if (k0Var2 != null) {
                int childCount2 = k0Var2.getChildCount();
                while (i12 < childCount2) {
                    View childAt2 = this.f35883n.getChildAt(i12);
                    if (((Integer) childAt2.getTag()).intValue() == 3 && (messageObject = (ph0Var = (org.telegram.ui.Components.ph0) childAt2.findViewWithTag(300)).getMessageObject()) != null && messageObject.currentAccount == i11 && messageObject.getId() == num2.intValue()) {
                        ph0Var.r();
                        return;
                    }
                    i12++;
                }
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            k0 k0Var3 = this.f35883n;
            if (k0Var3 != null) {
                int childCount3 = k0Var3.getChildCount();
                while (i12 < childCount3) {
                    View childAt3 = this.f35883n.getChildAt(i12);
                    if (((Integer) childAt3.getTag()).intValue() == 1 && (textView = (TextView) childAt3.findViewWithTag(301)) != null) {
                        textView.invalidate();
                    }
                    i12++;
                }
            }
        } else if (i10 == NotificationCenter.contactsDidLoad && i11 == this.L) {
            r();
        }
    }

    public final LinearLayout e(int i10, boolean z10) {
        int i11;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList;
        int i12 = i10;
        ArrayList arrayList2 = this.f35879a0;
        LinearLayout linearLayout = null;
        if (arrayList2.size() == 1 && (i12 < 0 || i12 >= arrayList2.size())) {
            return null;
        }
        int i13 = 0;
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
            i11 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i14);
                int size2 = keyboardInlineButtonRow.buttons.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (bg.c.c(keyboardInlineButtonRow.buttons.get(i15), TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        i11++;
                    }
                }
            }
        } else {
            i11 = 0;
        }
        int i16 = messageObject.currentAccount;
        if (i11 > 0 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList4 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size3 = arrayList4.size();
            LinearLayout linearLayout2 = null;
            int i17 = 0;
            while (i17 < size3) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow2 = arrayList4.get(i17);
                int size4 = keyboardInlineButtonRow2.buttons.size();
                int i18 = i13;
                while (i18 < size4) {
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow2.buttons.get(i18);
                    if (bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        if (linearLayout2 == null) {
                            linearLayout2 = new LinearLayout(this);
                            linearLayout2.setOrientation(i13);
                            arrayList = arrayList4;
                            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, linearLayout2, null);
                            linearLayout2.setWeightSum(100.0f);
                            linearLayout2.setTag("b");
                            linearLayout2.setOnTouchListener(new de1(1));
                        } else {
                            arrayList = arrayList4;
                        }
                        TextView textView = new TextView(this);
                        textView.setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23541n6, null);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setText(keyboardInlineButton.text.toUpperCase());
                        textView.setTag(keyboardInlineButton);
                        textView.setGravity(17);
                        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(true));
                        linearLayout2.addView(textView, org.telegram.ui.Components.kb1.p(100.0f / i11, -1, -1));
                        textView.setOnClickListener(new bw0(messageObject, i16));
                    } else {
                        arrayList = arrayList4;
                    }
                    i18++;
                    arrayList4 = arrayList;
                    i13 = 0;
                }
                i17++;
                i13 = 0;
            }
            linearLayout = linearLayout2;
        }
        if (linearLayout != null) {
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            if (z10) {
                int i19 = this.S;
                if (i12 == i19) {
                    linearLayout.setTranslationX(0.0f);
                } else if (i12 == i19 - 1) {
                    linearLayout.setTranslationX(-dp);
                } else if (i12 == i19 + 1) {
                    linearLayout.setTranslationX(dp);
                }
            }
            this.E.addView(linearLayout, layoutParams);
        }
        return linearLayout;
    }

    public final void f() {
        ArrayList arrayList = this.f35879a0;
        if (arrayList.isEmpty()) {
            i();
            finish();
            return;
        }
        if ((this.S != 0 || this.f35880b.g0() || this.X) && this.Q != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                if (messageObject.currentAccount == this.Q.currentAccount && messageObject.getDialogId() == this.Q.getDialogId() && messageObject.getId() == this.Q.getId()) {
                    this.S = i10;
                    if (this.X) {
                        if (i10 == arrayList.size() - 1) {
                            l(3);
                        } else if (this.S == 1) {
                            l(4);
                        }
                    }
                    this.h.setText(String.format("%d/%d", Integer.valueOf(this.S + 1), Integer.valueOf(arrayList.size())));
                }
            }
        }
        this.S = 0;
        this.Q = (MessageObject) arrayList.get(0);
        q(0);
        this.h.setText(String.format("%d/%d", Integer.valueOf(this.S + 1), Integer.valueOf(arrayList.size())));
    }

    public final ViewGroup g(int i10, boolean z10) {
        ViewGroup frameLayout;
        int i11;
        int i12;
        MessageObject messageObject;
        int i13;
        int i14;
        org.telegram.ui.Components.ph0 ph0Var;
        int i15 = i10;
        ArrayList arrayList = this.f35879a0;
        if (arrayList.size() == 1 && (i15 < 0 || i15 >= arrayList.size())) {
            return null;
        }
        if (i15 == -1) {
            i15 = arrayList.size() - 1;
        } else if (i15 == arrayList.size()) {
            i15 = 0;
        }
        MessageObject messageObject2 = (MessageObject) arrayList.get(i15);
        int i16 = messageObject2.type;
        if ((i16 == 1 || i16 == 4) && !messageObject2.isSecretMedia()) {
            ArrayList arrayList2 = this.G;
            if (arrayList2.size() > 0) {
                frameLayout = (ViewGroup) arrayList2.get(0);
                arrayList2.remove(0);
                i12 = 0;
                i11 = 2;
            } else {
                frameLayout = new FrameLayout(this);
                FrameLayout frameLayout2 = new FrameLayout(this);
                i11 = 2;
                i12 = 0;
                frameLayout2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                frameLayout2.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
                frameLayout.addView(frameLayout2, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(this);
                y9Var.setTag(311);
                frameLayout2.addView(y9Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                TextView textView = new TextView(this);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
                textView.setTextSize(1, 16.0f);
                textView.setGravity(17);
                textView.setTag(312);
                frameLayout2.addView(textView, org.telegram.ui.Components.kb1.i(-1, -2, 17));
                frameLayout.setTag(2);
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final PopupNotificationActivity f38466b;

                    {
                        this.f38466b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i17 = r2;
                        PopupNotificationActivity popupNotificationActivity = this.f38466b;
                        switch (i17) {
                            case 0:
                                int i18 = PopupNotificationActivity.f35877b0;
                                popupNotificationActivity.k();
                                return;
                            case 1:
                                int i19 = PopupNotificationActivity.f35877b0;
                                popupNotificationActivity.k();
                                return;
                            default:
                                int i20 = PopupNotificationActivity.f35877b0;
                                popupNotificationActivity.k();
                                return;
                        }
                    }
                });
            }
            TextView textView2 = (TextView) frameLayout.findViewWithTag(312);
            org.telegram.ui.Components.y9 y9Var2 = (org.telegram.ui.Components.y9) frameLayout.findViewWithTag(311);
            y9Var2.setAspectFit(true);
            int i17 = messageObject2.type;
            if (i17 == 1) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject2.photoThumbs, AndroidUtilities.getPhotoSize());
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject2.photoThumbs, 100);
                if (closestPhotoSizeWithSize != null) {
                    if (messageObject2.type == 1 && !FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(messageObject2.messageOwner).exists()) {
                        i14 = i12;
                    } else {
                        i14 = 1;
                    }
                    if (!messageObject2.needDrawBluredPreview()) {
                        if (i14 == 0 && !DownloadController.getInstance(messageObject2.currentAccount).canDownloadMedia(messageObject2)) {
                            if (closestPhotoSizeWithSize2 != null) {
                                y9Var2.i(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject2.photoThumbsObject), "100_100_b", null, null, messageObject2);
                            } else {
                                messageObject = messageObject2;
                                i13 = i12;
                                y9Var2.setVisibility(8);
                                textView2.setVisibility(i13);
                                textView2.setTextSize(i11, SharedConfig.fontSize);
                                textView2.setText(messageObject.messageText);
                            }
                        } else {
                            y9Var2.j(ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject2.photoThumbsObject), "100_100", ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject2.photoThumbsObject), "100_100_b", closestPhotoSizeWithSize.size, messageObject2);
                        }
                        y9Var2.setVisibility(i12);
                        textView2.setVisibility(8);
                    }
                }
                messageObject = messageObject2;
                i13 = i12;
                y9Var2.setVisibility(8);
                textView2.setVisibility(i13);
                textView2.setTextSize(i11, SharedConfig.fontSize);
                textView2.setText(messageObject.messageText);
            } else if (i17 == 4) {
                textView2.setVisibility(8);
                textView2.setText(messageObject2.messageText);
                y9Var2.setVisibility(0);
                TLRPC.GeoPoint geoPoint = messageObject2.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                if (MessagesController.getInstance(messageObject2.currentAccount).mapProvider == 2) {
                    y9Var2.i(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, 100, 100, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), null, null, null, messageObject2);
                } else {
                    y9Var2.g(AndroidUtilities.formapMapUrl(messageObject2.currentAccount, d, d10, 100, 100, true, 15, -1), null, null);
                }
            }
        } else if (messageObject2.type == 2) {
            ArrayList arrayList3 = this.H;
            if (arrayList3.size() > 0) {
                ViewGroup viewGroup = (ViewGroup) arrayList3.get(0);
                arrayList3.remove(0);
                ph0Var = (org.telegram.ui.Components.ph0) viewGroup.findViewWithTag(300);
                frameLayout = viewGroup;
            } else {
                ViewGroup frameLayout3 = new FrameLayout(this);
                FrameLayout frameLayout4 = new FrameLayout(this);
                frameLayout4.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                frameLayout4.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
                frameLayout3.addView(frameLayout4, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                FrameLayout frameLayout5 = new FrameLayout(this);
                frameLayout4.addView(frameLayout5, org.telegram.ui.Components.kb1.h(-1, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
                ?? zVar = new org.telegram.ui.Cells.z(this);
                zVar.f31614f = false;
                zVar.f31620y = 0;
                zVar.G = 0;
                zVar.J = 0;
                TextPaint textPaint = new TextPaint(1);
                zVar.f31616r = textPaint;
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                zVar.K = DownloadController.getInstance(zVar.f31615n).generateObserverTag();
                org.telegram.ui.Components.jp0 jp0Var = new org.telegram.ui.Components.jp0(zVar);
                zVar.f31617s = jp0Var;
                jp0Var.h = zVar;
                ?? obj = new Object();
                obj.f35062c = 0.0f;
                obj.f35063f = AndroidUtilities.dp(2.0f);
                obj.f35060a = new Paint();
                obj.f35061b = new Paint();
                zVar.v = obj;
                zVar.setTag(300);
                frameLayout5.addView(zVar);
                frameLayout3.setTag(3);
                frameLayout3.setOnClickListener(new View.OnClickListener(this) {
                    public final PopupNotificationActivity f38466b;

                    {
                        this.f38466b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i172 = r2;
                        PopupNotificationActivity popupNotificationActivity = this.f38466b;
                        switch (i172) {
                            case 0:
                                int i18 = PopupNotificationActivity.f35877b0;
                                popupNotificationActivity.k();
                                return;
                            case 1:
                                int i19 = PopupNotificationActivity.f35877b0;
                                popupNotificationActivity.k();
                                return;
                            default:
                                int i20 = PopupNotificationActivity.f35877b0;
                                popupNotificationActivity.k();
                                return;
                        }
                    }
                });
                frameLayout = frameLayout3;
                ph0Var = zVar;
            }
            ph0Var.setMessageObject(messageObject2);
            if (DownloadController.getInstance(messageObject2.currentAccount).canDownloadMedia(messageObject2) && ph0Var.f31620y == 2) {
                FileLoader.getInstance(ph0Var.f31615n).loadFile(ph0Var.h.getDocument(), ph0Var.h, 1, 0);
                ph0Var.f31620y = 3;
                ph0Var.invalidate();
            }
        } else {
            ArrayList arrayList4 = this.F;
            if (arrayList4.size() > 0) {
                arrayList4.remove(0);
                frameLayout = (ViewGroup) arrayList4.get(0);
            } else {
                frameLayout = new FrameLayout(this);
                ScrollView scrollView = new ScrollView(this);
                scrollView.setFillViewport(true);
                frameLayout.addView(scrollView, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(0);
                linearLayout.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
                scrollView.addView(linearLayout, org.telegram.ui.Components.kb1.B(-1, -2, 1));
                linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                linearLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final PopupNotificationActivity f38466b;

                    {
                        this.f38466b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i172 = r2;
                        PopupNotificationActivity popupNotificationActivity = this.f38466b;
                        switch (i172) {
                            case 0:
                                int i18 = PopupNotificationActivity.f35877b0;
                                popupNotificationActivity.k();
                                return;
                            case 1:
                                int i19 = PopupNotificationActivity.f35877b0;
                                popupNotificationActivity.k();
                                return;
                            default:
                                int i20 = PopupNotificationActivity.f35877b0;
                                popupNotificationActivity.k();
                                return;
                        }
                    }
                });
                TextView textView3 = new TextView(this);
                textView3.setTextSize(1, 16.0f);
                textView3.setTag(301);
                int i18 = org.telegram.ui.ActionBar.y6.G6;
                org.telegram.ui.ActionBar.f7.V(textView3, i18, null);
                org.telegram.ui.ActionBar.f7.H(textView3, i18, null);
                textView3.setGravity(17);
                linearLayout.addView(textView3, org.telegram.ui.Components.kb1.u(-1, -2, 17));
                frameLayout.setTag(1);
            }
            TextView textView4 = (TextView) frameLayout.findViewWithTag(301);
            textView4.setTextSize(2, SharedConfig.fontSize);
            textView4.setText(messageObject2.messageText);
        }
        if (frameLayout.getParent() == null) {
            this.f35883n.addView(frameLayout);
        }
        frameLayout.setVisibility(0);
        if (z10) {
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.gravity = 51;
            layoutParams.height = -1;
            layoutParams.width = dp;
            int i19 = this.S;
            if (i15 == i19) {
                frameLayout.setTranslationX(0.0f);
            } else if (i15 == i19 - 1) {
                frameLayout.setTranslationX(-dp);
            } else if (i15 == i19 + 1) {
                frameLayout.setTranslationX(dp);
            }
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.invalidate();
        }
        return frameLayout;
    }

    public final void h(Intent intent) {
        boolean z10;
        int i10;
        if (intent != null && intent.getBooleanExtra("force", false)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z = z10;
        this.f35879a0.clear();
        if (this.Z) {
            if (intent != null) {
                i10 = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
            } else {
                i10 = UserConfig.selectedAccount;
            }
            if (!UserConfig.isValidAccount(i10)) {
                return;
            }
            this.f35879a0.addAll(NotificationsController.getInstance(i10).popupReplyMessages);
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                if (UserConfig.getInstance(i11).isClientActivated()) {
                    this.f35879a0.addAll(NotificationsController.getInstance(i11).popupMessages);
                }
            }
        }
        if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode() && ApplicationLoader.isScreenOn) {
            getWindow().addFlags(2623488);
            getWindow().clearFlags(2);
        } else {
            getWindow().addFlags(2623490);
        }
        if (this.Q == null) {
            this.S = 0;
        }
        f();
    }

    public final void i() {
        if (!this.O) {
            this.O = true;
            if (this.Z) {
                this.f35879a0.clear();
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
            ChatActivityEnterView chatActivityEnterView = this.f35880b;
            if (chatActivityEnterView != null) {
                chatActivityEnterView.y0();
            }
            if (this.T.isHeld()) {
                this.T.release();
            }
        }
    }

    public final boolean j(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PopupNotificationActivity.j(android.view.MotionEvent):boolean");
    }

    public final void k() {
        if (this.Q == null) {
            return;
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, LaunchActivity.class);
        long dialogId = this.Q.getDialogId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            intent.putExtra("encId", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            intent.putExtra("userId", dialogId);
        } else if (DialogObject.isChatDialog(dialogId)) {
            intent.putExtra("chatId", -dialogId);
        }
        intent.putExtra("currentAccount", this.Q.currentAccount);
        intent.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
        intent.setFlags(32768);
        startActivity(intent);
        i();
        finish();
    }

    public final void l(int i10) {
        MessageObject messageObject;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
        if (i10 == 0) {
            n(this.f35884r);
            n(this.f35885s);
            n(this.v);
            m(this.f35886w);
            m(this.f35887x);
            m(this.f35888y);
            int i11 = this.S - 1;
            while (true) {
                int i12 = this.S;
                if (i11 >= i12 + 2) {
                    break;
                }
                if (i11 == i12 - 1) {
                    this.f35885s = g(i11, true);
                    this.f35887x = e(i11, true);
                } else if (i11 == i12) {
                    this.f35884r = g(i11, true);
                    this.f35886w = e(i11, true);
                } else if (i11 == i12 + 1) {
                    this.v = g(i11, true);
                    this.f35888y = e(i11, true);
                }
                i11++;
            }
        } else if (i10 == 1) {
            n(this.v);
            m(this.f35888y);
            this.v = this.f35884r;
            this.f35884r = this.f35885s;
            this.f35885s = g(this.S - 1, true);
            this.f35888y = this.f35886w;
            this.f35886w = this.f35887x;
            this.f35887x = e(this.S - 1, true);
        } else if (i10 == 2) {
            n(this.f35885s);
            m(this.f35887x);
            this.f35885s = this.f35884r;
            this.f35884r = this.v;
            this.v = g(this.S + 1, true);
            this.f35887x = this.f35886w;
            this.f35886w = this.f35888y;
            this.f35888y = e(this.S + 1, true);
        } else if (i10 == 3) {
            ViewGroup viewGroup = this.v;
            if (viewGroup != null) {
                float translationX = viewGroup.getTranslationX();
                n(this.v);
                ViewGroup g7 = g(this.S + 1, false);
                this.v = g7;
                if (g7 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g7.getLayoutParams();
                    layoutParams.width = dp;
                    this.v.setLayoutParams(layoutParams);
                    this.v.setTranslationX(translationX);
                    this.v.invalidate();
                }
            }
            LinearLayout linearLayout = this.f35888y;
            if (linearLayout != null) {
                float translationX2 = linearLayout.getTranslationX();
                m(this.f35888y);
                LinearLayout e = e(this.S + 1, false);
                this.f35888y = e;
                if (e != null) {
                    e.setTranslationX(translationX2);
                }
            }
        } else if (i10 == 4) {
            ViewGroup viewGroup2 = this.f35885s;
            if (viewGroup2 != null) {
                float translationX3 = viewGroup2.getTranslationX();
                n(this.f35885s);
                ViewGroup g10 = g(0, false);
                this.f35885s = g10;
                if (g10 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g10.getLayoutParams();
                    layoutParams2.width = dp;
                    this.f35885s.setLayoutParams(layoutParams2);
                    this.f35885s.setTranslationX(translationX3);
                    this.f35885s.invalidate();
                }
            }
            LinearLayout linearLayout2 = this.f35887x;
            if (linearLayout2 != null) {
                float translationX4 = linearLayout2.getTranslationX();
                m(this.f35887x);
                LinearLayout e10 = e(0, false);
                this.f35887x = e10;
                if (e10 != null) {
                    e10.setTranslationX(translationX4);
                }
            }
        }
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = (this.S - 1) + i13;
            ArrayList arrayList = this.f35879a0;
            if (arrayList.size() == 1 && (i14 < 0 || i14 >= arrayList.size())) {
                messageObject = null;
            } else {
                if (i14 == -1) {
                    i14 = arrayList.size() - 1;
                } else if (i14 == arrayList.size()) {
                    i14 = 0;
                }
                messageObject = (MessageObject) arrayList.get(i14);
            }
            this.R[i13] = messageObject;
        }
    }

    public final void m(LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        this.E.removeView(linearLayout);
    }

    public final void n(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int intValue = ((Integer) viewGroup.getTag()).intValue();
            viewGroup.setVisibility(8);
            if (intValue == 1) {
                this.F.add(viewGroup);
            } else if (intValue == 2) {
                this.G.add(viewGroup);
            } else if (intValue == 3) {
                this.H.add(viewGroup);
            }
        }
    }

    public final void o(boolean z10) {
        if (this.f35878a != null) {
            int i10 = 0;
            org.telegram.ui.Components.sx0[] sx0VarArr = this.J;
            if (z10) {
                try {
                    Integer printingStringType = MessagesController.getInstance(this.Q.currentAccount).getPrintingStringType(this.Q.getDialogId(), 0L);
                    this.e.setCompoundDrawablesWithIntrinsicBounds(sx0VarArr[printingStringType.intValue()], (Drawable) null, (Drawable) null, (Drawable) null);
                    this.e.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                    while (i10 < sx0VarArr.length) {
                        if (i10 == printingStringType.intValue()) {
                            sx0VarArr[i10].d();
                        } else {
                            sx0VarArr[i10].e();
                        }
                        i10++;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            this.e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.e.setCompoundDrawablePadding(0);
            while (i10 < sx0VarArr.length) {
                sx0VarArr[i10].e();
                i10++;
            }
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f35880b.p0()) {
            this.f35880b.i0(true);
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
        org.telegram.ui.ActionBar.y6.S(this);
        org.telegram.ui.ActionBar.y6.J(this, false);
        AndroidUtilities.fillStatusBarHeight(this, false);
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.appDidLogout);
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.updateInterfaces);
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.messagePlayingDidReset);
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.contactsDidLoad);
        }
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
        this.K = ConnectionsManager.generateClassGuid();
        this.J[0] = new org.telegram.ui.Components.s61(false);
        this.J[1] = new org.telegram.ui.Components.eq(false);
        this.J[2] = new org.telegram.ui.Components.eq0(false);
        this.J[3] = new org.telegram.ui.Components.fh0(null, false);
        this.J[4] = new org.telegram.ui.Components.cn0(false);
        a9 a9Var = new a9(this, this, 6);
        setContentView(a9Var);
        a9Var.setBackgroundColor(-1728053248);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        a9Var.addView(relativeLayout, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        dw0 dw0Var = new dw0(this, this);
        this.E = dw0Var;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, dw0Var, null);
        float f7 = -1;
        relativeLayout.addView(this.E, org.telegram.ui.Components.kb1.z(12, f7, 12, 240, 13));
        ChatActivityEnterView chatActivityEnterView = this.f35880b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.y0();
        }
        ChatActivityEnterView chatActivityEnterView2 = new ChatActivityEnterView(this, a9Var, null, false, null);
        this.f35880b = chatActivityEnterView2;
        chatActivityEnterView2.setId(1000);
        this.E.addView(this.f35880b, org.telegram.ui.Components.kb1.z(0, f7, 0, -2, 12));
        this.f35880b.setDelegate(new ew0(this));
        k0 k0Var = new k0(this, this, 20);
        this.f35883n = k0Var;
        this.E.addView(k0Var, 0);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(this, null);
        this.f35878a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f35878a.setBackButtonImage(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23637s8, this.f35878a, null);
        org.telegram.ui.ActionBar.f7.m(this.f35878a, 3, org.telegram.ui.ActionBar.y6.f23657t8, null);
        org.telegram.ui.ActionBar.f7.m(this.f35878a, 1, org.telegram.ui.ActionBar.y6.f23695v8, null);
        this.E.addView(this.f35878a);
        ViewGroup.LayoutParams layoutParams = this.f35878a.getLayoutParams();
        layoutParams.width = -1;
        this.f35878a.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.w0 g7 = this.f35878a.l().g(2, 0, AndroidUtilities.dp(56.0f));
        TextView textView = new TextView(this);
        this.h = textView;
        int i11 = org.telegram.ui.ActionBar.y6.B8;
        org.telegram.ui.ActionBar.f7.V(textView, i11, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(17);
        g7.addView(this.h, org.telegram.ui.Components.kb1.g(-1.0f, 56));
        FrameLayout frameLayout = new FrameLayout(this);
        this.f35882f = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        this.f35878a.addView(this.f35882f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f35882f.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -2;
        layoutParams2.rightMargin = AndroidUtilities.dp(48.0f);
        layoutParams2.leftMargin = AndroidUtilities.dp(60.0f);
        layoutParams2.gravity = 51;
        this.f35882f.setLayoutParams(layoutParams2);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(this);
        this.f35881c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f35882f.addView(this.f35881c);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f35881c.getLayoutParams();
        layoutParams3.width = AndroidUtilities.dp(42.0f);
        layoutParams3.height = AndroidUtilities.dp(42.0f);
        layoutParams3.topMargin = AndroidUtilities.dp(3.0f);
        this.f35881c.setLayoutParams(layoutParams3);
        TextView textView2 = new TextView(this);
        this.d = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.A8, null);
        this.d.setTextSize(1, 18.0f);
        this.d.setLines(1);
        this.d.setMaxLines(1);
        this.d.setSingleLine(true);
        TextView textView3 = this.d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        this.d.setGravity(3);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f35882f.addView(this.d);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.leftMargin = AndroidUtilities.dp(54.0f);
        layoutParams4.bottomMargin = AndroidUtilities.dp(22.0f);
        layoutParams4.gravity = 80;
        this.d.setLayoutParams(layoutParams4);
        TextView textView4 = new TextView(this);
        this.e = textView4;
        org.telegram.ui.ActionBar.f7.V(textView4, i11, null);
        this.e.setTextSize(1, 14.0f);
        this.e.setLines(1);
        this.e.setMaxLines(1);
        this.e.setSingleLine(true);
        this.e.setEllipsize(truncateAt);
        this.e.setGravity(3);
        this.f35882f.addView(this.e);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        layoutParams5.leftMargin = AndroidUtilities.dp(54.0f);
        layoutParams5.bottomMargin = AndroidUtilities.dp(4.0f);
        layoutParams5.gravity = 80;
        this.e.setLayoutParams(layoutParams5);
        this.f35878a.setActionBarMenuOnItemClick(new c20(this, 23));
        PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(268435462, "screen");
        this.T = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        h(getIntent());
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        i();
        MediaController.getInstance().setFeedbackView(this.f35880b, false);
        if (this.T.isHeld()) {
            this.T.release();
        }
        org.telegram.ui.Components.y9 y9Var = this.f35881c;
        if (y9Var != null) {
            y9Var.setImageDrawable(null);
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
        ChatActivityEnterView chatActivityEnterView = this.f35880b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.i0(false);
            this.f35880b.setFieldFocused(false);
        }
        int i10 = this.L;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i10).setAppPaused(true, false);
        }
    }

    @Override
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 3 && iArr[0] != 0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.AppName);
            alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.PermissionNoAudioWithHint);
            alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new jl0(this, 8));
            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        MediaController.getInstance().setFeedbackView(this.f35880b, true);
        ChatActivityEnterView chatActivityEnterView = this.f35880b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setFieldFocused(true);
        }
        d();
        b();
        this.T.acquire(7000L);
    }

    public final void p() {
        ArrayList arrayList = this.f35879a0;
        if (arrayList.size() > 1) {
            if (this.S < arrayList.size() - 1) {
                this.S++;
            } else {
                this.S = 0;
            }
            this.Q = (MessageObject) arrayList.get(this.S);
            q(2);
            this.h.setText(String.format("%d/%d", Integer.valueOf(this.S + 1), Integer.valueOf(arrayList.size())));
        }
    }

    public final void q(int i10) {
        if (this.f35878a == null) {
            return;
        }
        int i11 = this.L;
        if (i11 != this.Q.currentAccount) {
            if (i11 >= 0) {
                ConnectionsManager.getInstance(i11).setAppPaused(true, false);
            }
            int i12 = this.Q.currentAccount;
            this.L = i12;
            ConnectionsManager.getInstance(i12).setAppPaused(false, false);
        }
        this.N = null;
        this.M = null;
        long dialogId = this.Q.getDialogId();
        this.f35880b.X0(this.Q.currentAccount, dialogId);
        if (DialogObject.isEncryptedDialog(dialogId)) {
            this.M = MessagesController.getInstance(this.Q.currentAccount).getUser(Long.valueOf(org.telegram.messenger.t.m(MessagesController.getInstance(this.Q.currentAccount), dialogId).user_id));
        } else if (DialogObject.isUserDialog(dialogId)) {
            this.M = MessagesController.getInstance(this.Q.currentAccount).getUser(Long.valueOf(dialogId));
        } else if (DialogObject.isChatDialog(dialogId)) {
            this.N = MessagesController.getInstance(this.Q.currentAccount).getChat(Long.valueOf(-dialogId));
            if (this.Q.isFromUser()) {
                this.M = MessagesController.getInstance(this.Q.currentAccount).getUser(Long.valueOf(this.Q.messageOwner.from_id.user_id));
            }
        }
        TLRPC.Chat chat = this.N;
        if (chat != null) {
            this.d.setText(chat.title);
            TLRPC.User user = this.M;
            if (user != null) {
                this.e.setText(UserObject.getUserName(user));
            } else {
                this.e.setText((CharSequence) null);
            }
            this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.d.setCompoundDrawablePadding(0);
        } else {
            TLRPC.User user2 = this.M;
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
        if (this.f35878a != null && (messageObject = this.Q) != null && this.N == null && (user = this.M) != null) {
            long j10 = user.f22177id;
            if (j10 / 1000 != 777 && j10 / 1000 != 333 && ContactsController.getInstance(messageObject.currentAccount).contactsDict.get(Long.valueOf(this.M.f22177id)) == null && (ContactsController.getInstance(this.Q.currentAccount).contactsDict.size() != 0 || !ContactsController.getInstance(this.Q.currentAccount).isLoadingContacts())) {
                String str = this.M.phone;
                if (str != null && str.length() != 0) {
                    TextView textView = this.d;
                    kf.b c10 = kf.b.c();
                    textView.setText(c10.b("+" + this.M.phone));
                } else {
                    this.d.setText(UserObject.getUserName(this.M));
                }
            } else {
                this.d.setText(UserObject.getUserName(this.M));
            }
            TLRPC.User user2 = this.M;
            if (user2 != null && user2.f22177id == 489000) {
                this.e.setText(LocaleController.getString(R.string.VerifyCodesNotifications));
            } else if (user2 != null && user2.f22177id == 777000) {
                this.e.setText(LocaleController.getString(R.string.ServiceNotifications));
            } else {
                CharSequence printingString = MessagesController.getInstance(this.Q.currentAccount).getPrintingString(this.Q.getDialogId(), 0L, false);
                if (printingString != null && printingString.length() != 0) {
                    this.P = printingString;
                    this.e.setText(printingString);
                    o(true);
                    return;
                }
                this.P = null;
                o(false);
                TLRPC.User user3 = MessagesController.getInstance(this.Q.currentAccount).getUser(Long.valueOf(this.M.f22177id));
                if (user3 != null) {
                    this.M = user3;
                }
                this.e.setText(LocaleController.formatUserStatus(this.Q.currentAccount, this.M));
            }
        }
    }
}
