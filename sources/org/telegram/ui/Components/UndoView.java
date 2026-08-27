package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.text.style.CharacterStyle;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nc1;

@Deprecated
public class UndoView extends FrameLayout {

    public static final int f26571a0 = 0;
    public final Paint A;
    public final RectF B;
    public long C;
    public int D;
    public String E;
    public int F;
    public int G;
    public ArrayList H;
    public Runnable I;
    public Runnable J;
    public long K;
    public float L;
    public boolean M;
    public final boolean N;
    public CharSequence O;
    public int P;
    public final ShapeDrawable Q;
    public final org.telegram.ui.ActionBar.c6 R;
    public int S;
    public StaticLayout T;
    public StaticLayout U;
    public float V;
    public float W;

    public int f26572a;

    public final org.telegram.ui.Cells.w1 f26573b;

    public final TextView f26574c;
    public final TextView d;

    public final ImageView f26575e;

    public final ri0 f26576f;
    public final n9 h;

    public final LinearLayout f26577n;

    public int f26578r;

    public final org.telegram.ui.ActionBar.n2 f26579s;
    public Object v;

    public Object f26580w;

    public final int f26581x;

    public final TextPaint f26582y;

    public UndoView(Context context) {
        this(context, null, false, null);
    }

    public boolean a() {
        return true;
    }

