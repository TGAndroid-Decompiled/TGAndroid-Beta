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
public final class p70 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public TextView f39906a;
    public TextView f39907b;
    public TextView f39908c;
    public l0 d;
    public LinearLayout f39909e;
    public LinearLayout f39910f;
    public int h;
    public AnimatorSet f39911n;
    public String f39912r;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EncryptionKey));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
        this.fragmentView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f39910f = linearLayout;
        linearLayout.setOrientation(1);
        this.f39910f.setWeightSum(100.0f);
        frameLayout.addView(this.f39910f, k7.c6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.f39910f.addView(frameLayout2, k7.c6.l(50.0f, -1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout2.addView(imageView, k7.c6.c(-1.0f, -1));
        l0 l0Var = new l0(this, context, 8);
        this.d = l0Var;
        l0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
        this.f39910f.addView(this.d, k7.c6.l(50.0f, -1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f39909e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f39909e.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.d.addView(this.f39909e, k7.c6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f39907b = textView;
        int i10 = org.telegram.ui.ActionBar.k6.B6;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        this.f39907b.setGravity(17);
        this.f39907b.setTypeface(Typeface.MONOSPACE);
        this.f39907b.setTextSize(1, 16.0f);
        this.f39909e.addView(this.f39907b, k7.c6.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f39906a = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        this.f39906a.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J6, false));
        this.f39906a.setTextSize(1, 16.0f);
        this.f39906a.setLinksClickable(true);
        this.f39906a.setClickable(true);
        this.f39906a.setGravity(17);
        this.f39906a.setMovementMethod(new org.telegram.ui.Components.mv(1));
        this.f39909e.addView(this.f39906a, k7.c6.e(-2, -2, 1));
        TextView textView3 = new TextView(context);
        this.f39908c = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        this.f39908c.setGravity(17);
        this.f39908c.setTextSize(1, 32.0f);
        this.d.addView(this.f39908c, k7.c6.c(-2.0f, -2));
        TLRPC.EncryptedChat encryptedChat = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(this.h));
        if (encryptedChat != null) {
            org.telegram.ui.Components.q40 q40Var = new org.telegram.ui.Components.q40();
            imageView.setImageDrawable(q40Var);
            byte[] bArr = encryptedChat.key_hash;
            q40Var.f30281a = bArr;
            if (bArr == null) {
                byte[] calcAuthKeyHash = AndroidUtilities.calcAuthKeyHash(encryptedChat.auth_key);
                q40Var.f30281a = calcAuthKeyHash;
                encryptedChat.key_hash = calcAuthKeyHash;
            }
            q40Var.invalidateSelf();
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(encryptedChat.user_id));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder sb = new StringBuilder();
            byte[] bArr2 = encryptedChat.key_hash;
            if (bArr2.length > 16) {
                String bytesToHex = Utilities.bytesToHex(bArr2);
                for (int i11 = 0; i11 < 32; i11++) {
                    if (i11 != 0) {
                        if (i11 % 8 == 0) {
                            spannableStringBuilder.append('\n');
                        } else if (i11 % 4 == 0) {
                            spannableStringBuilder.append(' ');
                        }
                    }
                    int i12 = i11 * 2;
                    spannableStringBuilder.append((CharSequence) bytesToHex.substring(i12, i12 + 2));
                    spannableStringBuilder.append(' ');
                }
                spannableStringBuilder.append((CharSequence) "\n");
                for (int i13 = 0; i13 < 5; i13++) {
                    byte[] bArr3 = encryptedChat.key_hash;
                    int i14 = i13 * 4;
                    int i15 = (bArr3[i14 + 19] & 255) | ((bArr3[i14 + 16] & Byte.MAX_VALUE) << 24) | ((bArr3[i14 + 17] & 255) << 16) | ((bArr3[i14 + 18] & 255) << 8);
                    if (i13 != 0) {
                        sb.append(" ");
                    }
                    String[] strArr = EmojiData.emojiSecret;
                    sb.append(strArr[i15 % strArr.length]);
                }
                this.f39912r = sb.toString();
            }
            this.f39907b.setText(spannableStringBuilder.toString());
            spannableStringBuilder.clear();
            int i16 = R.string.EncryptionKeyDescription;
            String str = user.first_name;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("EncryptionKeyDescription", i16, str, str)));
            int indexOf = spannableStringBuilder.toString().indexOf("telegram.org");
            if (indexOf != -1) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.n51(LocaleController.getString(R.string.EncryptionKeyLink), null), indexOf, indexOf + 12, 33);
            }
            this.f39906a.setText(spannableStringBuilder);
        }
        AnimatorSet animatorSet = this.f39911n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f39911n = null;
        }
        this.f39908c.setAlpha(0.0f);
        this.f39907b.setAlpha(1.0f);
        this.f39908c.setScaleX(0.0f);
        this.f39908c.setScaleY(0.0f);
        this.f39907b.setScaleX(1.0f);
        this.f39907b.setScaleY(1.0f);
        this.f39908c.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.Me));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        if (i10 == NotificationCenter.emojiLoaded && (textView = this.f39908c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21932s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        TextView textView = this.f39906a;
        int i10 = org.telegram.ui.ActionBar.k6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(textView, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39907b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39906a, 2, null, null, null, null, org.telegram.ui.ActionBar.k6.J6));
        return arrayList;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new ai(this, 2));
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
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new ai(this, 2));
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        String str;
        if (z4 && !z10 && (str = this.f39912r) != null) {
            TextView textView = this.f39908c;
            textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
        }
    }
}
