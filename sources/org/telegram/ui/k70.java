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
public final class k70 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public TextView f40670a;
    public TextView f40671b;
    public TextView f40672c;
    public k0 d;
    public LinearLayout e;
    public LinearLayout f40673f;
    public int h;
    public AnimatorSet f40674n;
    public String f40675r;

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
    }

    @Override
    public final View createView(Context context) {
        char c10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        char c11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EncryptionKey));
        this.actionBar.setActionBarMenuOnItemClick(new c20(this, 5));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23300a7, frameLayout, null);
        this.fragmentView.setOnTouchListener(new ei.d(2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f40673f = linearLayout;
        linearLayout.setOrientation(1);
        this.f40673f.setWeightSum(100.0f);
        frameLayout.addView(this.f40673f, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.f40673f.addView(frameLayout2, org.telegram.ui.Components.kb1.p(50.0f, -1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout2.addView(imageView, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        k0 k0Var = new k0(this, context, 8);
        this.d = k0Var;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, k0Var, null);
        this.f40673f.addView(this.d, org.telegram.ui.Components.kb1.p(50.0f, -1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.e.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.d.addView(this.e, org.telegram.ui.Components.kb1.i(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f40671b = textView;
        int i10 = org.telegram.ui.ActionBar.y6.B6;
        org.telegram.ui.ActionBar.f7.V(textView, i10, null);
        this.f40671b.setGravity(17);
        this.f40671b.setTypeface(Typeface.MONOSPACE);
        this.f40671b.setTextSize(1, 16.0f);
        this.e.addView(this.f40671b, org.telegram.ui.Components.kb1.u(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f40670a = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, i10, null);
        org.telegram.ui.ActionBar.f7.H(this.f40670a, org.telegram.ui.ActionBar.y6.J6, null);
        this.f40670a.setTextSize(1, 16.0f);
        this.f40670a.setLinksClickable(true);
        this.f40670a.setClickable(true);
        this.f40670a.setGravity(17);
        this.f40670a.setMovementMethod(new org.telegram.ui.Components.yv(1));
        this.e.addView(this.f40670a, org.telegram.ui.Components.kb1.i(-2, -2, 1));
        TextView textView3 = new TextView(context);
        this.f40672c = textView3;
        org.telegram.ui.ActionBar.f7.V(textView3, i10, null);
        this.f40672c.setGravity(17);
        this.f40672c.setTextSize(1, 32.0f);
        this.d.addView(this.f40672c, org.telegram.ui.Components.kb1.g(-2.0f, -2));
        TLRPC.EncryptedChat encryptedChat = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(this.h));
        if (encryptedChat != null) {
            org.telegram.ui.Components.y40 y40Var = new org.telegram.ui.Components.y40();
            imageView.setImageDrawable(y40Var);
            byte[] bArr = encryptedChat.key_hash;
            y40Var.f34958a = bArr;
            if (bArr == null) {
                byte[] calcAuthKeyHash = AndroidUtilities.calcAuthKeyHash(encryptedChat.auth_key);
                y40Var.f34958a = calcAuthKeyHash;
                encryptedChat.key_hash = calcAuthKeyHash;
            }
            y40Var.invalidateSelf();
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
                this.f40675r = sb2.toString();
            } else {
                c10 = 1;
            }
            this.f40671b.setText(spannableStringBuilder.toString());
            spannableStringBuilder.clear();
            int i16 = R.string.EncryptionKeyDescription;
            String str = user.first_name;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[c10] = str;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("EncryptionKeyDescription", i16, objArr)));
            int indexOf = spannableStringBuilder.toString().indexOf("telegram.org");
            if (indexOf != -1) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.a71(LocaleController.getString(R.string.EncryptionKeyLink), null), indexOf, indexOf + 12, 33);
            }
            this.f40670a.setText(spannableStringBuilder);
        }
        AnimatorSet animatorSet = this.f40674n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f40674n = null;
        }
        this.f40672c.setAlpha(0.0f);
        this.f40671b.setAlpha(1.0f);
        this.f40672c.setScaleX(0.0f);
        this.f40672c.setScaleY(0.0f);
        this.f40671b.setScaleX(1.0f);
        this.f40671b.setScaleY(1.0f);
        this.f40672c.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.Me));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        if (i10 == NotificationCenter.emojiLoaded && (textView = this.f40672c) != null) {
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
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new i7(this, 2));
    }

    @Override
    public final boolean onFragmentCreate() {
        this.h = getArguments().getInt("chat_id");
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
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
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new i7(this, 2));
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        String str;
        if (z10 && !z11 && (str = this.f40675r) != null) {
            TextView textView = this.f40672c;
            textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
        }
    }
}
