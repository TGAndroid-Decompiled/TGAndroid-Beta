package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class e70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {

    public TextView f37644a;

    public TextView f37645b;

    public TextView f37646c;
    public n0 d;

    public LinearLayout f37647e;

    public LinearLayout f37648f;
    public int h;

    public AnimatorSet f37649n;

    public String f37650r;

    @Override
    public final View createView(Context context) {
        char c10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EncryptionKey));
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 26));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        this.fragmentView.setOnTouchListener(new kh.e(2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f37648f = linearLayout;
        linearLayout.setOrientation(1);
        this.f37648f.setWeightSum(100.0f);
        frameLayout.addView(this.f37648f, h7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.f37648f.addView(frameLayout2, h7.z5.l(50.0f, -1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout2.addView(imageView, h7.z5.c(-1.0f, -1));
        n0 n0Var = new n0(this, context, 8);
        this.d = n0Var;
        n0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        this.f37648f.addView(this.d, h7.z5.l(50.0f, -1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f37647e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f37647e.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.d.addView(this.f37647e, h7.z5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f37645b = textView;
        int i10 = org.telegram.ui.ActionBar.g6.B6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.f37645b.setGravity(17);
        this.f37645b.setTypeface(Typeface.MONOSPACE);
        this.f37645b.setTextSize(1, 16.0f);
        this.f37647e.addView(this.f37645b, h7.z5.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f37644a = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.f37644a.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
        this.f37644a.setTextSize(1, 16.0f);
        this.f37644a.setLinksClickable(true);
        this.f37644a.setClickable(true);
        this.f37644a.setGravity(17);
        this.f37644a.setMovementMethod(new org.telegram.ui.Components.av(1));
        this.f37647e.addView(this.f37644a, h7.z5.e(-2, -2, 1));
        TextView textView3 = new TextView(context);
        this.f37646c = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.f37646c.setGravity(17);
        this.f37646c.setTextSize(1, 32.0f);
        this.d.addView(this.f37646c, h7.z5.c(-2.0f, -2));
        TLRPC.EncryptedChat encryptedChat = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(this.h));
        if (encryptedChat != null) {
            org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40();
            imageView.setImageDrawable(b40Var);
            byte[] bArr = encryptedChat.key_hash;
            b40Var.f26916a = bArr;
            if (bArr == null) {
                byte[] bArrCalcAuthKeyHash = AndroidUtilities.calcAuthKeyHash(encryptedChat.auth_key);
                b40Var.f26916a = bArrCalcAuthKeyHash;
                encryptedChat.key_hash = bArrCalcAuthKeyHash;
            }
            b40Var.invalidateSelf();
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(encryptedChat.user_id));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr2 = encryptedChat.key_hash;
            if (bArr2.length > 16) {
                String strBytesToHex = Utilities.bytesToHex(bArr2);
                for (int i11 = 0; i11 < 32; i11++) {
                    if (i11 != 0) {
                        if (i11 % 8 == 0) {
                            spannableStringBuilder.append('\n');
                        } else if (i11 % 4 == 0) {
                            spannableStringBuilder.append(' ');
                        }
                    }
                    int i12 = i11 * 2;
                    spannableStringBuilder.append((CharSequence) strBytesToHex.substring(i12, i12 + 2));
                    spannableStringBuilder.append(' ');
                }
                c10 = 1;
                spannableStringBuilder.append((CharSequence) "\n");
                for (int i13 = 0; i13 < 5; i13++) {
                    byte[] bArr3 = encryptedChat.key_hash;
                    int i14 = i13 * 4;
                    int i15 = (bArr3[i14 + 19] & 255) | ((bArr3[i14 + 16] & 127) << 24) | ((bArr3[i14 + 17] & 255) << 16) | ((bArr3[i14 + 18] & 255) << 8);
                    if (i13 != 0) {
                        sb2.append(" ");
                    }
                    String[] strArr = EmojiData.emojiSecret;
                    sb2.append(strArr[i15 % strArr.length]);
                }
                this.f37650r = sb2.toString();
            } else {
                c10 = 1;
            }
            this.f37645b.setText(spannableStringBuilder.toString());
            spannableStringBuilder.clear();
            int i16 = R.string.EncryptionKeyDescription;
            String str = user.first_name;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[c10] = str;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("EncryptionKeyDescription", i16, objArr)));
            int iIndexOf = spannableStringBuilder.toString().indexOf("telegram.org");
            if (iIndexOf != -1) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.t41(LocaleController.getString(R.string.EncryptionKeyLink), null), iIndexOf, iIndexOf + 12, 33);
            }
            this.f37644a.setText(spannableStringBuilder);
        }
        AnimatorSet animatorSet = this.f37649n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f37649n = null;
        }
        this.f37646c.setAlpha(0.0f);
        this.f37645b.setAlpha(1.0f);
        this.f37646c.setScaleX(0.0f);
        this.f37646c.setScaleY(0.0f);
        this.f37645b.setScaleX(1.0f);
        this.f37645b.setScaleY(1.0f);
        this.f37646c.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.Me));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        if (i10 != NotificationCenter.emojiLoaded || (textView = this.f37646c) == null) {
            return;
        }
        textView.invalidate();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        TextView textView = this.f37644a;
        int i10 = org.telegram.ui.ActionBar.g6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37645b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37644a, 2, null, null, null, null, org.telegram.ui.ActionBar.g6.J6));
        return arrayList;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new uh(this, 2));
    }

    @Override
    public final boolean onFragmentCreate() {
        this.h = getArguments().getInt("chat_id");
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new uh(this, 2));
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        String str;
        if (!z10 || z11 || (str = this.f37650r) == null) {
            return;
        }
        TextView textView = this.f37646c;
        textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
    }
}
