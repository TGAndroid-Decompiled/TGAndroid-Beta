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
public final class c70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public TextView f35856a;
    public TextView f35857b;
    public TextView f35858c;
    public m0 d;
    public LinearLayout e;
    public LinearLayout f35859f;
    public int h;
    public AnimatorSet f35860n;
    public String f35861r;

    @Override
    public final View createView(Context context) {
        char c10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        char c11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EncryptionKey));
        this.actionBar.setActionBarMenuOnItemClick(new o60(this, 3));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20936a7, false));
        this.fragmentView.setOnTouchListener(new di.d(2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f35859f = linearLayout;
        linearLayout.setOrientation(1);
        this.f35859f.setWeightSum(100.0f);
        frameLayout.addView(this.f35859f, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.f35859f.addView(frameLayout2, w7.z5.l(50.0f, -1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout2.addView(imageView, w7.z5.c(-1.0f, -1));
        m0 m0Var = new m0(this, context, 8);
        this.d = m0Var;
        m0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20994d6, false));
        this.f35859f.addView(this.d, w7.z5.l(50.0f, -1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.e.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.d.addView(this.e, w7.z5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f35857b = textView;
        int i10 = org.telegram.ui.ActionBar.h6.B6;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.f35857b.setGravity(17);
        this.f35857b.setTypeface(Typeface.MONOSPACE);
        this.f35857b.setTextSize(1, 16.0f);
        this.e.addView(this.f35857b, w7.z5.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f35856a = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.f35856a.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
        this.f35856a.setTextSize(1, 16.0f);
        this.f35856a.setLinksClickable(true);
        this.f35856a.setClickable(true);
        this.f35856a.setGravity(17);
        this.f35856a.setMovementMethod(new org.telegram.ui.Components.yv(1));
        this.e.addView(this.f35856a, w7.z5.e(-2, -2, 1));
        TextView textView3 = new TextView(context);
        this.f35858c = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.f35858c.setGravity(17);
        this.f35858c.setTextSize(1, 32.0f);
        this.d.addView(this.f35858c, w7.z5.c(-2.0f, -2));
        TLRPC.EncryptedChat encryptedChat = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(this.h));
        if (encryptedChat != null) {
            org.telegram.ui.Components.w40 w40Var = new org.telegram.ui.Components.w40();
            imageView.setImageDrawable(w40Var);
            byte[] bArr = encryptedChat.key_hash;
            w40Var.f31968a = bArr;
            if (bArr == null) {
                byte[] calcAuthKeyHash = AndroidUtilities.calcAuthKeyHash(encryptedChat.auth_key);
                w40Var.f31968a = calcAuthKeyHash;
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
                this.f35861r = sb2.toString();
            } else {
                c10 = 1;
            }
            this.f35857b.setText(spannableStringBuilder.toString());
            spannableStringBuilder.clear();
            int i16 = R.string.EncryptionKeyDescription;
            String str = user.first_name;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[c10] = str;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("EncryptionKeyDescription", i16, objArr)));
            int indexOf = spannableStringBuilder.toString().indexOf("telegram.org");
            if (indexOf != -1) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.n61(LocaleController.getString(R.string.EncryptionKeyLink), null), indexOf, indexOf + 12, 33);
            }
            this.f35856a.setText(spannableStringBuilder);
        }
        AnimatorSet animatorSet = this.f35860n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f35860n = null;
        }
        this.f35858c.setAlpha(0.0f);
        this.f35857b.setAlpha(1.0f);
        this.f35858c.setScaleX(0.0f);
        this.f35858c.setScaleY(0.0f);
        this.f35857b.setScaleX(1.0f);
        this.f35857b.setScaleY(1.0f);
        this.f35858c.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.Me));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        if (i10 == NotificationCenter.emojiLoaded && (textView = this.f35858c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20994d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20936a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f21273s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21329v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21292t8));
        TextView textView = this.f35856a;
        int i10 = org.telegram.ui.ActionBar.h6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35857b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35856a, 2, null, null, null, null, org.telegram.ui.ActionBar.h6.J6));
        return arrayList;
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
        if (z10 && !z11 && (str = this.f35861r) != null) {
            TextView textView = this.f35858c;
            textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
        }
    }
}