    public final int c(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.R);
    }

    public final boolean d() {
        int i10;
        Object obj;
        int i11 = this.G;
        if (i11 == 11 || i11 == 24 || i11 == 6 || i11 == 3 || i11 == 5 || i11 == 13 || i11 == 14 || i11 == 74) {
            return true;
        }
        if ((i11 == 7 && MessagesController.getInstance(this.f26581x).dialogFilters.isEmpty()) || (i10 = this.G) == 83 || i10 == 85) {
            return true;
        }
        return i10 == 88 && (obj = this.f26580w) != null && ((Integer) obj).intValue() > 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.L == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        float measuredHeight = (getMeasuredHeight() - this.W) + AndroidUtilities.dp(9.0f);
        if (measuredHeight > 0.0f) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            super.dispatchDraw(canvas);
        }
        canvas.restore();
    }

    public void e(int i10, boolean z10) {
        if (getVisibility() == 0 && this.M) {
            this.v = null;
            this.f26580w = null;
            this.M = false;
            Runnable runnable = this.I;
            if (runnable != null) {
                if (z10) {
                    runnable.run();
                }
                this.I = null;
            }
            Runnable runnable2 = this.J;
            if (runnable2 != null) {
                if (!z10) {
                    runnable2.run();
                }
                this.J = null;
            }
            int i11 = this.G;
            if (i11 == 0 || i11 == 1 || i11 == 95 || i11 == 26 || i11 == 27) {
                for (int i12 = 0; i12 < this.H.size(); i12++) {
                    long jLongValue = ((Long) this.H.get(i12)).longValue();
                    MessagesController messagesController = MessagesController.getInstance(this.f26581x);
                    int i13 = this.G;
                    messagesController.removeDialogAction(jLongValue, i13 == 0 || i13 == 26, z10);
                    h(this.G, jLongValue);
                }
            }
            int i14 = 4;
            boolean z11 = this.N;
            if (i10 == 0) {
                setEnterOffset((z11 ? -1.0f : 1.0f) * (this.S + this.f26578r));
                setVisibility(4);
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (i10 == 1) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z11 ? -1.0f : 1.0f) * (this.S + this.f26578r)));
                animatorSet.setDuration(250L);
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.ALPHA, 0.0f));
                animatorSet.setDuration(180L);
            }
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.addListener(new f11(this, i14));
            animatorSet.start();
        }
    }

    public final boolean f() {
        int i10 = this.G;
        return i10 == 12 || i10 == 15 || i10 == 24 || i10 == 74 || i10 == 83;
    }

    public final boolean g() {
        int i10 = this.G;
        return i10 == 6 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 8 || i10 == 87 || i10 == 9 || i10 == 10 || i10 == 13 || i10 == 14 || i10 == 19 || i10 == 20 || i10 == 21 || i10 == 22 || i10 == 23 || i10 == 30 || i10 == 31 || i10 == 32 || i10 == 102 || i10 == 33 || i10 == 34 || i10 == 35 || i10 == 36 || i10 == 74 || i10 == 37 || i10 == 38 || i10 == 39 || i10 == 40 || i10 == 42 || i10 == 43 || i10 == 77 || i10 == 44 || i10 == 78 || i10 == 79 || i10 == 100 || i10 == 101 || i10 == 83;
    }

    @Override
    public Drawable getBackground() {
        return this.Q;
    }

    public Object getCurrentInfoObject() {
        return this.v;
    }

    public float getEnterOffset() {
        return this.W;
    }

    public final void i() {
        org.telegram.ui.ActionBar.g6.w1(-115203550, this.Q);
        this.f26573b.setTextColor(-1);
        this.f26574c.setTextColor(-1);
        ri0 ri0Var = this.f26576f;
        ri0Var.h(-14540254, "info1");
        ri0Var.h(-14540254, "info2");
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.f26573b.invalidate();
        this.f26576f.invalidate();
    }

    public final void j(int i10, long j10, Runnable runnable) {
        k(j10, i10, null, null, runnable, null);
    }

    public void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        n(arrayList, i10, obj, obj2, runnable, runnable2);
    }

    public final void l(long j10, int i10, Runnable runnable, Runnable runnable2) {
        k(j10, i10, null, null, runnable, runnable2);
    }

    public final void m(long j10, Object obj, int i10) {
        k(j10, i10, obj, null, null, null);
    }

    public final void n(ArrayList arrayList, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        MovementMethod movementMethod;
        TextView textView;
        String str;
        boolean z10;
        ri0 ri0Var;
        long j10;
        int i11;
        int iDp;
        String str2;
        int measuredWidth;
        int i12;
        float f10;
        int iDp2;
        int i13;
        float f11;
        boolean z11;
        float f12;
        float f13;
        int measuredWidth2;
        int i14;
        CharSequence charSequenceReplaceTags;
        int i15;
        int i16;
        CharSequence string;
        int i17;
        int i18;
        SpannableStringBuilder spannableStringBuilder;
        int iIndexOf;
        int iLastIndexOf;
        CharSequence charSequenceReplaceTags2;
        String string2;
        int i19;
        String name;
        int i20;
        int i21;
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        int i22;
        int i23;
        if (AndroidUtilities.shouldShowClipboardToast() || !((i23 = this.G) == 52 || i23 == 56 || i23 == 57 || i23 == 58 || i23 == 59 || i23 == 60 || i23 == 80 || i23 == 33)) {
            Runnable runnable3 = this.I;
            if (runnable3 != null) {
                runnable3.run();
            }
            this.M = true;
            this.I = runnable;
            this.J = runnable2;
            this.H = arrayList;
            Long l10 = (Long) arrayList.get(0);
            long jLongValue = l10.longValue();
            this.G = i10;
            this.C = 5000L;
            this.v = obj;
            this.f26580w = obj2;
            this.K = SystemClock.elapsedRealtime();
            String string3 = LocaleController.getString(R.string.UndoNoCaps);
            TextView textView2 = this.d;
            textView2.setText(string3);
            ImageView imageView = this.f26575e;
            imageView.setVisibility(0);
            ri0 ri0Var2 = this.f26576f;
            ri0Var2.setPadding(0, 0, 0, 0);
            ri0Var2.setScaleX(1.0f);
            ri0Var2.setScaleY(1.0f);
            org.telegram.ui.Cells.w1 w1Var = this.f26573b;
            w1Var.setTextSize(1, 15.0f);
            n9 n9Var = this.h;
            n9Var.setVisibility(8);
            w1Var.setGravity(51);
            TextView textView3 = this.f26574c;
            ((FrameLayout.LayoutParams) textView3.getLayoutParams()).leftMargin = AndroidUtilities.dp(58.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w1Var.getLayoutParams();
            layoutParams.height = -2;
            layoutParams.topMargin = AndroidUtilities.dp(13.0f);
            layoutParams.bottomMargin = 0;
            ri0Var2.setScaleType(ImageView.ScaleType.CENTER);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ri0Var2.getLayoutParams();
            layoutParams2.gravity = 19;
            layoutParams2.bottomMargin = 0;
            layoutParams2.topMargin = 0;
            layoutParams2.leftMargin = AndroidUtilities.dp(3.0f);
            layoutParams2.width = AndroidUtilities.dp(54.0f);
            layoutParams2.height = -2;
            w1Var.setMinHeight(0);
            if ((runnable == null && runnable2 == null) || i10 == 83) {
                setOnClickListener(new v41(this, 1));
                movementMethod = null;
                setOnTouchListener(null);
            } else {
                setOnClickListener(null);
                setOnTouchListener(new kh.e(26));
                movementMethod = null;
            }
            w1Var.setMovementMethod(movementMethod);
            boolean zG = g();
            LinearLayout linearLayout = this.f26577n;
            int i24 = this.f26581x;
            int i25 = 36;
            if (!zG) {
                textView = w1Var;
                int i26 = this.G;
                if (i26 == 45 || i26 == 46 || i26 == 47 || i26 == 52 || i26 == 53 || i26 == 54 || i26 == 55 || i26 == 56 || i26 == 57 || i26 == 58 || i26 == 59 || i26 == 60 || i26 == 71 || i26 == 70 || i26 == 75 || i26 == 76 || i26 == 41 || i26 == 78 || i26 == 79 || i26 == 61 || i26 == 80) {
                    str = "";
                    imageView.setVisibility(8);
                    ri0Var2.setVisibility(0);
                    textView.setTypeface(Typeface.DEFAULT);
                    int i27 = this.G;
                    long j11 = -1;
                    if (i27 == 76) {
                        textView.setText(LocaleController.getString(R.string.BroadcastGroupConvertSuccess));
                        ri0Var2.e(R.raw.gigagroup_convert, 36, 36);
                        layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                        textView.setTextSize(1, 14.0f);
                    } else {
                        z10 = true;
                        if (i27 == 75) {
                            textView.setText(LocaleController.getString(R.string.GigagroupConvertCancelHint));
                            ri0Var2.e(R.raw.chats_infotip, 36, 36);
                            layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                            textView.setTextSize(1, 14.0f);
                            ri0Var = ri0Var2;
                            j10 = -1;
                            i11 = 8;
                        } else if (i10 == 70) {
                            int iIntValue = ((Integer) obj2).intValue();
                            textView3.setSingleLine(false);
                            textView.setText(LocaleController.formatString("AutoDeleteHintOnText", R.string.AutoDeleteHintOnText, LocaleController.formatTTLString(iIntValue)));
                            ri0Var2.e(R.raw.fire_on, 36, 36);
                            layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                            this.C = 4000L;
                            ri0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                        } else {
                            if (i27 == 71) {
                                textView.setText(LocaleController.getString(R.string.AutoDeleteHintOffText));
                                ri0Var2.e(R.raw.fire_off, 36, 36);
                                textView.setTextSize(1, 14.0f);
                                this.C = 3000L;
                                ri0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                            } else if (i27 == 45) {
                                textView.setText(LocaleController.getString(R.string.ImportMutualError));
                                ri0Var2.e(R.raw.error, 36, 36);
                                layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                                textView.setTextSize(1, 14.0f);
                            } else if (i27 == 46) {
                                textView.setText(LocaleController.getString(R.string.ImportNotAdmin));
                                ri0Var2.e(R.raw.error, 36, 36);
                                layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                                textView.setTextSize(1, 14.0f);
                            } else if (i27 == 47) {
                                textView.setText(LocaleController.getString(R.string.ImportedInfo));
                                ri0Var2.e(R.raw.imported, 36, 36);
                                ri0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(5.0f));
                                layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                                textView.setTextSize(1, 14.0f);
                            } else {
                                if (i27 == 52 || i27 == 56 || i27 == 57 || i27 == 58 || i27 == 59 || i27 == 60 || i27 == 80) {
                                    ri0Var = ri0Var2;
                                    if (!AndroidUtilities.shouldShowClipboardToast()) {
                                        return;
                                    }
                                    int i28 = R.raw.copy;
                                    int i29 = this.G;
                                    if (i29 == 80) {
                                        textView.setText(LocaleController.getString(R.string.EmailCopied));
                                    } else if (i29 == 60) {
                                        textView.setText(LocaleController.getString(R.string.PhoneCopied));
                                    } else if (i29 == 56) {
                                        textView.setText(LocaleController.getString(R.string.UsernameCopied));
                                    } else if (i29 == 57) {
                                        textView.setText(LocaleController.getString(R.string.HashtagCopied));
                                    } else if (i29 == 52) {
                                        textView.setText(LocaleController.getString(R.string.MessageCopied));
                                    } else if (i29 == 59) {
                                        i28 = R.raw.voip_invite;
                                        textView.setText(LocaleController.getString(R.string.LinkCopied));
                                    } else {
                                        textView.setText(LocaleController.getString(R.string.TextCopied));
                                    }
                                    ri0Var.e(i28, 30, 30);
                                    this.C = 3000L;
                                    textView.setTextSize(1, 15.0f);
                                } else if (i27 == 54) {
                                    textView.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOn));
                                    ri0Var2.e(R.raw.silent_unmute, 30, 30);
                                    this.C = 3000L;
                                    textView.setTextSize(1, 15.0f);
                                } else if (i27 == 55) {
                                    textView.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOff));
                                    ri0Var2.e(R.raw.silent_mute, 30, 30);
                                    this.C = 3000L;
                                    textView.setTextSize(1, 15.0f);
                                } else if (i27 == 41) {
                                    if (obj2 != null) {
                                        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                                    } else if (jLongValue == UserConfig.getInstance(i24).clientUserId) {
                                        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages)));
                                    } else if (DialogObject.isChatDialog(jLongValue)) {
                                        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(i24).getChat(Long.valueOf(-jLongValue)).title)));
                                    } else {
                                        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(i24).getUser(l10)))));
                                    }
                                    ri0Var2.e(R.raw.contact_check, 36, 36);
                                    this.C = 3000L;
                                } else if (i27 == 53) {
                                    Integer num = (Integer) obj;
                                    if (obj2 == null || (obj2 instanceof TLRPC.TL_forumTopic)) {
                                        ri0Var = ri0Var2;
                                        if (jLongValue == UserConfig.getInstance(i24).clientUserId) {
                                            if (num.intValue() == 1) {
                                                textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), new gc(16)));
                                            } else {
                                                textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), new gc(16)));
                                            }
                                            ri0Var.e(R.raw.saved_messages, 30, 30);
                                        } else {
                                            if (DialogObject.isChatDialog(jLongValue)) {
                                                TLRPC.Chat chat = MessagesController.getInstance(i24).getChat(Long.valueOf(-jLongValue));
                                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                                String strI = ChatObject.isMonoForum(chat) ? wf.c.i(chat, i24, false) : null;
                                                if (num.intValue() == 1) {
                                                    int i30 = R.string.FwdMessageToGroup;
                                                    if (strI == null) {
                                                        strI = tL_forumTopic != null ? tL_forumTopic.title : chat.title;
                                                    }
                                                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToGroup", i30, strI)));
                                                } else {
                                                    int i31 = R.string.FwdMessagesToGroup;
                                                    if (strI == null) {
                                                        strI = tL_forumTopic != null ? tL_forumTopic.title : chat.title;
                                                    }
                                                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToGroup", i31, strI)));
                                                }
                                            } else {
                                                TLRPC.User user = MessagesController.getInstance(i24).getUser(l10);
                                                if (num.intValue() == 1) {
                                                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToUser", R.string.FwdMessageToUser, UserObject.getFirstName(user))));
                                                } else {
                                                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToUser", R.string.FwdMessagesToUser, UserObject.getFirstName(user))));
                                                }
                                            }
                                            ri0Var.e(R.raw.forward, 30, 30);
                                            j11 = 300;
                                        }
                                    } else {
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        if (num.intValue() == 1) {
                                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", iIntValue2, new Object[0])));
                                        } else {
                                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", iIntValue2, new Object[0])));
                                        }
                                        ri0Var2.e(R.raw.forward, 30, 30);
                                        j11 = 300;
                                        ri0Var = ri0Var2;
                                    }
                                    this.C = 3000L;
                                } else {
                                    ri0Var = ri0Var2;
                                    if (i27 == 61) {
                                        if (obj2 != null) {
                                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToChats", R.string.BackgroundToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                                            ri0Var.e(R.raw.forward, 30, 30);
                                        } else if (jLongValue == UserConfig.getInstance(i24).clientUserId) {
                                            textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BackgroundToSavedMessages)));
                                            ri0Var.e(R.raw.saved_messages, 30, 30);
                                        } else {
                                            if (DialogObject.isChatDialog(jLongValue)) {
                                                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToGroup", R.string.BackgroundToGroup, MessagesController.getInstance(i24).getChat(Long.valueOf(-jLongValue)).title)));
                                            } else {
                                                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToUser", R.string.BackgroundToUser, UserObject.getFirstName(MessagesController.getInstance(i24).getUser(l10)))));
                                            }
                                            ri0Var.e(R.raw.forward, 30, 30);
                                        }
                                        this.C = 3000L;
                                    }
                                }
                                j10 = j11;
                                i11 = 8;
                                z10 = false;
                            }
                            ri0Var = ri0Var2;
                            j10 = j11;
                            i11 = 8;
                            z10 = false;
                        }
                        textView3.setVisibility(i11);
                        textView2.setTextColor(c(org.telegram.ui.ActionBar.g6.Gi));
                        linearLayout.setVisibility(i11);
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                        ri0Var.setProgress(0.0f);
                        ri0Var.d();
                        if (j10 > 0) {
                            ri0Var.postDelayed(new up0(this, 27), j10);
                        }
                    }
                    ri0Var = ri0Var2;
                    j10 = -1;
                    i11 = 8;
                    z10 = true;
                    textView3.setVisibility(i11);
                    textView2.setTextColor(c(org.telegram.ui.ActionBar.g6.Gi));
                    linearLayout.setVisibility(i11);
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    ri0Var.setProgress(0.0f);
                    ri0Var.d();
                    if (j10 > 0) {
                        ri0Var.postDelayed(new up0(this, 27), j10);
                    }
                } else {
                    if (i26 == 24 || i26 == 25) {
                        str = "";
                        int iIntValue3 = ((Integer) obj).intValue();
                        TLRPC.User user2 = (TLRPC.User) obj2;
                        imageView.setVisibility(8);
                        ri0Var2.setVisibility(0);
                        if (iIntValue3 != 0) {
                            textView.setTypeface(AndroidUtilities.bold());
                            textView.setTextSize(1, 14.0f);
                            ri0Var2.f32187a.clear();
                            int i32 = org.telegram.ui.ActionBar.g6.Hi;
                            ri0Var2.h(c(i32), "BODY");
                            ri0Var2.h(c(i32), "Wibe Big");
                            ri0Var2.h(c(i32), "Wibe Big 3");
                            ri0Var2.h(c(i32), "Wibe Small");
                            textView.setText(LocaleController.getString(R.string.ProximityAlertSet));
                            ri0Var2.e(R.raw.ic_unmute, 28, 28);
                            textView3.setVisibility(0);
                            textView3.setSingleLine(false);
                            textView3.setMaxLines(3);
                            if (user2 != null) {
                                textView3.setText(LocaleController.formatString("ProximityAlertSetInfoUser", R.string.ProximityAlertSetInfoUser, UserObject.getFirstName(user2), LocaleController.formatDistance(iIntValue3, 2)));
                            } else {
                                textView3.setText(LocaleController.formatString("ProximityAlertSetInfoGroup2", R.string.ProximityAlertSetInfoGroup2, LocaleController.formatDistance(iIntValue3, 2)));
                            }
                            linearLayout.setVisibility(8);
                            layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                        } else {
                            textView.setTypeface(Typeface.DEFAULT);
                            textView.setTextSize(1, 15.0f);
                            ri0Var2.f32187a.clear();
                            int i33 = org.telegram.ui.ActionBar.g6.Hi;
                            ri0Var2.h(c(i33), "Body Main");
                            ri0Var2.h(c(i33), "Body Top");
                            ri0Var2.h(c(i33), "Line");
                            ri0Var2.h(c(i33), "Curve Big");
                            ri0Var2.h(c(i33), "Curve Small");
                            layoutParams.topMargin = AndroidUtilities.dp(14.0f);
                            textView.setText(LocaleController.getString(R.string.ProximityAlertCancelled));
                            ri0Var2.e(R.raw.ic_mute, 28, 28);
                            textView3.setVisibility(8);
                            textView2.setTextColor(c(org.telegram.ui.ActionBar.g6.Gi));
                            linearLayout.setVisibility(0);
                        }
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        ri0Var2.setProgress(0.0f);
                        ri0Var2.d();
                    } else if (i26 == 11) {
                        textView.setText(LocaleController.getString(R.string.AuthAnotherClientOk));
                        ri0Var2.e(R.raw.contact_check, 36, 36);
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                        textView3.setText(((TLRPC.TL_authorization) obj).app_name);
                        textView3.setVisibility(0);
                        textView.setTextSize(1, 14.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView2.setTextColor(c(org.telegram.ui.ActionBar.g6.f23269p7));
                        imageView.setVisibility(8);
                        linearLayout.setVisibility(0);
                        ri0Var2.setVisibility(0);
                        ri0Var2.setProgress(0.0f);
                        ri0Var2.d();
                    } else if (i26 == 15) {
                        this.C = 10000L;
                        textView2.setText(LocaleController.getString(R.string.Open));
                        textView.setText(LocaleController.getString(R.string.FilterAvailableTitle));
                        ri0Var2.e(R.raw.filter_new, 36, 36);
                        int iDp3 = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.rightMargin = iDp3;
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                        ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = iDp3;
                        String string4 = LocaleController.getString(R.string.FilterAvailableText);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string4);
                        int iIndexOf2 = string4.indexOf(42);
                        int iLastIndexOf2 = string4.lastIndexOf(42);
                        if (iIndexOf2 >= 0 && iLastIndexOf2 >= 0 && iIndexOf2 != iLastIndexOf2) {
                            spannableStringBuilder2.replace(iLastIndexOf2, iLastIndexOf2 + 1, (CharSequence) "");
                            spannableStringBuilder2.replace(iIndexOf2, iIndexOf2 + 1, (CharSequence) "");
                            spannableStringBuilder2.setSpan(new r41("tg://settings/folders"), iIndexOf2, iLastIndexOf2 - 1, 33);
                        }
                        textView3.setText(spannableStringBuilder2);
                        textView3.setVisibility(0);
                        textView3.setSingleLine(false);
                        textView3.setMaxLines(2);
                        linearLayout.setVisibility(0);
                        imageView.setVisibility(8);
                        ri0Var2.setVisibility(0);
                        ri0Var2.setProgress(0.0f);
                        ri0Var2.d();
                    } else if (i26 == 16 || i26 == 17) {
                        str = "";
                        this.C = 4000L;
                        textView.setTextSize(1, 14.0f);
                        textView.setGravity(16);
                        textView.setMinHeight(AndroidUtilities.dp(30.0f));
                        String str3 = (String) obj;
                        if ("🎲".equals(str3)) {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DiceInfo2)));
                            ri0Var2.setImageResource(R.drawable.dice);
                        } else {
                            if ("🎯".equals(str3)) {
                                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DartInfo)));
                            } else {
                                String serverString = LocaleController.getServerString("DiceEmojiInfo_" + str3);
                                if (TextUtils.isEmpty(serverString)) {
                                    textView.setText(Emoji.replaceEmoji(LocaleController.formatString("DiceEmojiInfo", R.string.DiceEmojiInfo, str3), textView.getPaint().getFontMetricsInt(), false));
                                } else {
                                    textView.setText(Emoji.replaceEmoji(serverString, textView.getPaint().getFontMetricsInt(), false));
                                }
                            }
                            ri0Var2.setImageDrawable(Emoji.getEmojiDrawable(str3));
                            ri0Var2.setScaleType(ImageView.ScaleType.FIT_XY);
                            layoutParams.topMargin = AndroidUtilities.dp(14.0f);
                            layoutParams.bottomMargin = AndroidUtilities.dp(14.0f);
                            layoutParams2.leftMargin = AndroidUtilities.dp(14.0f);
                            layoutParams2.width = AndroidUtilities.dp(26.0f);
                            layoutParams2.height = AndroidUtilities.dp(26.0f);
                        }
                        textView2.setText(LocaleController.getString(R.string.SendDice));
                        if (this.G == 16) {
                            iDp = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                            textView2.setVisibility(0);
                            textView2.setTextColor(c(org.telegram.ui.ActionBar.g6.Gi));
                            imageView.setVisibility(8);
                            linearLayout.setVisibility(0);
                        } else {
                            iDp = AndroidUtilities.dp(8.0f);
                            textView2.setVisibility(8);
                            linearLayout.setVisibility(8);
                        }
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.rightMargin = iDp;
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                        layoutParams.bottomMargin = AndroidUtilities.dp(7.0f);
                        layoutParams.height = -1;
                        textView3.setVisibility(8);
                        ri0Var2.setVisibility(0);
                    } else if (i26 == 18) {
                        CharSequence charSequence = (CharSequence) obj;
                        this.C = Math.max(4000, Math.min((charSequence.length() / 50) * 1600, 10000));
                        textView.setTextSize(1, 14.0f);
                        textView.setGravity(16);
                        textView.setText(charSequence);
                        textView2.setVisibility(8);
                        linearLayout.setVisibility(8);
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                        layoutParams.bottomMargin = AndroidUtilities.dp(7.0f);
                        layoutParams.height = -1;
                        layoutParams2.gravity = 51;
                        int iDp4 = AndroidUtilities.dp(8.0f);
                        layoutParams2.bottomMargin = iDp4;
                        layoutParams2.topMargin = iDp4;
                        ri0Var2.setVisibility(0);
                        ri0Var2.e(R.raw.chats_infotip, 36, 36);
                        ri0Var2.setProgress(0.0f);
                        ri0Var2.d();
                        textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    } else if (i26 == 12) {
                        textView.setText(LocaleController.getString(R.string.ColorThemeChanged));
                        ri0Var2.setImageResource(R.drawable.toast_pallete);
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.rightMargin = AndroidUtilities.dp(48.0f);
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                        ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = AndroidUtilities.dp(48.0f);
                        String string5 = LocaleController.getString(R.string.ColorThemeChangedInfo);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string5);
                        int iIndexOf3 = string5.indexOf(42);
                        int iLastIndexOf3 = string5.lastIndexOf(42);
                        if (iIndexOf3 >= 0 && iLastIndexOf3 >= 0 && iIndexOf3 != iLastIndexOf3) {
                            spannableStringBuilder3.replace(iLastIndexOf3, iLastIndexOf3 + 1, (CharSequence) "");
                            spannableStringBuilder3.replace(iIndexOf3, iIndexOf3 + 1, (CharSequence) "");
                            spannableStringBuilder3.setSpan(new r41("tg://settings/themes"), iIndexOf3, iLastIndexOf3 - 1, 33);
                        }
                        textView3.setText(spannableStringBuilder3);
                        textView3.setVisibility(0);
                        textView3.setSingleLine(false);
                        textView3.setMaxLines(2);
                        textView2.setVisibility(8);
                        linearLayout.setVisibility(0);
                        ri0Var2.setVisibility(0);
                    } else {
                        str = "";
                        if (i26 == 84) {
                            textView.setVisibility(0);
                            textView.setTextSize(1, 15.0f);
                            textView.setTypeface(Typeface.DEFAULT);
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumTranscriptionHint)));
                            ri0Var2.setVisibility(0);
                            ri0Var2.e(R.raw.voice_to_text, 36, 36);
                            ri0Var2.setProgress(0.0f);
                            ri0Var2.d();
                            layoutParams.leftMargin = org.telegram.ui.Cells.pa.c(58.0f, R.string.PremiumMore, textView2);
                            layoutParams.rightMargin = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                            int iDp5 = AndroidUtilities.dp(6.0f);
                            layoutParams.bottomMargin = iDp5;
                            layoutParams.topMargin = iDp5;
                            layoutParams.height = -2;
                            n9Var.setVisibility(8);
                            textView3.setVisibility(8);
                            textView2.setVisibility(0);
                            linearLayout.setVisibility(0);
                            imageView.setVisibility(8);
                        } else if (i26 == 85) {
                            textView.setVisibility(0);
                            textView.setTextSize(1, 15.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            textView.setText(LocaleController.getString(R.string.SwipeToReplyHint));
                            ri0Var2.setVisibility(0);
                            ri0Var2.e(R.raw.hint_swipe_reply, 64, 64);
                            ri0Var2.setProgress(0.0f);
                            ri0Var2.d();
                            textView3.setVisibility(0);
                            layoutParams.leftMargin = org.telegram.ui.Cells.pa.c(58.0f, R.string.SwipeToReplyHintMessage, textView3);
                            layoutParams.rightMargin = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                            layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                            layoutParams.height = -2;
                            n9Var.setVisibility(8);
                            linearLayout.setVisibility(8);
                        } else if (i26 == 90 || i26 == 91 || i26 == 92 || i26 == 93 || i26 == 94) {
                            switch (i26) {
                                case 90:
                                    textView.setText(LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) cg.q0.f(), new Object[0]));
                                    break;
                                case 91:
                                    textView.setText(LocaleController.getString(R.string.BoostingSelectUpToWarningUsers));
                                    break;
                                case 92:
                                    textView.setText(LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]));
                                    break;
                                case 93:
                                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0])));
                                    break;
                                case 94:
                                    textView.setText(LocaleController.getString(R.string.BoostingOnlyRecipientCode));
                                    break;
                            }
                            layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                            layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                            textView.setTextSize(1, 15.0f);
                            linearLayout.setVisibility(8);
                            textView.setTypeface(Typeface.DEFAULT);
                            textView3.setVisibility(8);
                            ri0Var2.setVisibility(0);
                            ri0Var2.e(R.raw.chats_infotip, 36, 36);
                            ri0Var2.setProgress(0.0f);
                            ri0Var2.d();
                        } else if (i26 == 2 || i26 == 4) {
                            if (i10 == 2) {
                                textView.setText(LocaleController.getString(R.string.ChatArchived));
                            } else {
                                textView.setText(LocaleController.getString(R.string.ChatsArchived));
                            }
                            layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                            layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                            layoutParams.rightMargin = 0;
                            textView.setTextSize(1, 15.0f);
                            linearLayout.setVisibility(0);
                            textView.setTypeface(Typeface.DEFAULT);
                            textView3.setVisibility(8);
                            ri0Var2.setVisibility(0);
                            ri0Var2.e(R.raw.chats_archived, 36, 36);
                            ri0Var2.setProgress(0.0f);
                            ri0Var2.d();
                        } else if (i10 == 82) {
                            layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            textView.setText(LocaleController.getString(photoEntry.isVideo ? R.string.AttachMediaVideoDeselected : R.string.AttachMediaPhotoDeselected));
                            linearLayout.setVisibility(0);
                            textView.setTextSize(1, 15.0f);
                            textView.setTypeface(Typeface.DEFAULT);
                            textView3.setVisibility(8);
                            n9Var.setVisibility(0);
                            n9Var.setRoundRadius(AndroidUtilities.dp(2.0f));
                            String str4 = photoEntry.thumbPath;
                            if (str4 != null) {
                                n9Var.f(str4, null, org.telegram.ui.ActionBar.g6.R4);
                            } else if (photoEntry.path != null) {
                                n9Var.p(photoEntry.orientation, photoEntry.invert, true);
                                if (photoEntry.isVideo) {
                                    n9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
                                } else {
                                    n9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
                                }
                            } else {
                                n9Var.setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
                            }
                        } else {
                            layoutParams.leftMargin = AndroidUtilities.dp(45.0f);
                            layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                            layoutParams.rightMargin = 0;
                            textView.setTextSize(1, 15.0f);
                            linearLayout.setVisibility(0);
                            Typeface typeface = Typeface.DEFAULT;
                            textView.setTypeface(typeface);
                            textView3.setVisibility(8);
                            ri0Var2.setVisibility(8);
                            int i34 = this.G;
                            if (i34 == 88) {
                                String str5 = (String) obj;
                                int iIntValue4 = ((Integer) obj2).intValue();
                                if (iIntValue4 > 0) {
                                    int iDp6 = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                                    layoutParams.leftMargin = AndroidUtilities.dp(48.0f);
                                    layoutParams.rightMargin = iDp6;
                                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView3.getLayoutParams();
                                    layoutParams3.leftMargin = AndroidUtilities.dp(48.0f);
                                    layoutParams3.rightMargin = iDp6;
                                    textView.setText(LocaleController.formatString("FolderLinkDeletedTitle", R.string.FolderLinkDeletedTitle, str5));
                                    textView.setTypeface(AndroidUtilities.bold());
                                    textView3.setVisibility(0);
                                    textView3.setText(LocaleController.formatPluralString("FolderLinkDeletedSubtitle", iIntValue4, new Object[0]));
                                } else {
                                    textView.setTypeface(typeface);
                                    int i35 = R.string.FolderLinkDeleted;
                                    if (str5 == null) {
                                        str5 = str;
                                    }
                                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FolderLinkDeleted", i35, str5.replace('*', (char) 10033))));
                                }
                            } else if (i34 == 81 || i34 == 0 || i34 == 26) {
                                textView.setText(LocaleController.getString(R.string.HistoryClearedUndo));
                            } else if (i34 == 27) {
                                textView.setText(LocaleController.getString(R.string.ChatsDeletedUndo));
                            } else if (i34 == 95) {
                                if (DialogObject.isChatDialog(jLongValue)) {
                                    TLRPC.Chat chat2 = MessagesController.getInstance(i24).getChat(Long.valueOf(-jLongValue));
                                    if (ChatObject.isMonoForum(chat2)) {
                                        textView.setText(LocaleController.getString(R.string.MonoforumDeletedUndo));
                                    } else if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                                        textView.setText(LocaleController.getString(R.string.GroupLeftUndo));
                                    } else {
                                        textView.setText(LocaleController.getString(R.string.ChannelLeftUndo));
                                    }
                                } else {
                                    textView.setText(LocaleController.getString(R.string.ChatDeletedUndo));
                                }
                            } else if (DialogObject.isChatDialog(jLongValue)) {
                                TLRPC.Chat chat3 = MessagesController.getInstance(i24).getChat(Long.valueOf(-jLongValue));
                                if (ChatObject.isMonoForum(chat3)) {
                                    textView.setText(LocaleController.getString(R.string.MonoforumDeletedUndo));
                                } else if (!ChatObject.isChannel(chat3) || chat3.megagroup) {
                                    textView.setText(LocaleController.getString(R.string.GroupDeletedUndo));
                                } else {
                                    textView.setText(LocaleController.getString(R.string.ChannelDeletedUndo));
                                }
                            } else {
                                textView.setText(LocaleController.getString(R.string.ChatDeletedUndo));
                            }
                            if (this.G != 81) {
                                for (int i36 = 0; i36 < arrayList.size(); i36++) {
                                    MessagesController messagesController = MessagesController.getInstance(i24);
                                    long jLongValue2 = ((Long) arrayList.get(i36)).longValue();
                                    int i37 = this.G;
                                    messagesController.addDialogAction(jLongValue2, i37 == 0 || i37 == 26);
                                }
                            }
                        }
                    }
                    z10 = false;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) textView.getText());
                if (textView3.getVisibility() == 0) {
                    str2 = ". " + ((Object) textView3.getText());
                } else {
                    str2 = str;
                }
                sb2.append(str2);
                AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
                if (f()) {
                    measuredWidth2 = ((ViewGroup) getParent()).getMeasuredWidth();
                    if (measuredWidth2 == 0) {
                        measuredWidth2 = AndroidUtilities.displaySize.x;
                    }
                    measureChildWithMargins(textView3, org.telegram.messenger.rl.d(16.0f, measuredWidth2, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                    this.f26578r = AndroidUtilities.dp(37.0f) + textView3.getMeasuredHeight();
                } else if (d()) {
                    this.f26578r = AndroidUtilities.dp(52.0f);
                } else if (getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    measuredWidth = (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
                    if (measuredWidth <= 0) {
                        measuredWidth = AndroidUtilities.displaySize.x;
                    }
                    View view = textView;
                    measureChildWithMargins(view, org.telegram.messenger.rl.d(16.0f, measuredWidth, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                    int measuredHeight = view.getMeasuredHeight();
                    i12 = this.G;
                    if (i12 != 16 || i12 == 17 || i12 == 18 || i12 == 84 || i12 == 86) {
                        f10 = 14.0f;
                    } else {
                        f10 = 28.0f;
                    }
                    iDp2 = AndroidUtilities.dp(f10) + measuredHeight;
                    this.f26578r = iDp2;
                    i13 = this.G;
                    if (i13 == 18) {
                        this.f26578r = Math.max(iDp2, AndroidUtilities.dp(52.0f));
                    } else if (i13 == 25) {
                        this.f26578r = Math.max(iDp2, AndroidUtilities.dp(50.0f));
                    } else if (z10) {
                        this.f26578r = iDp2 - AndroidUtilities.dp(8.0f);
                    }
                }
                if (getVisibility() != 0) {
                    setVisibility(0);
                    if (this.N) {
                        f11 = -1.0f;
                    } else {
                        f11 = 1.0f;
                    }
                    setEnterOffset(f11 * (this.S + this.f26578r));
                    AnimatorSet animatorSet = new AnimatorSet();
                    z11 = this.N;
                    if (z11) {
                        f12 = -1.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    float f14 = f12 * (this.S + this.f26578r);
                    if (z11) {
                        f13 = 1.0f;
                    } else {
                        f13 = -1.0f;
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", f14, f13));
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                    animatorSet.setDuration(180L);
                    animatorSet.start();
                }
            }
            if (i10 == 83) {
                textView3.setSingleLine(false);
                charSequenceReplaceTags = LocaleController.getString(R.string.SoundAdded);
                string = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SoundAddedSubtitle), runnable);
                this.I = null;
                i16 = R.raw.sound_download;
                this.C = 4000L;
            } else {
                if (i10 == 74) {
                    textView3.setSingleLine(false);
                    charSequenceReplaceTags = LocaleController.getString(R.string.ReportChatSent);
                    string = LocaleController.formatString("ReportSentInfo", R.string.ReportSentInfo, new Object[0]);
                    i16 = R.raw.ic_admin;
                    this.C = 4000L;
                } else {
                    if (i10 == 34) {
                        TLRPC.User user3 = (TLRPC.User) obj;
                        if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj2)) {
                            i21 = 0;
                            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelInvitedUser", R.string.VoipChannelInvitedUser, UserObject.getFirstName(user3)));
                        } else {
                            i21 = 0;
                            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupInvitedUser", R.string.VoipGroupInvitedUser, UserObject.getFirstName(user3)));
                        }
                        y8 y8Var = new y8();
                        y8Var.u(AndroidUtilities.dp(12.0f));
                        y8Var.m(i24, user3);
                        n9Var.e(user3, y8Var);
                        n9Var.setVisibility(i21);
                        this.C = 3000L;
                        charSequenceReplaceTags = spannableStringBuilderReplaceTags;
                    } else if (i10 == 44) {
                        TLRPC.Chat chat4 = (TLRPC.Chat) obj2;
                        if (obj instanceof TLRPC.User) {
                            TLRPC.User user4 = (TLRPC.User) obj;
                            charSequenceReplaceTags = ChatObject.isChannelOrGiga(chat4) ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChannelUserJoined, UserObject.getFirstName(user4))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChatUserJoined, UserObject.getFirstName(user4)));
                        } else if (obj instanceof TLRPC.Chat) {
                            TLRPC.Chat chat5 = (TLRPC.Chat) obj;
                            charSequenceReplaceTags = ChatObject.isChannelOrGiga(chat4) ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChannelChatJoined, chat5.title)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChatChatJoined, chat5.title));
                        } else {
                            charSequenceReplaceTags = "";
                        }
                        y8 y8Var2 = new y8();
                        y8Var2.u(AndroidUtilities.dp(12.0f));
                        TLObject tLObject = (TLObject) obj;
                        y8Var2.j(i24, tLObject);
                        n9Var.e(tLObject, y8Var2);
                        n9Var.setVisibility(0);
                        this.C = 3000L;
                    } else if (i10 == 37) {
                        y8 y8Var3 = new y8();
                        y8Var3.u(AndroidUtilities.dp(12.0f));
                        if (obj instanceof TLRPC.User) {
                            TLRPC.User user5 = (TLRPC.User) obj;
                            y8Var3.m(i24, user5);
                            n9Var.e(user5, y8Var3);
                            name = ContactsController.formatName(user5.first_name, user5.last_name);
                        } else {
                            TLRPC.Chat chat6 = (TLRPC.Chat) obj;
                            y8Var3.k(i24, chat6);
                            n9Var.e(chat6, y8Var3);
                            name = chat6.title;
                        }
                        if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj2)) {
                            i20 = 0;
                            charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelUserChanged", R.string.VoipChannelUserChanged, name));
                        } else {
                            i20 = 0;
                            charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserChanged", R.string.VoipGroupUserChanged, name));
                        }
                        n9Var.setVisibility(i20);
                        this.C = 3000L;
                    } else {
                        if (i10 == 33) {
                            charSequenceReplaceTags = LocaleController.getString(R.string.VoipGroupCopyInviteLinkCopied);
                            int i38 = R.raw.voip_invite;
                            this.C = 3000L;
                            i16 = i38;
                            textView = w1Var;
                        } else {
                            int i39 = 9;
                            if (i10 == 77) {
                                charSequenceReplaceTags = (CharSequence) obj;
                                i18 = R.raw.payment_success;
                                this.C = 5000L;
                                if (this.f26579s == null || !(obj2 instanceof TLRPC.Message)) {
                                    textView = w1Var;
                                } else {
                                    setOnTouchListener(null);
                                    textView = w1Var;
                                    textView.setMovementMethod(null);
                                    setOnClickListener(new xh0(i39, this, (TLRPC.Message) obj2));
                                }
                            } else {
                                textView = w1Var;
                                if (i10 == 30) {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeak", R.string.VoipGroupUserCantNowSpeak, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                    i18 = R.raw.voip_muted;
                                    this.C = 3000L;
                                } else if (i10 == 35) {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeakForYou", R.string.VoipGroupUserCantNowSpeakForYou, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : obj instanceof TLRPC.Chat ? ((TLRPC.Chat) obj).title : ""));
                                    i18 = R.raw.voip_muted;
                                    this.C = 3000L;
                                } else if (i10 == 31) {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeak", R.string.VoipGroupUserCanNowSpeak, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                    i18 = R.raw.voip_unmuted;
                                    this.C = 3000L;
                                } else if (i10 == 38) {
                                    charSequenceReplaceTags = obj instanceof TLRPC.Chat ? AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupYouCanNowSpeakIn", R.string.VoipGroupYouCanNowSpeakIn, ((TLRPC.Chat) obj).title)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupYouCanNowSpeak));
                                    i18 = R.raw.voip_allow_talk;
                                    this.C = 3000L;
                                } else if (i10 == 42) {
                                    charSequenceReplaceTags = ChatObject.isChannelOrGiga((TLRPC.Chat) obj) ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundMuted)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundMuted));
                                    i18 = R.raw.ic_mute;
                                    this.C = 3000L;
                                } else if (i10 == 43) {
                                    charSequenceReplaceTags = ChatObject.isChannelOrGiga((TLRPC.Chat) obj) ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundUnmuted)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundUnmuted));
                                    i18 = R.raw.ic_unmute;
                                    this.C = 3000L;
                                } else {
                                    int i40 = this.G;
                                    int i41 = 39;
                                    if (i40 == 39) {
                                        if (i40 == i41) {
                                            i14 = R.string.VoipGroupAudioRecordStarted;
                                        } else {
                                            i14 = R.string.VoipGroupVideoRecordStarted;
                                        }
                                        charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i14));
                                        i15 = R.raw.voip_record_start;
                                        this.C = 3000L;
                                        i16 = i15;
                                        string = null;
                                        i25 = 36;
                                    } else if (i40 == 100) {
                                        i41 = 39;
                                        if (i40 == i41) {
                                            i14 = R.string.VoipGroupAudioRecordStarted;
                                        } else {
                                            i14 = R.string.VoipGroupVideoRecordStarted;
                                        }
                                        charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i14));
                                        i15 = R.raw.voip_record_start;
                                        this.C = 3000L;
                                        i16 = i15;
                                        string = null;
                                        i25 = 36;
                                    } else {
                                        int i42 = 40;
                                        if (i40 == 40) {
                                            if (i40 == i42) {
                                                i17 = R.string.VoipGroupAudioRecordSaved;
                                            } else {
                                                i17 = R.string.VoipGroupVideoRecordSaved;
                                            }
                                            String string6 = LocaleController.getString(i17);
                                            i18 = R.raw.voip_record_saved;
                                            this.C = 4000L;
                                            textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                                            spannableStringBuilder = new SpannableStringBuilder(string6);
                                            iIndexOf = string6.indexOf("**");
                                            iLastIndexOf = string6.lastIndexOf("**");
                                            if (iIndexOf >= 0 && iLastIndexOf >= 0 && iIndexOf != iLastIndexOf) {
                                                spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 2, (CharSequence) "");
                                                spannableStringBuilder.replace(iIndexOf, iIndexOf + 2, (CharSequence) "");
                                                try {
                                                    spannableStringBuilder.setSpan(new r41("tg://openmessage?user_id=" + UserConfig.getInstance(i24).getClientUserId()), iIndexOf, iLastIndexOf - 2, 33);
                                                } catch (Exception e9) {
                                                    FileLog.e(e9);
                                                }
                                            }
                                            charSequenceReplaceTags = spannableStringBuilder;
                                            i25 = 36;
                                        } else if (i40 == 101) {
                                            i42 = 40;
                                            if (i40 == i42) {
                                                i17 = R.string.VoipGroupAudioRecordSaved;
                                            } else {
                                                i17 = R.string.VoipGroupVideoRecordSaved;
                                            }
                                            String string7 = LocaleController.getString(i17);
                                            i18 = R.raw.voip_record_saved;
                                            this.C = 4000L;
                                            textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                                            spannableStringBuilder = new SpannableStringBuilder(string7);
                                            iIndexOf = string7.indexOf("**");
                                            iLastIndexOf = string7.lastIndexOf("**");
                                            if (iIndexOf >= 0) {
                                                spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 2, (CharSequence) "");
                                                spannableStringBuilder.replace(iIndexOf, iIndexOf + 2, (CharSequence) "");
                                                spannableStringBuilder.setSpan(new r41("tg://openmessage?user_id=" + UserConfig.getInstance(i24).getClientUserId()), iIndexOf, iLastIndexOf - 2, 33);
                                            }
                                            charSequenceReplaceTags = spannableStringBuilder;
                                            i25 = 36;
                                        } else if (i10 == 36) {
                                            charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeakForYou", R.string.VoipGroupUserCanNowSpeakForYou, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                            i18 = R.raw.voip_unmuted;
                                            this.C = 3000L;
                                        } else {
                                            if (i10 == 32 || i10 == 102) {
                                                String firstName = obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title;
                                                charSequenceReplaceTags = i10 == 102 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipConferenceKicked, firstName)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipGroupRemovedFromGroup, firstName));
                                                i15 = R.raw.ic_ban;
                                                this.C = 3000L;
                                            } else if (i10 == 9 || i10 == 10) {
                                                TLRPC.User user6 = (TLRPC.User) obj;
                                                charSequenceReplaceTags = i10 == 9 ? AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferChannelToast", R.string.EditAdminTransferChannelToast, UserObject.getFirstName(user6))) : AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferGroupToast", R.string.EditAdminTransferGroupToast, UserObject.getFirstName(user6)));
                                                i15 = R.raw.contact_check;
                                            } else if (i10 == 8) {
                                                charSequenceReplaceTags = LocaleController.formatString("NowInContacts", R.string.NowInContacts, UserObject.getFirstName((TLRPC.User) obj));
                                                i16 = R.raw.contact_check;
                                            } else if (i10 == 87) {
                                                charSequenceReplaceTags = LocaleController.formatString(R.string.ProxyAddedSuccess, new Object[0]);
                                                i18 = R.raw.contact_check;
                                            } else if (i10 == 22) {
                                                if (DialogObject.isUserDialog(jLongValue)) {
                                                    charSequenceReplaceTags = obj == null ? LocaleController.getString(R.string.MainProfilePhotoSetHint) : LocaleController.getString(R.string.MainProfileVideoSetHint);
                                                } else {
                                                    TLRPC.Chat chat7 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-jLongValue));
                                                    charSequenceReplaceTags = (!ChatObject.isChannel(chat7) || chat7.megagroup) ? obj == null ? LocaleController.getString(R.string.MainGroupProfilePhotoSetHint) : LocaleController.getString(R.string.MainGroupProfileVideoSetHint) : obj == null ? LocaleController.getString(R.string.MainChannelProfilePhotoSetHint) : LocaleController.getString(R.string.MainChannelProfileVideoSetHint);
                                                }
                                                i18 = R.raw.contact_check;
                                            } else if (i10 == 23) {
                                                charSequenceReplaceTags = LocaleController.getString(R.string.ChatWasMovedToMainList);
                                                i18 = R.raw.contact_check;
                                            } else if (i10 == 6) {
                                                charSequenceReplaceTags = LocaleController.getString(R.string.ArchiveHidden);
                                                string = LocaleController.getString(R.string.ArchiveHiddenInfo);
                                                i16 = R.raw.chats_swipearchive;
                                                i25 = 48;
                                            } else {
                                                if (i40 == 13) {
                                                    charSequenceReplaceTags = LocaleController.getString(R.string.QuizWellDone);
                                                    string = LocaleController.getString(R.string.QuizWellDoneInfo);
                                                    i16 = R.raw.wallet_congrats;
                                                } else if (i40 == 14) {
                                                    charSequenceReplaceTags = LocaleController.getString(R.string.QuizWrongAnswer);
                                                    string = LocaleController.getString(R.string.QuizWrongAnswerInfo);
                                                    i16 = R.raw.wallet_science;
                                                } else {
                                                    if (i10 == 7) {
                                                        charSequenceReplaceTags = LocaleController.getString(R.string.ArchivePinned);
                                                        string2 = MessagesController.getInstance(i24).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ArchivePinnedInfo) : null;
                                                        i19 = R.raw.chats_infotip;
                                                    } else if (i10 == 20 || i10 == 21) {
                                                        MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                                                        Spannable spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, textView.getPaint().getFontMetricsInt(), false), dialogFilter.entities, textView.getPaint().getFontMetricsInt());
                                                        this.f26572a = dialogFilter.title_noanimate ? 26 : 0;
                                                        if (jLongValue != 0) {
                                                            long j12 = DialogObject.isEncryptedDialog(jLongValue) ? org.telegram.messenger.y1.n(MessagesController.getInstance(i24), jLongValue).user_id : jLongValue;
                                                            if (DialogObject.isUserDialog(j12)) {
                                                                TLRPC.User user7 = MessagesController.getInstance(i24).getUser(Long.valueOf(j12));
                                                                String firstName2 = UserObject.getFirstName(user7);
                                                                if (UserObject.isUserSelf(user7)) {
                                                                    firstName2 = LocaleController.getString(R.string.SavedMessages);
                                                                } else if (UserObject.isReplyUser(user7)) {
                                                                    firstName2 = LocaleController.getString(R.string.RepliesTitle);
                                                                }
                                                                charSequenceReplaceTags2 = i10 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserAddedToExisting, firstName2, spannableReplaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserRemovedFrom, firstName2, spannableReplaceAnimatedEmoji));
                                                            } else {
                                                                TLRPC.Chat chat8 = MessagesController.getInstance(i24).getChat(Long.valueOf(-j12));
                                                                charSequenceReplaceTags2 = i10 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatAddedToExisting, chat8.title, spannableReplaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatRemovedFrom, chat8.title, spannableReplaceAnimatedEmoji));
                                                            }
                                                        } else {
                                                            charSequenceReplaceTags2 = i10 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsAddedToExisting, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), spannableReplaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsRemovedFrom, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), spannableReplaceAnimatedEmoji));
                                                        }
                                                        CharSequence charSequence2 = charSequenceReplaceTags2;
                                                        i16 = i10 == 20 ? R.raw.folder_in : R.raw.folder_out;
                                                        charSequenceReplaceTags = charSequence2;
                                                        string = null;
                                                        i25 = 36;
                                                    } else if (i10 == 19) {
                                                        charSequenceReplaceTags = this.O;
                                                        i18 = R.raw.ic_delete;
                                                    } else if (i10 == 82) {
                                                        charSequenceReplaceTags = LocaleController.getString(((MediaController.PhotoEntry) obj).isVideo ? R.string.AttachMediaVideoDeselected : R.string.AttachMediaPhotoDeselected);
                                                        string = null;
                                                        i16 = 0;
                                                    } else if (i10 == 78 || i10 == 79) {
                                                        int iIntValue5 = ((Integer) obj).intValue();
                                                        charSequenceReplaceTags = i10 == 78 ? LocaleController.formatPluralString("PinnedDialogsCount", iIntValue5, new Object[0]) : LocaleController.formatPluralString("UnpinnedDialogsCount", iIntValue5, new Object[0]);
                                                        i18 = this.G == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                                        if (obj2 instanceof Integer) {
                                                            this.C = ((Integer) obj2).intValue();
                                                        }
                                                    } else {
                                                        charSequenceReplaceTags = i10 == 3 ? LocaleController.getString(R.string.ChatArchived) : LocaleController.getString(R.string.ChatsArchived);
                                                        string2 = MessagesController.getInstance(i24).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ChatArchivedInfo) : null;
                                                        i19 = R.raw.chats_infotip;
                                                    }
                                                    i16 = i19;
                                                    string = string2;
                                                }
                                                i25 = 44;
                                            }
                                            i16 = i15;
                                            string = null;
                                            i25 = 36;
                                        }
                                    }
                                }
                            }
                            i16 = i18;
                        }
                        string = null;
                    }
                    textView = w1Var;
                    string = null;
                    i16 = 0;
                }
                textView.setText(charSequenceReplaceTags);
                if (i16 != 0) {
                    ri0Var2.e(i16, i25, i25);
                    oi0 animatedDrawable = ri0Var2.getAnimatedDrawable();
                    animatedDrawable.h = false;
                    animatedDrawable.N(animatedDrawable.q());
                    ri0Var2.setVisibility(0);
                    ri0Var2.setProgress(0.0f);
                    ri0Var2.d();
                } else {
                    ri0Var2.setVisibility(8);
                }
                if (string != null) {
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = AndroidUtilities.dp(8.0f);
                    textView3.setText(string);
                    textView3.setVisibility(0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTypeface(AndroidUtilities.bold());
                    i22 = 8;
                } else {
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    i22 = 8;
                    textView3.setVisibility(8);
                    textView.setTextSize(1, 15.0f);
                    textView.setTypeface(Typeface.DEFAULT);
                }
                linearLayout.setVisibility(i22);
            }
            textView = w1Var;
            textView.setText(charSequenceReplaceTags);
            if (i16 != 0) {
                ri0Var2.e(i16, i25, i25);
                oi0 animatedDrawable2 = ri0Var2.getAnimatedDrawable();
                animatedDrawable2.h = false;
                animatedDrawable2.N(animatedDrawable2.q());
                ri0Var2.setVisibility(0);
                ri0Var2.setProgress(0.0f);
                ri0Var2.d();
            } else {
                ri0Var2.setVisibility(8);
            }
            if (string != null) {
                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = AndroidUtilities.dp(8.0f);
                textView3.setText(string);
                textView3.setVisibility(0);
                textView.setTextSize(1, 14.0f);
                textView.setTypeface(AndroidUtilities.bold());
                i22 = 8;
            } else {
                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                i22 = 8;
                textView3.setVisibility(8);
                textView.setTextSize(1, 15.0f);
                textView.setTypeface(Typeface.DEFAULT);
            }
            linearLayout.setVisibility(i22);
            str = "";
            z10 = false;
            StringBuilder sb3 = new StringBuilder();
            sb3.append((Object) textView.getText());
            if (textView3.getVisibility() == 0) {
                str2 = ". " + ((Object) textView3.getText());
            } else {
                str2 = str;
            }
            sb3.append(str2);
            AndroidUtilities.makeAccessibilityAnnouncement(sb3.toString());
            if (f()) {
                measuredWidth2 = ((ViewGroup) getParent()).getMeasuredWidth();
                if (measuredWidth2 == 0) {
                    measuredWidth2 = AndroidUtilities.displaySize.x;
                }
                measureChildWithMargins(textView3, org.telegram.messenger.rl.d(16.0f, measuredWidth2, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                this.f26578r = AndroidUtilities.dp(37.0f) + textView3.getMeasuredHeight();
            } else if (d()) {
                this.f26578r = AndroidUtilities.dp(52.0f);
            } else if (getParent() instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                measuredWidth = (viewGroup2.getMeasuredWidth() - viewGroup2.getPaddingLeft()) - viewGroup2.getPaddingRight();
                if (measuredWidth <= 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                View view2 = textView;
                measureChildWithMargins(view2, org.telegram.messenger.rl.d(16.0f, measuredWidth, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                int measuredHeight2 = view2.getMeasuredHeight();
                i12 = this.G;
                if (i12 != 16) {
                    f10 = 14.0f;
                } else {
                    f10 = 14.0f;
                }
                iDp2 = AndroidUtilities.dp(f10) + measuredHeight2;
                this.f26578r = iDp2;
                i13 = this.G;
                if (i13 == 18) {
                    this.f26578r = Math.max(iDp2, AndroidUtilities.dp(52.0f));
                } else if (i13 == 25) {
                    this.f26578r = Math.max(iDp2, AndroidUtilities.dp(50.0f));
                } else if (z10) {
                    this.f26578r = iDp2 - AndroidUtilities.dp(8.0f);
                }
            }
            if (getVisibility() != 0) {
                setVisibility(0);
                if (this.N) {
                    f11 = -1.0f;
                } else {
                    f11 = 1.0f;
                }
                setEnterOffset(f11 * (this.S + this.f26578r));
                AnimatorSet animatorSet2 = new AnimatorSet();
                z11 = this.N;
                if (z11) {
                    f12 = -1.0f;
                } else {
                    f12 = 1.0f;
                }
                float f15 = f12 * (this.S + this.f26578r);
                if (z11) {
                    f13 = 1.0f;
                } else {
                    f13 = -1.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", f15, f13));
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.setDuration(180L);
                animatorSet2.start();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10 = this.L;
        ShapeDrawable shapeDrawable = this.Q;
        if (f10 != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.W) + this.S + AndroidUtilities.dp(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            shapeDrawable.draw(canvas);
            canvas.restore();
        } else {
            shapeDrawable.draw(canvas);
        }
        int i10 = this.G;
        if (i10 == 1 || i10 == 95 || i10 == 0 || i10 == 27 || i10 == 26 || i10 == 81 || i10 == 88) {
            long j10 = this.C;
            int iCeil = j10 > 0 ? (int) Math.ceil(j10 / 1000.0f) : 0;
            int i11 = this.D;
            TextPaint textPaint = this.f26582y;
            if (i11 != iCeil) {
                this.D = iCeil;
                String str = String.format("%d", Integer.valueOf(Math.max(1, iCeil)));
                this.E = str;
                StaticLayout staticLayout = this.T;
                if (staticLayout != null) {
                    this.U = staticLayout;
                    this.V = 0.0f;
                }
                this.F = (int) Math.ceil(textPaint.measureText(str));
                this.T = new StaticLayout(this.E, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f11 = this.V;
            if (f11 < 1.0f) {
                float f12 = f11 + 0.10666667f;
                this.V = f12;
                if (f12 > 1.0f) {
                    this.V = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.U;
            RectF rectF = this.B;
            if (staticLayout2 != null) {
                float f13 = this.V;
                if (f13 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f13) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.F / 2), (AndroidUtilities.dp(10.0f) * this.V) + AndroidUtilities.dp(17.2f));
                    this.U.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.T != null) {
                float f14 = this.V;
                if (f14 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f14));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.F / 2), org.telegram.ui.Cells.pa.b(1.0f, this.V, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(17.2f)));
                this.T.draw(canvas);
                if (this.V != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (this.C / 5000.0f) * (-360.0f), false, this.A);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.C - (jElapsedRealtime - this.K);
        this.C = j11;
        this.K = jElapsedRealtime;
        if (j11 <= 0) {
            e(this.P, true);
        }
        if (this.G != 82) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f26578r, 1073741824));
        this.Q.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f10) {
        if (this.L != f10) {
            this.L = f10;
            setTranslationY(((this.W - this.S) + AndroidUtilities.dp(8.0f)) - this.L);
            invalidate();
        }
    }

    public void setEnterOffset(float f10) {
        if (this.W != f10) {
            this.W = f10;
            setTranslationY(((f10 - this.S) + AndroidUtilities.dp(8.0f)) - this.L);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i10) {
        this.S = i10;
    }

    public void setHideAnimationType(int i10) {
        this.P = i10;
    }

    public void setInfoText(CharSequence charSequence) {
        this.O = charSequence;
    }

    public UndoView(Context context, nc1 nc1Var) {
        this(context, nc1Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f26572a = 0;
        this.f26581x = UserConfig.selectedAccount;
        this.G = -1;
        this.P = 1;
        this.S = AndroidUtilities.dp(8.0f);
        this.V = 1.0f;
        this.R = c6Var;
        this.f26579s = n2Var;
        this.N = z10;
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, context, c6Var);
        this.f26573b = w1Var;
        w1Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Hi;
        w1Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.Gi;
        w1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        w1Var.setMovementMethod(new w41(this));
        addView(w1Var, h7.z5.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f26574c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        addView(textView, h7.z5.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        ri0 ri0Var = new ri0(context);
        this.f26576f = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.g6.Fi;
        ri0Var.h(org.telegram.ui.ActionBar.g6.v0(i12, c6Var) | (-16777216), "info1");
        ri0Var.h(org.telegram.ui.ActionBar.g6.v0(i12, c6Var) | (-16777216), "info2");
        ri0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc12");
        ri0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc11");
        ri0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc10");
        ri0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc9");
        ri0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc8");
        ri0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc7");
        ri0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc6");
        ri0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc5");
        ri0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc4");
        ri0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc3");
        ri0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc2");
        ri0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc1");
        ri0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "Oval");
        addView(ri0Var, h7.z5.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        n9 n9Var = new n9(context);
        this.h = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(n9Var, h7.z5.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f26577n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(i11, c6Var) & 587202559, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
        addView(linearLayout, h7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new v41(this, 0));
        ImageView imageView = new ImageView(context);
        this.f26575e = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView, h7.z5.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView2.setText(LocaleController.getString(R.string.UndoNoCaps));
        linearLayout.addView(textView2, h7.z5.t(-2, -2, 19, 6, 4, 8, 4));
        this.B = new RectF(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(33.0f), AndroidUtilities.dp(33.0f));
        Paint paint = new Paint(1);
        this.A = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        TextPaint textPaint = new TextPaint(1);
        this.f26582y = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        setWillNotDraw(false);
        this.Q = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        setOnTouchListener(new kh.e(25));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void h(int i10, long j10) {
    }
}
