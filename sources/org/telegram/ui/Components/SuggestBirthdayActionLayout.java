package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.LaunchActivity;

public class SuggestBirthdayActionLayout {
    private TL_account.TL_birthday birthday;
    private final ButtonBounce bounce;
    private Text button;
    private final int currentAccount;
    private boolean hasButton;
    private final Theme.ResourcesProvider resourcesProvider;
    private final RLottieDrawable sticker;
    private Text text;
    private Text[] titles;
    private Text[] values;
    private final View view;
    private final RectF buttonRect = new RectF();
    private final Paint buttonPaint = new Paint(1);

    public SuggestBirthdayActionLayout(int i, ChatActionCell chatActionCell, Theme.ResourcesProvider resourcesProvider) {
        this.currentAccount = i;
        this.view = chatActionCell;
        this.resourcesProvider = resourcesProvider;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.cake, "cake", AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.sticker = rLottieDrawable;
        rLottieDrawable.restart();
        this.bounce = new ButtonBounce(chatActionCell);
    }

    public void set(MessageObject messageObject) {
        TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) messageObject.messageOwner.action;
        this.birthday = tL_messageActionSuggestBirthday.birthday;
        this.text = new Text(TextUtils.concat(messageObject.messageText, ":"), 13.0f).multiline(6).align(Layout.Alignment.ALIGN_CENTER).setMaxWidth(width() - AndroidUtilities.dp(32.0f));
        int i = (tL_messageActionSuggestBirthday.birthday.flags & 1) != 0 ? 3 : 2;
        Text[] textArr = new Text[i];
        this.titles = textArr;
        this.values = new Text[i];
        textArr[0] = new Text(LocaleController.getString(R.string.DateDay), 11.0f);
        this.values[0] = new Text("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, AndroidUtilities.bold());
        this.titles[1] = new Text(LocaleController.getString(R.string.DateMonth), 11.0f);
        this.values[1] = new Text("" + getMonthName(tL_messageActionSuggestBirthday.birthday.month - 1), 11.0f, AndroidUtilities.bold());
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            this.titles[2] = new Text(LocaleController.getString(R.string.DateYear), 11.0f);
            this.values[2] = new Text("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, AndroidUtilities.bold());
        }
        this.hasButton = !messageObject.isOutOwner();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        this.buttonPaint.setColor(Theme.multAlpha(resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark() ? -1 : -16777216, 0.12f));
        this.button = new Text(LocaleController.getString(R.string.SuggestedDateOfBirthView), 14.0f, AndroidUtilities.bold());
    }

    private final String getMonthName(int i) {
        int[] iArr = {R.string.January, R.string.February, R.string.March, R.string.April, R.string.May, R.string.June, R.string.July, R.string.August, R.string.September, R.string.October, R.string.November, R.string.December};
        if (i < 0 || i >= 12) {
            return "" + i;
        }
        return LocaleController.getString(iArr[i]);
    }

    public void draw(Canvas canvas) {
        int iDp = AndroidUtilities.dp(66.0f);
        int width = (this.view.getWidth() - iDp) / 2;
        this.sticker.setBounds(width, AndroidUtilities.dp(13.0f), width + iDp, AndroidUtilities.dp(13.0f) + iDp);
        this.sticker.draw(canvas);
        this.text.draw(canvas, (this.view.getWidth() - this.text.getWidth()) / 2.0f, AndroidUtilities.dp(19.0f) + iDp, -1, 1.0f);
        int iDp2 = (int) (AndroidUtilities.dp(19.0f) + iDp + this.text.getHeight() + AndroidUtilities.dp(17.0f));
        int iDp3 = 0;
        for (int i = 0; i < this.titles.length; i++) {
            iDp3 = (int) (iDp3 + AndroidUtilities.dp(9.0f) + Math.max(this.titles[i].getWidth(), this.values[i].getWidth()) + AndroidUtilities.dp(9.0f));
        }
        int width2 = (this.view.getWidth() - iDp3) / 2;
        int i2 = 0;
        while (i2 < this.titles.length) {
            float fDp = AndroidUtilities.dp(9.0f) + Math.max(this.titles[i2].getWidth(), this.values[i2].getWidth()) + AndroidUtilities.dp(9.0f);
            float f = width2;
            float f2 = f + (fDp / 2.0f);
            int i3 = (int) (f + fDp);
            Text text = this.titles[i2];
            text.draw(canvas, f2 - (text.getWidth() / 2.0f), iDp2, -1, 0.75f);
            Text text2 = this.values[i2];
            text2.draw(canvas, f2 - (text2.getWidth() / 2.0f), AndroidUtilities.dp(16.0f) + iDp2, -1, 1.0f);
            i2++;
            width2 = i3;
        }
        if (this.hasButton) {
            int iDp4 = iDp2 + AndroidUtilities.dp(38.0f);
            canvas.save();
            float width3 = this.button.getWidth() + AndroidUtilities.dp(26.0f);
            float fDp2 = AndroidUtilities.dp(30.0f);
            float f3 = iDp4;
            this.buttonRect.set((this.view.getWidth() - width3) / 2.0f, f3, (this.view.getWidth() + width3) / 2.0f, f3 + fDp2);
            float scale = this.bounce.getScale(0.1f);
            canvas.scale(scale, scale, this.buttonRect.centerX(), this.buttonRect.centerY());
            float f4 = fDp2 / 2.0f;
            canvas.drawRoundRect(this.buttonRect, f4, f4, this.buttonPaint);
            this.button.draw(canvas, this.buttonRect.left + AndroidUtilities.dp(13.0f), this.buttonRect.centerY(), -1, 1.0f);
            canvas.restore();
        }
    }

