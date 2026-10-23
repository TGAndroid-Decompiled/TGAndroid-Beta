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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g70 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public TextView f37508a;
    public TextView f37509b;
    public TextView f37510c;
    public l0 d;
    public LinearLayout e;
    public LinearLayout f37511f;
    public int h;
    public AnimatorSet f37512n;
    public String f37513r;

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21518v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
    }

    @Override
    public final View createView(Context context) {
        char c10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        char c11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EncryptionKey));
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 3));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21125a7, frameLayout, null);
        this.fragmentView.setOnTouchListener(new di.d(2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f37511f = linearLayout;
        linearLayout.setOrientation(1);
        this.f37511f.setWeightSum(100.0f);
        frameLayout.addView(this.f37511f, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.f37511f.addView(frameLayout2, w7.z5.l(50.0f, -1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout2.addView(imageView, w7.z5.c(-1.0f, -1));
        l0 l0Var = new l0(this, context, 8);
        this.d = l0Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, l0Var, null);
        this.f37511f.addView(this.d, w7.z5.l(50.0f, -1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.e.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.d.addView(this.e, w7.z5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f37509b = textView;
        int i10 = org.telegram.ui.ActionBar.k6.B6;
        org.telegram.ui.ActionBar.r6.W(textView, i10, null);
        this.f37509b.setGravity(17);
        this.f37509b.setTypeface(Typeface.MONOSPACE);
        this.f37509b.setTextSize(1, 16.0f);
        this.e.addView(this.f37509b, w7.z5.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f37508a = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, i10, null);
        org.telegram.ui.ActionBar.r6.I(this.f37508a, org.telegram.ui.ActionBar.k6.J6, null);
        this.f37508a.setTextSize(1, 16.0f);
        this.f37508a.setLinksClickable(true);
        this.f37508a.setClickable(true);
        this.f37508a.setGravity(17);
        this.f37508a.setMovementMethod(new org.telegram.ui.Components.yv(1));
        this.e.addView(this.f37508a, w7.z5.e(-2, -2, 1));
        TextView textView3 = new TextView(context);
        this.f37510c = textView3;
        org.telegram.ui.ActionBar.r6.W(textView3, i10, null);
        this.f37510c.setGravity(17);
        this.f37510c.setTextSize(1, 32.0f);
        this.d.addView(this.f37510c, w7.z5.c(-2.0f, -2));
        TLRPC.EncryptedChat encryptedChat = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(this.h));
        if (encryptedChat != null) {
            org.telegram.ui.Components.w40 w40Var = new org.telegram.ui.Components.w40();
            imageView.setImageDrawable(w40Var);
            byte[] bArr = encryptedChat.key_hash;
            w40Var.f32150a = bArr;
            if (bArr == null) {
                byte[] calcAuthKeyHash = AndroidUtilities.calcAuthKeyHash(encryptedChat.auth_key);
                w40Var.f32150a = calcAuthKeyHash;
                encryptedChat.key_hash = calcAuthKeyHash;
            }
            w40Var.invalidateSelf();
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(encryptedChat.user_id));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr2 = encryptedChat.key_hash;
            if (bArr2.length > 16) {
                String bytesToHex = Utilities.bytesToHex(bArr2);
                int i11 = 0;
                while (i11 < 32) {
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
                    i11++;
                    c11 = c11;
                }
                c10 = c11;
                spannableStringBuilder.append((CharSequence) "\n");
                for (int i13 = 0; i13 < 5; i13++) {
                    byte[] bArr3 = encryptedChat.key_hash;
                    int i14 = i13 * 4;
                    int i15 = (bArr3[i14 + 19] & 255) | ((bArr3[i14 + 16] & Byte.MAX_VALUE) << 24) | ((bArr3[i14 + 17] & 255) << 16) | ((bArr3[i14 + 18] & 255) << 8);
                    if (i13 != 0) {
                        sb2.append(" ");
                    }
                    String[] strArr = EmojiData.emojiSecret;
                    sb2.append(strArr[i15 % strArr.length]);
                }
                this.f37513r = sb2.toString();
            } else {
                c10 = 1;
            }
            this.f37509b.setText(spannableStringBuilder.toString());
            spannableStringBuilder.clear();
            int i16 = R.string.EncryptionKeyDescription;
            String str = user.first_name;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[c10] = str;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("EncryptionKeyDescription", i16, objArr)));
            int indexOf = spannableStringBuilder.toString().indexOf("telegram.org");
            if (indexOf != -1) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.s61(LocaleController.getString(R.string.EncryptionKeyLink), null), indexOf, indexOf + 12, 33);
            }
            this.f37508a.setText(spannableStringBuilder);
        }
        AnimatorSet animatorSet = this.f37512n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f37512n = null;
        }
        this.f37510c.setAlpha(0.0f);
        this.f37509b.setAlpha(1.0f);
        this.f37510c.setScaleX(0.0f);
        this.f37510c.setScaleY(0.0f);
        this.f37509b.setScaleX(1.0f);
        this.f37509b.setScaleY(1.0f);
        this.f37510c.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.Me));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        if (i10 == NotificationCenter.emojiLoaded && (textView = this.f37510c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new vh(this, 2));
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
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new vh(this, 2));
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        String str;
        if (z10 && !z11 && (str = this.f37513r) != null) {
            TextView textView = this.f37510c;
            textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
        }
    }
}
