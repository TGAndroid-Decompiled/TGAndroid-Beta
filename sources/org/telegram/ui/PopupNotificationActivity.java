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
    public static final int f33784b0 = 0;
    public ow0 E;
    public int K;
    public TLRPC.User M;
    public TLRPC.Chat N;
    public CharSequence P;
    public boolean Z;
    public org.telegram.ui.ActionBar.k f33785a;
    public ChatActivityEnterView f33787b;
    public org.telegram.ui.Components.x9 f33788c;
    public TextView d;
    public TextView f33789e;
    public FrameLayout f33790f;
    public TextView h;
    public j0 f33791n;
    public ViewGroup f33792r;
    public ViewGroup f33793s;
    public ViewGroup v;
    public LinearLayout f33794w;
    public LinearLayout f33795x;
    public LinearLayout f33796y;
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public VelocityTracker I = null;
    public final org.telegram.ui.Components.kw0[] J = new org.telegram.ui.Components.kw0[5];
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
    public final ArrayList f33786a0 = new ArrayList();

    public final void a(int i10) {
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
        ViewGroup viewGroup = this.f33793s;
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams.width != dp) {
                layoutParams.width = dp;
                this.f33793s.setLayoutParams(layoutParams);
            }
            this.f33793s.setTranslationX((-dp) + i10);
        }
        LinearLayout linearLayout = this.f33795x;
        if (linearLayout != null) {
            linearLayout.setTranslationX((-dp) + i10);
        }
        ViewGroup viewGroup2 = this.f33792r;
        if (viewGroup2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            if (layoutParams2.width != dp) {
                layoutParams2.width = dp;
                this.f33792r.setLayoutParams(layoutParams2);
            }
            this.f33792r.setTranslationX(i10);
        }
        LinearLayout linearLayout2 = this.f33794w;
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
        LinearLayout linearLayout3 = this.f33796y;
        if (linearLayout3 != null) {
            linearLayout3.setTranslationX(dp + i10);
        }
        this.f33791n.invalidate();
    }

    public final void b() {
        TLRPC.User user;
        MessageObject messageObject = this.Q;
        if (messageObject != null) {
            if (this.N != null) {
                TLRPC.Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(this.N.f19896id));
                if (chat != null) {
                    this.N = chat;
                    if (this.f33788c != null) {
                        this.f33788c.e(chat, new org.telegram.ui.Components.i9(this.N));
                    }
                }
            } else if (this.M != null && (user = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(this.M.f20043id))) != null) {
                this.M = user;
                if (this.f33788c != null) {
                    this.f33788c.e(user, new org.telegram.ui.Components.i9(0, this.M));
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
        FrameLayout frameLayout = this.f33790f;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new qw0(this, 0));
        }
        j0 j0Var = this.f33791n;
        if (j0Var != null) {
            j0Var.getViewTreeObserver().addOnPreDrawListener(new qw0(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        org.telegram.ui.Components.qg0 qg0Var;
        MessageObject messageObject;
        org.telegram.ui.Components.qg0 qg0Var2;
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
                ArrayList arrayList = this.f33786a0;
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
            j0 j0Var = this.f33791n;
            if (j0Var != null) {
                int childCount = j0Var.getChildCount();
                while (i12 < childCount) {
                    View childAt = this.f33791n.getChildAt(i12);
                    if (((Integer) childAt.getTag()).intValue() == 3 && (messageObject2 = (qg0Var2 = (org.telegram.ui.Components.qg0) childAt.findViewWithTag(300)).getMessageObject()) != null && messageObject2.currentAccount == i11 && messageObject2.getId() == num.intValue()) {
                        qg0Var2.r();
                        return;
                    }
                    i12++;
                }
            }
        } else if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
            Integer num2 = (Integer) objArr[0];
            j0 j0Var2 = this.f33791n;
            if (j0Var2 != null) {
                int childCount2 = j0Var2.getChildCount();
                while (i12 < childCount2) {
                    View childAt2 = this.f33791n.getChildAt(i12);
                    if (((Integer) childAt2.getTag()).intValue() == 3 && (messageObject = (qg0Var = (org.telegram.ui.Components.qg0) childAt2.findViewWithTag(300)).getMessageObject()) != null && messageObject.currentAccount == i11 && messageObject.getId() == num2.intValue()) {
                        qg0Var.s();
                        return;
                    }
                    i12++;
                }
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            j0 j0Var3 = this.f33791n;
            if (j0Var3 != null) {
                int childCount3 = j0Var3.getChildCount();
                while (i12 < childCount3) {
                    View childAt3 = this.f33791n.getChildAt(i12);
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
        LinearLayout linearLayout;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList;
        int i12;
        Object obj;
        int i13 = i10;
        ArrayList arrayList2 = this.f33786a0;
        Object obj2 = null;
        if (arrayList2.size() == 1 && (i13 < 0 || i13 >= arrayList2.size())) {
            return null;
        }
        boolean z11 = false;
        if (i13 == -1) {
            i13 = arrayList2.size() - 1;
        } else if (i13 == arrayList2.size()) {
            i13 = 0;
        }
        MessageObject messageObject = (MessageObject) arrayList2.get(i13);
        TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
        if (messageObject.getDialogId() == 777000 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size = arrayList3.size();
            i11 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i14);
                int size2 = keyboardInlineButtonRow.buttons.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (zf.c.c(keyboardInlineButtonRow.buttons.get(i15), TL_keyboard.TL_inlineButtonTypeCallback.class)) {
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
                int i18 = 0;
                ?? r62 = z11;
                while (i18 < size4) {
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow2.buttons.get(i18);
                    if (zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        if (linearLayout2 == null) {
                            linearLayout2 = new LinearLayout(this);
                            linearLayout2.setOrientation(r62);
                            arrayList = arrayList4;
                            linearLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, r62));
                            linearLayout2.setWeightSum(100.0f);
                            linearLayout2.setTag("b");
                            linearLayout2.setOnTouchListener(new ci.d(29));
                        } else {
                            arrayList = arrayList4;
                        }
                        TextView textView = new TextView(this);
                        textView.setTextSize(1, 16.0f);
                        i12 = size3;
                        obj = null;
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20873n6, false));
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setText(keyboardInlineButton.text.toUpperCase());
                        textView.setTag(keyboardInlineButton);
                        textView.setGravity(17);
                        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                        linearLayout2.addView(textView, w7.x5.l(100.0f / i11, -1, -1));
                        textView.setOnClickListener(new di.o4(messageObject, i16));
                    } else {
                        arrayList = arrayList4;
                        i12 = size3;
                        obj = obj2;
                    }
                    i18++;
                    obj2 = obj;
                    size3 = i12;
                    arrayList4 = arrayList;
                    r62 = 0;
                }
                i17++;
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
                int i19 = this.S;
                if (i13 == i19) {
                    linearLayout.setTranslationX(0.0f);
                } else if (i13 == i19 - 1) {
                    linearLayout.setTranslationX(-dp);
                } else if (i13 == i19 + 1) {
                    linearLayout.setTranslationX(dp);
                }
            }
            this.E.addView(linearLayout, layoutParams);
        }
        return linearLayout;
    }

    public final void f() {
        ArrayList arrayList = this.f33786a0;
        if (arrayList.isEmpty()) {
            i();
            finish();
            return;
        }
        if ((this.S != 0 || this.f33787b.k0() || this.X) && this.Q != null) {
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
        boolean z11;
        org.telegram.ui.Components.qg0 qg0Var;
        int i11 = i10;
        ArrayList arrayList = this.f33786a0;
        if (arrayList.size() == 1 && (i11 < 0 || i11 >= arrayList.size())) {
            return null;
        }
        if (i11 == -1) {
            i11 = arrayList.size() - 1;
        } else if (i11 == arrayList.size()) {
            i11 = 0;
        }
        MessageObject messageObject = (MessageObject) arrayList.get(i11);
        int i12 = messageObject.type;
        if ((i12 == 1 || i12 == 4) && !messageObject.isSecretMedia()) {
            ArrayList arrayList2 = this.G;
            if (arrayList2.size() > 0) {
                frameLayout = (ViewGroup) arrayList2.get(0);
                arrayList2.remove(0);
            } else {
                frameLayout = new FrameLayout(this);
                FrameLayout frameLayout2 = new FrameLayout(this);
                frameLayout2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                frameLayout2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                frameLayout.addView(frameLayout2, w7.x5.c(-1.0f, -1));
                org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(this);
                x9Var.setTag(311);
                frameLayout2.addView(x9Var, w7.x5.c(-1.0f, -1));
                TextView textView = new TextView(this);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                textView.setTextSize(1, 16.0f);
                textView.setGravity(17);
                textView.setTag(312);
                frameLayout2.addView(textView, w7.x5.e(-1, -2, 17));
                frameLayout.setTag(2);
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final PopupNotificationActivity f39075b;

                    {
                        this.f39075b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i13 = r2;
                        PopupNotificationActivity popupNotificationActivity = this.f39075b;
                        switch (i13) {
                            case 0:
                                int i14 = PopupNotificationActivity.f33784b0;
                                popupNotificationActivity.k();
                                return;
                            case 1:
                                int i15 = PopupNotificationActivity.f33784b0;
                                popupNotificationActivity.k();
                                return;
                            default:
                                int i16 = PopupNotificationActivity.f33784b0;
                                popupNotificationActivity.k();
                                return;
                        }
                    }
                });
            }
            TextView textView2 = (TextView) frameLayout.findViewWithTag(312);
            org.telegram.ui.Components.x9 x9Var2 = (org.telegram.ui.Components.x9) frameLayout.findViewWithTag(311);
            x9Var2.setAspectFit(true);
            int i13 = messageObject.type;
            if (i13 == 1) {
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
                                x9Var2.i(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), "100_100_b", null, null, messageObject);
                            }
                        } else {
                            x9Var2.j(ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "100_100", ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), "100_100_b", closestPhotoSizeWithSize.size, messageObject);
                        }
                        x9Var2.setVisibility(0);
                        textView2.setVisibility(8);
                    }
                }
                x9Var2.setVisibility(8);
                textView2.setVisibility(0);
                textView2.setTextSize(2, SharedConfig.fontSize);
                textView2.setText(messageObject.messageText);
            } else if (i13 == 4) {
                textView2.setVisibility(8);
                textView2.setText(messageObject.messageText);
                x9Var2.setVisibility(0);
                TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                if (MessagesController.getInstance(messageObject.currentAccount).mapProvider == 2) {
                    x9Var2.i(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, 100, 100, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), null, null, null, messageObject);
                } else {
                    x9Var2.f(AndroidUtilities.formapMapUrl(messageObject.currentAccount, d, d10, 100, 100, true, 15, -1), null, null);
                }
            }
        } else if (messageObject.type == 2) {
            ArrayList arrayList3 = this.H;
            if (arrayList3.size() > 0) {
                ViewGroup viewGroup = (ViewGroup) arrayList3.get(0);
                arrayList3.remove(0);
                qg0Var = (org.telegram.ui.Components.qg0) viewGroup.findViewWithTag(300);
                frameLayout = viewGroup;
            } else {
                ViewGroup frameLayout3 = new FrameLayout(this);
                FrameLayout frameLayout4 = new FrameLayout(this);
                frameLayout4.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                frameLayout4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                frameLayout3.addView(frameLayout4, w7.x5.c(-1.0f, -1));
                FrameLayout frameLayout5 = new FrameLayout(this);
                frameLayout4.addView(frameLayout5, w7.x5.d(-1, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
                ?? a0Var = new org.telegram.ui.Cells.a0(this);
                a0Var.f29748f = false;
                a0Var.f29754y = 0;
                a0Var.G = 0;
                a0Var.J = 0;
                TextPaint textPaint = new TextPaint(1);
                a0Var.f29750r = textPaint;
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                a0Var.K = DownloadController.getInstance(a0Var.f29749n).generateObserverTag();
                org.telegram.ui.Components.bo0 bo0Var = new org.telegram.ui.Components.bo0(a0Var);
                a0Var.f29751s = bo0Var;
                bo0Var.h = a0Var;
                ?? obj = new Object();
                obj.f32951c = 0.0f;
                obj.f32953f = AndroidUtilities.dp(2.0f);
                obj.f32949a = new Paint();
                obj.f32950b = new Paint();
                a0Var.v = obj;
                a0Var.setTag(300);
                frameLayout5.addView(a0Var);
                frameLayout3.setTag(3);
                frameLayout3.setOnClickListener(new View.OnClickListener(this) {
                    public final PopupNotificationActivity f39075b;

                    {
                        this.f39075b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i132 = r2;
                        PopupNotificationActivity popupNotificationActivity = this.f39075b;
                        switch (i132) {
                            case 0:
                                int i14 = PopupNotificationActivity.f33784b0;
                                popupNotificationActivity.k();
                                return;
                            case 1:
                                int i15 = PopupNotificationActivity.f33784b0;
                                popupNotificationActivity.k();
                                return;
                            default:
                                int i16 = PopupNotificationActivity.f33784b0;
                                popupNotificationActivity.k();
                                return;
                        }
                    }
                });
                frameLayout = frameLayout3;
                qg0Var = a0Var;
            }
            qg0Var.setMessageObject(messageObject);
            if (DownloadController.getInstance(messageObject.currentAccount).canDownloadMedia(messageObject) && qg0Var.f29754y == 2) {
                FileLoader.getInstance(qg0Var.f29749n).loadFile(qg0Var.h.getDocument(), qg0Var.h, 1, 0);
                qg0Var.f29754y = 3;
                qg0Var.invalidate();
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
                frameLayout.addView(scrollView, w7.x5.c(-1.0f, -1));
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(0);
                linearLayout.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                scrollView.addView(linearLayout, w7.x5.x(-1, -2, 1));
                linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                linearLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final PopupNotificationActivity f39075b;

                    {
                        this.f39075b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i132 = r2;
                        PopupNotificationActivity popupNotificationActivity = this.f39075b;
                        switch (i132) {
                            case 0:
                                int i14 = PopupNotificationActivity.f33784b0;
                                popupNotificationActivity.k();
                                return;
                            case 1:
                                int i15 = PopupNotificationActivity.f33784b0;
                                popupNotificationActivity.k();
                                return;
                            default:
                                int i16 = PopupNotificationActivity.f33784b0;
                                popupNotificationActivity.k();
                                return;
                        }
                    }
                });
                TextView textView3 = new TextView(this);
                textView3.setTextSize(1, 16.0f);
                textView3.setTag(301);
                int i14 = org.telegram.ui.ActionBar.j6.G6;
                textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                textView3.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                textView3.setGravity(17);
                linearLayout.addView(textView3, w7.x5.q(-1, -2, 17));
                frameLayout.setTag(1);
            }
            TextView textView4 = (TextView) frameLayout.findViewWithTag(301);
            textView4.setTextSize(2, SharedConfig.fontSize);
            textView4.setText(messageObject.messageText);
        }
        if (frameLayout.getParent() == null) {
            this.f33791n.addView(frameLayout);
        }
        frameLayout.setVisibility(0);
        if (z10) {
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.gravity = 51;
            layoutParams.height = -1;
            layoutParams.width = dp;
            int i15 = this.S;
            if (i11 == i15) {
                frameLayout.setTranslationX(0.0f);
            } else if (i11 == i15 - 1) {
                frameLayout.setTranslationX(-dp);
            } else if (i11 == i15 + 1) {
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
        this.f33786a0.clear();
        if (this.Z) {
            if (intent != null) {
                i10 = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
            } else {
                i10 = UserConfig.selectedAccount;
            }
            if (!UserConfig.isValidAccount(i10)) {
                return;
            }
            this.f33786a0.addAll(NotificationsController.getInstance(i10).popupReplyMessages);
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                if (UserConfig.getInstance(i11).isClientActivated()) {
                    this.f33786a0.addAll(NotificationsController.getInstance(i11).popupMessages);
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
                this.f33786a0.clear();
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
            ChatActivityEnterView chatActivityEnterView = this.f33787b;
            if (chatActivityEnterView != null) {
                chatActivityEnterView.B0();
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
            n(this.f33792r);
            n(this.f33793s);
            n(this.v);
            m(this.f33794w);
            m(this.f33795x);
            m(this.f33796y);
            int i11 = this.S - 1;
            while (true) {
                int i12 = this.S;
                if (i11 >= i12 + 2) {
                    break;
                }
                if (i11 == i12 - 1) {
                    this.f33793s = g(i11, true);
                    this.f33795x = e(i11, true);
                } else if (i11 == i12) {
                    this.f33792r = g(i11, true);
                    this.f33794w = e(i11, true);
                } else if (i11 == i12 + 1) {
                    this.v = g(i11, true);
                    this.f33796y = e(i11, true);
                }
                i11++;
            }
        } else if (i10 == 1) {
            n(this.v);
            m(this.f33796y);
            this.v = this.f33792r;
            this.f33792r = this.f33793s;
            this.f33793s = g(this.S - 1, true);
            this.f33796y = this.f33794w;
            this.f33794w = this.f33795x;
            this.f33795x = e(this.S - 1, true);
        } else if (i10 == 2) {
            n(this.f33793s);
            m(this.f33795x);
            this.f33793s = this.f33792r;
            this.f33792r = this.v;
            this.v = g(this.S + 1, true);
            this.f33795x = this.f33794w;
            this.f33794w = this.f33796y;
            this.f33796y = e(this.S + 1, true);
        } else if (i10 == 3) {
            ViewGroup viewGroup = this.v;
            if (viewGroup != null) {
                float translationX = viewGroup.getTranslationX();
                n(this.v);
                ViewGroup g10 = g(this.S + 1, false);
                this.v = g10;
                if (g10 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g10.getLayoutParams();
                    layoutParams.width = dp;
                    this.v.setLayoutParams(layoutParams);
                    this.v.setTranslationX(translationX);
                    this.v.invalidate();
                }
            }
            LinearLayout linearLayout = this.f33796y;
            if (linearLayout != null) {
                float translationX2 = linearLayout.getTranslationX();
                m(this.f33796y);
                LinearLayout e7 = e(this.S + 1, false);
                this.f33796y = e7;
                if (e7 != null) {
                    e7.setTranslationX(translationX2);
                }
            }
        } else if (i10 == 4) {
            ViewGroup viewGroup2 = this.f33793s;
            if (viewGroup2 != null) {
                float translationX3 = viewGroup2.getTranslationX();
                n(this.f33793s);
                ViewGroup g11 = g(0, false);
                this.f33793s = g11;
                if (g11 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g11.getLayoutParams();
                    layoutParams2.width = dp;
                    this.f33793s.setLayoutParams(layoutParams2);
                    this.f33793s.setTranslationX(translationX3);
                    this.f33793s.invalidate();
                }
            }
            LinearLayout linearLayout2 = this.f33795x;
            if (linearLayout2 != null) {
                float translationX4 = linearLayout2.getTranslationX();
                m(this.f33795x);
                LinearLayout e10 = e(0, false);
                this.f33795x = e10;
                if (e10 != null) {
                    e10.setTranslationX(translationX4);
                }
            }
        }
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = (this.S - 1) + i13;
            ArrayList arrayList = this.f33786a0;
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
        if (this.f33785a != null) {
            int i10 = 0;
            org.telegram.ui.Components.kw0[] kw0VarArr = this.J;
            if (z10) {
                try {
                    Integer printingStringType = MessagesController.getInstance(this.Q.currentAccount).getPrintingStringType(this.Q.getDialogId(), 0L);
                    this.f33789e.setCompoundDrawablesWithIntrinsicBounds(kw0VarArr[printingStringType.intValue()], (Drawable) null, (Drawable) null, (Drawable) null);
                    this.f33789e.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                    while (i10 < kw0VarArr.length) {
                        if (i10 == printingStringType.intValue()) {
                            kw0VarArr[i10].d();
                        } else {
                            kw0VarArr[i10].e();
                        }
                        i10++;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            }
            this.f33789e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f33789e.setCompoundDrawablePadding(0);
            while (i10 < kw0VarArr.length) {
                kw0VarArr[i10].e();
                i10++;
            }
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f33787b.t0()) {
            this.f33787b.m0(true);
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
        org.telegram.ui.ActionBar.j6.R(this);
        org.telegram.ui.ActionBar.j6.J(this, false);
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
        this.K = ConnectionsManager.generateClassGuid();
        this.J[0] = new org.telegram.ui.Components.f51(false);
        this.J[1] = new org.telegram.ui.Components.qp(false);
        this.J[2] = new org.telegram.ui.Components.yo0(false);
        this.J[3] = new org.telegram.ui.Components.gg0(null, false);
        this.J[4] = new org.telegram.ui.Components.vl0(false);
        w8 w8Var = new w8(this, this, 6);
        setContentView(w8Var);
        w8Var.setBackgroundColor(-1728053248);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        w8Var.addView(relativeLayout, w7.x5.c(-1.0f, -1));
        ow0 ow0Var = new ow0(this, this);
        this.E = ow0Var;
        ow0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
        float f7 = -1;
        relativeLayout.addView(this.E, w7.x5.v(12, f7, 12, 240, 13));
        ChatActivityEnterView chatActivityEnterView = this.f33787b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.B0();
        }
        ChatActivityEnterView chatActivityEnterView2 = new ChatActivityEnterView(this, w8Var, null, false, null);
        this.f33787b = chatActivityEnterView2;
        chatActivityEnterView2.setId(1000);
        this.E.addView(this.f33787b, w7.x5.v(0, f7, 0, -2, 12));
        this.f33787b.setDelegate(new pw0(this));
        j0 j0Var = new j0(this, this, 19);
        this.f33791n = j0Var;
        this.E.addView(j0Var, 0);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(this, null);
        this.f33785a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f33785a.setBackButtonImage(R.drawable.ic_close_white);
        this.f33785a.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20964s8, false));
        this.f33785a.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20983t8, false), false);
        this.E.addView(this.f33785a);
        ViewGroup.LayoutParams layoutParams = this.f33785a.getLayoutParams();
        layoutParams.width = -1;
        this.f33785a.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.v0 g10 = this.f33785a.n().g(2, 0, AndroidUtilities.dp(56.0f));
        TextView textView = new TextView(this);
        this.h = textView;
        int i11 = org.telegram.ui.ActionBar.j6.B8;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(17);
        g10.addView(this.h, w7.x5.c(-1.0f, 56));
        FrameLayout frameLayout = new FrameLayout(this);
        this.f33790f = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        this.f33785a.addView(this.f33790f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f33790f.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -2;
        layoutParams2.rightMargin = AndroidUtilities.dp(48.0f);
        layoutParams2.leftMargin = AndroidUtilities.dp(60.0f);
        layoutParams2.gravity = 51;
        this.f33790f.setLayoutParams(layoutParams2);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(this);
        this.f33788c = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f33790f.addView(this.f33788c);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f33788c.getLayoutParams();
        layoutParams3.width = AndroidUtilities.dp(42.0f);
        layoutParams3.height = AndroidUtilities.dp(42.0f);
        layoutParams3.topMargin = AndroidUtilities.dp(3.0f);
        this.f33788c.setLayoutParams(layoutParams3);
        TextView textView2 = new TextView(this);
        this.d = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A8, false));
        this.d.setTextSize(1, 18.0f);
        this.d.setLines(1);
        this.d.setMaxLines(1);
        this.d.setSingleLine(true);
        TextView textView3 = this.d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        this.d.setGravity(3);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f33790f.addView(this.d);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.leftMargin = AndroidUtilities.dp(54.0f);
        layoutParams4.bottomMargin = AndroidUtilities.dp(22.0f);
        layoutParams4.gravity = 80;
        this.d.setLayoutParams(layoutParams4);
        TextView textView4 = new TextView(this);
        this.f33789e = textView4;
        textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f33789e.setTextSize(1, 14.0f);
        this.f33789e.setLines(1);
        this.f33789e.setMaxLines(1);
        this.f33789e.setSingleLine(true);
        this.f33789e.setEllipsize(truncateAt);
        this.f33789e.setGravity(3);
        this.f33790f.addView(this.f33789e);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f33789e.getLayoutParams();
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        layoutParams5.leftMargin = AndroidUtilities.dp(54.0f);
        layoutParams5.bottomMargin = AndroidUtilities.dp(4.0f);
        layoutParams5.gravity = 80;
        this.f33789e.setLayoutParams(layoutParams5);
        this.f33785a.setActionBarMenuOnItemClick(new o70(this, 18));
        PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(268435462, "screen");
        this.T = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        h(getIntent());
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        i();
        MediaController.getInstance().setFeedbackView(this.f33787b, false);
        if (this.T.isHeld()) {
            this.T.release();
        }
        org.telegram.ui.Components.x9 x9Var = this.f33788c;
        if (x9Var != null) {
            x9Var.setImageDrawable(null);
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
        ChatActivityEnterView chatActivityEnterView = this.f33787b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.m0(false);
            this.f33787b.setFieldFocused(false);
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
            alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.AppName);
            alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.PermissionNoAudioWithHint);
            alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new vl0(this, 7));
            i2.g.B(R.string.OK, alertDialog$Builder, null);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        MediaController.getInstance().setFeedbackView(this.f33787b, true);
        ChatActivityEnterView chatActivityEnterView = this.f33787b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setFieldFocused(true);
        }
        d();
        b();
        this.T.acquire(7000L);
    }

    public final void p() {
        ArrayList arrayList = this.f33786a0;
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
        if (this.f33785a == null) {
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
        this.f33787b.b1(this.Q.currentAccount, dialogId);
        if (DialogObject.isEncryptedDialog(dialogId)) {
            this.M = MessagesController.getInstance(this.Q.currentAccount).getUser(Long.valueOf(org.telegram.messenger.w1.m(MessagesController.getInstance(this.Q.currentAccount), dialogId).user_id));
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
                this.f33789e.setText(UserObject.getUserName(user));
            } else {
                this.f33789e.setText((CharSequence) null);
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
        if (this.f33785a != null && (messageObject = this.Q) != null && this.N == null && (user = this.M) != null) {
            long j3 = user.f20043id;
            if (j3 / 1000 != 777 && j3 / 1000 != 333 && ContactsController.getInstance(messageObject.currentAccount).contactsDict.get(Long.valueOf(this.M.f20043id)) == null && (ContactsController.getInstance(this.Q.currentAccount).contactsDict.size() != 0 || !ContactsController.getInstance(this.Q.currentAccount).isLoadingContacts())) {
                String str = this.M.phone;
                if (str != null && str.length() != 0) {
                    TextView textView = this.d;
                    gf.b c10 = gf.b.c();
                    textView.setText(c10.b("+" + this.M.phone));
                } else {
                    this.d.setText(UserObject.getUserName(this.M));
                }
            } else {
                this.d.setText(UserObject.getUserName(this.M));
            }
            TLRPC.User user2 = this.M;
            if (user2 != null && user2.f20043id == 489000) {
                this.f33789e.setText(LocaleController.getString(R.string.VerifyCodesNotifications));
            } else if (user2 != null && user2.f20043id == 777000) {
                this.f33789e.setText(LocaleController.getString(R.string.ServiceNotifications));
            } else {
                CharSequence printingString = MessagesController.getInstance(this.Q.currentAccount).getPrintingString(this.Q.getDialogId(), 0L, false);
                if (printingString != null && printingString.length() != 0) {
                    this.P = printingString;
                    this.f33789e.setText(printingString);
                    o(true);
                    return;
                }
                this.P = null;
                o(false);
                TLRPC.User user3 = MessagesController.getInstance(this.Q.currentAccount).getUser(Long.valueOf(this.M.f20043id));
                if (user3 != null) {
                    this.M = user3;
                }
                this.f33789e.setText(LocaleController.formatUserStatus(this.Q.currentAccount, this.M));
            }
        }
    }
}