    public int width() {
        return AndroidUtilities.dp(174.0f);
    }

    public int height() {
        return AndroidUtilities.dp(140.0f) + ((int) this.text.getHeight()) + (this.hasButton ? AndroidUtilities.dp(40.0f) : 0);
    }

    public void attach() {
        this.sticker.setMasterParent(this.view);
    }

    public void detach() {
        this.sticker.setMasterParent(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zContains = this.buttonRect.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            this.bounce.setPressed(zContains);
        } else if (motionEvent.getAction() != 2) {
            if (motionEvent.getAction() == 1) {
                if (this.bounce.isPressed()) {
                    open();
                }
                this.bounce.setPressed(false);
            } else if (motionEvent.getAction() == 3) {
                this.bounce.setPressed(false);
            }
        }
        return this.bounce.isPressed();
    }

    public void open() {
        AlertsCreator.createBirthdayPickerDialog(this.view.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.birthday, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                SuggestBirthdayActionLayout.m2859$r8$lambda$VFGVibElkC_BVbKBCMewXhqjLQ(this.f$0, (TL_account.TL_birthday) obj);
            }
        }, null, true, false, this.resourcesProvider).show();
    }

    public static void m2859$r8$lambda$VFGVibElkC_BVbKBCMewXhqjLQ(final SuggestBirthdayActionLayout suggestBirthdayActionLayout, TL_account.TL_birthday tL_birthday) {
        suggestBirthdayActionLayout.getClass();
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        final TLRPC.UserFull userFull = MessagesController.getInstance(suggestBirthdayActionLayout.currentAccount).getUserFull(UserConfig.getInstance(suggestBirthdayActionLayout.currentAccount).getClientUserId());
        final TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
            MessagesStorage.getInstance(suggestBirthdayActionLayout.currentAccount).updateUserInfo(userFull, false);
        }
        ConnectionsManager.getInstance(suggestBirthdayActionLayout.currentAccount).sendRequest(updatebirthday, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SuggestBirthdayActionLayout.$r8$lambda$D4C9Zgaain_9l75CZRc6O88H_Ok(this.f$0, userFull, tL_birthday2, tLObject, tL_error);
            }
        }, 1024);
        MessagesController.getInstance(suggestBirthdayActionLayout.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(suggestBirthdayActionLayout.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(suggestBirthdayActionLayout.currentAccount).postNotificationName(NotificationCenter.newSuggestionsAvailable, new Object[0]);
    }

    public static void $r8$lambda$D4C9Zgaain_9l75CZRc6O88H_Ok(final SuggestBirthdayActionLayout suggestBirthdayActionLayout, final TLRPC.UserFull userFull, final TL_account.TL_birthday tL_birthday, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        suggestBirthdayActionLayout.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SuggestBirthdayActionLayout.$r8$lambda$hcMtcMpKQmkY2YkY_TRkLXQVMHE(this.f$0, tLObject, userFull, tL_birthday, tL_error);
            }
        });
    }

    public static void $r8$lambda$hcMtcMpKQmkY2YkY_TRkLXQVMHE(SuggestBirthdayActionLayout suggestBirthdayActionLayout, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        suggestBirthdayActionLayout.getClass();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.gift, LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo)).setDuration(5000).show();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            MessagesStorage.getInstance(suggestBirthdayActionLayout.currentAccount).updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            new AlertDialog.Builder(suggestBirthdayActionLayout.view.getContext()).setTitle(LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle)).setMessage(LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
        } else {
            BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UnknownError)).show();
        }
    }
}
