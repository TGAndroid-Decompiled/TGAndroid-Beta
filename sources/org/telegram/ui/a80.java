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
public final class a80 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public TextView f33777a;
    public TextView f33778b;
    public TextView f33779c;
    public l0 d;
    public LinearLayout e;
    public LinearLayout f33780f;
    public int h;
    public AnimatorSet f33781n;
    public String f33782r;

    @Override
    public final View createView(Context context) {
        char c10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        char c11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EncryptionKey));
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false));
        this.fragmentView.setOnTouchListener(new ci.d(2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33780f = linearLayout;
        linearLayout.setOrientation(1);
        this.f33780f.setWeightSum(100.0f);
        frameLayout.addView(this.f33780f, w7.z5.d(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.f33780f.addView(frameLayout2, w7.z5.l(50.0f, -1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout2.addView(imageView, w7.z5.d(-1.0f, -1));
        l0 l0Var = new l0(this, context, 8);
        this.d = l0Var;
        l0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
        this.f33780f.addView(this.d, w7.z5.l(50.0f, -1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.e.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.d.addView(this.e, w7.z5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f33778b = textView;
        int i10 = org.telegram.ui.ActionBar.g6.B6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        this.f33778b.setGravity(17);
        this.f33778b.setTypeface(Typeface.MONOSPACE);
        this.f33778b.setTextSize(1, 16.0f);
        this.e.addView(this.f33778b, w7.z5.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f33777a = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        this.f33777a.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.J6, false));
        this.f33777a.setTextSize(1, 16.0f);
        this.f33777a.setLinksClickable(true);
        this.f33777a.setClickable(true);
        this.f33777a.setGravity(17);
        this.f33777a.setMovementMethod(new org.telegram.ui.Components.cw(1));
        this.e.addView(this.f33777a, w7.z5.e(-2, -2, 1));
        TextView textView3 = new TextView(context);
        this.f33779c = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        this.f33779c.setGravity(17);
        this.f33779c.setTextSize(1, 32.0f);
        this.d.addView(this.f33779c, w7.z5.d(-2.0f, -2));
        TLRPC.EncryptedChat encryptedChat = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(this.h));
        if (encryptedChat != null) {
            org.telegram.ui.Components.a50 a50Var = new org.telegram.ui.Components.a50();
            imageView.setImageDrawable(a50Var);
            byte[] bArr = encryptedChat.key_hash;
            a50Var.f23127a = bArr;
            if (bArr == null) {
                byte[] calcAuthKeyHash = AndroidUtilities.calcAuthKeyHash(encryptedChat.auth_key);
                a50Var.f23127a = calcAuthKeyHash;
                encryptedChat.key_hash = calcAuthKeyHash;
            }
            a50Var.invalidateSelf();
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
                this.f33782r = sb2.toString();
            } else {
                c10 = 1;
            }
            this.f33778b.setText(spannableStringBuilder.toString());
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
            this.f33777a.setText(spannableStringBuilder);
        }
        AnimatorSet animatorSet = this.f33781n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f33781n = null;
        }
        this.f33779c.setAlpha(0.0f);
        this.f33778b.setAlpha(1.0f);
        this.f33779c.setScaleX(0.0f);
        this.f33779c.setScaleY(0.0f);
        this.f33778b.setScaleX(1.0f);
        this.f33778b.setScaleY(1.0f);
        this.f33779c.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.Me));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        if (i10 == NotificationCenter.emojiLoaded && (textView = this.f33779c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19601d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19543a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19880s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        TextView textView = this.f33777a;
        int i10 = org.telegram.ui.ActionBar.g6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f33778b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f33777a, 2, null, null, null, null, org.telegram.ui.ActionBar.g6.J6));
        return arrayList;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new ii(this, 2));
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
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new ii(this, 2));
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        String str;
        if (z10 && !z11 && (str = this.f33782r) != null) {
            TextView textView = this.f33779c;
            textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
        }
    }
}
