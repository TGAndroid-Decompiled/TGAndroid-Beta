package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.IdenticonDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.URLSpanReplacement;

public final class IdenticonActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public int chat_id;
    public TextView codeTextView;
    public LoginActivity.AnonymousClass4 container;
    public String emojiText;
    public TextView emojiTextView;
    public LinearLayout linearLayout;
    public LinearLayout linearLayout1;
    public TextView textView;

    public final class LinkMovementMethodMy extends LinkMovementMethod {
        public final int $r8$classId;

        public LinkMovementMethodMy(int i) {
            this.$r8$classId = i;
        }

        @Override
        public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 0:
                    try {
                        return super.onTouchEvent(textView, spannable, motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                        return false;
                    }
                case 1:
                    try {
                        boolean zOnTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
                        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                            return zOnTouchEvent;
                        }
                        Selection.removeSelection(spannable);
                        return zOnTouchEvent;
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        return false;
                    }
                default:
                    try {
                        boolean zOnTouchEvent2 = super.onTouchEvent(textView, spannable, motionEvent);
                        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                            return zOnTouchEvent2;
                        }
                        Selection.removeSelection(spannable);
                        return zOnTouchEvent2;
                    } catch (Exception e3) {
                        FileLog.e(e3);
                        return false;
                    }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EncryptionKey));
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 25));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        this.fragmentView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.linearLayout.setWeightSum(100.0f);
        frameLayout.addView(this.linearLayout, LayoutHelper.createFrame(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.linearLayout.addView(frameLayout2, LayoutHelper.createLinear(50.0f, -1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout2.addView(imageView, LayoutHelper.createFrame(-1.0f, -1));
        LoginActivity.AnonymousClass4 anonymousClass4 = new LoginActivity.AnonymousClass4(this, context, 6);
        this.container = anonymousClass4;
        anonymousClass4.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        this.linearLayout.addView(this.container, LayoutHelper.createLinear(50.0f, -1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.linearLayout1 = linearLayout2;
        linearLayout2.setOrientation(1);
        this.linearLayout1.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.container.addView(this.linearLayout1, LayoutHelper.createFrame(-2, -2, 17));
        TextView textView = new TextView(context);
        this.codeTextView = textView;
        int i = Theme.key_windowBackgroundWhiteGrayText4;
        textView.setTextColor(Theme.getColor(null, i, false));
        this.codeTextView.setGravity(17);
        this.codeTextView.setTypeface(Typeface.MONOSPACE);
        this.codeTextView.setTextSize(1, 16.0f);
        this.linearLayout1.addView(this.codeTextView, LayoutHelper.createLinear(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.textView = textView2;
        textView2.setTextColor(Theme.getColor(null, i, false));
        this.textView.setLinkTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
        this.textView.setTextSize(1, 16.0f);
        this.textView.setLinksClickable(true);
        this.textView.setClickable(true);
        this.textView.setGravity(17);
        this.textView.setMovementMethod(new LinkMovementMethodMy(0));
        this.linearLayout1.addView(this.textView, LayoutHelper.createFrame(-2, -2, 1));
        TextView textView3 = new TextView(context);
        this.emojiTextView = textView3;
        textView3.setTextColor(Theme.getColor(null, i, false));
        this.emojiTextView.setGravity(17);
        this.emojiTextView.setTextSize(1, 32.0f);
        this.container.addView(this.emojiTextView, LayoutHelper.createFrame(-2.0f, -2));
        TLRPC.EncryptedChat encryptedChat = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(this.chat_id));
        if (encryptedChat != null) {
            IdenticonDrawable identiconDrawable = new IdenticonDrawable();
            imageView.setImageDrawable(identiconDrawable);
            byte[] bArr = encryptedChat.key_hash;
            identiconDrawable.data = bArr;
            if (bArr == null) {
                byte[] bArrCalcAuthKeyHash = AndroidUtilities.calcAuthKeyHash(encryptedChat.auth_key);
                identiconDrawable.data = bArrCalcAuthKeyHash;
                encryptedChat.key_hash = bArrCalcAuthKeyHash;
            }
            identiconDrawable.invalidateSelf();
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(encryptedChat.user_id));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder sb = new StringBuilder();
            byte[] bArr2 = encryptedChat.key_hash;
            if (bArr2.length > 16) {
                String strBytesToHex = Utilities.bytesToHex(bArr2);
                for (int i2 = 0; i2 < 32; i2++) {
                    if (i2 != 0) {
                        if (i2 % 8 == 0) {
                            spannableStringBuilder.append('\n');
                        } else if (i2 % 4 == 0) {
                            spannableStringBuilder.append(' ');
                        }
                    }
                    int i3 = i2 * 2;
                    spannableStringBuilder.append((CharSequence) strBytesToHex.substring(i3, i3 + 2));
                    spannableStringBuilder.append(' ');
                }
                spannableStringBuilder.append((CharSequence) "\n");
                for (int i4 = 0; i4 < 5; i4++) {
                    byte[] bArr3 = encryptedChat.key_hash;
                    int i5 = i4 * 4;
                    int i6 = (bArr3[i5 + 19] & 255) | ((bArr3[i5 + 16] & 127) << 24) | ((bArr3[i5 + 17] & 255) << 16) | ((bArr3[i5 + 18] & 255) << 8);
                    if (i4 != 0) {
                        sb.append(" ");
                    }
                    String[] strArr = EmojiData.emojiSecret;
                    sb.append(strArr[i6 % strArr.length]);
                }
                this.emojiText = sb.toString();
            }
            this.codeTextView.setText(spannableStringBuilder.toString());
            spannableStringBuilder.clear();
            int i7 = R.string.EncryptionKeyDescription;
            String str = user.first_name;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("EncryptionKeyDescription", i7, str, str)));
            int iIndexOf = spannableStringBuilder.toString().indexOf("telegram.org");
            if (iIndexOf != -1) {
                spannableStringBuilder.setSpan(new URLSpanReplacement(LocaleController.getString(R.string.EncryptionKeyLink), null), iIndexOf, iIndexOf + 12, 33);
            }
            this.textView.setText(spannableStringBuilder);
        }
        this.emojiTextView.setAlpha(0.0f);
        this.codeTextView.setAlpha(1.0f);
        this.emojiTextView.setScaleX(0.0f);
        this.emojiTextView.setScaleY(0.0f);
        this.codeTextView.setScaleX(1.0f);
        this.codeTextView.setScaleY(1.0f);
        this.emojiTextView.setTag(Integer.valueOf(Theme.key_chat_emojiPanelIcon));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TextView textView;
        if (i != NotificationCenter.emojiLoaded || (textView = this.emojiTextView) == null) {
            return;
        }
        textView.invalidate();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.container, 1, null, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        TextView textView = this.textView;
        int i = Theme.key_windowBackgroundWhiteGrayText4;
        arrayList.add(new ThemeDescription(textView, 4, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.codeTextView, 4, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.textView, 2, null, null, null, null, Theme.key_windowBackgroundWhiteLinkText));
        return arrayList;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new PhotoViewer.AnonymousClass9(this, 8));
    }

    @Override
    public final boolean onFragmentCreate() {
        this.chat_id = getArguments().getInt("chat_id");
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
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new PhotoViewer.AnonymousClass9(this, 8));
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        String str;
        if (!z || z2 || (str = this.emojiText) == null) {
            return;
        }
        TextView textView = this.emojiTextView;
        textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
    }
}
