package org.telegram.ui.Stories.recorder;

import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC$InputUser;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
public class StoryPrivacySelector extends View {
    private final Paint backgroundPaint;
    private final RectF clickRect;
    private final int currentAccount;
    private Runnable longPressRunnable;
    private final RectF rect;
    private final Theme.ResourcesProvider resourcesProvider;
    private Drawable rippleDrawable;
    private int storyPeriod;
    private long tapTime;
    private final AnimatedTextView.AnimatedTextDrawable textDrawable;
    private StoryPrivacyBottomSheet.StoryPrivacy value;

    protected void onPopupClose() {
    }

    protected void onPopupOpen(Runnable runnable) {
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float currentWidth = this.textDrawable.getCurrentWidth() + AndroidUtilities.dp(26.0f);
        this.rect.set((getWidth() - currentWidth) / 2.0f, AndroidUtilities.dp(13.0f), (getWidth() + currentWidth) / 2.0f, AndroidUtilities.dp(43.0f));
        this.clickRect.set(this.rect);
        this.clickRect.inset(-AndroidUtilities.dp(28.0f), -AndroidUtilities.dp(14.0f));
        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.backgroundPaint);
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            RectF rectF = this.rect;
            drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.rippleDrawable.draw(canvas);
        }
        this.textDrawable.setBounds(0, -AndroidUtilities.dp(1.0f), getWidth(), getHeight() - AndroidUtilities.dp(1.0f));
        this.textDrawable.draw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.clickRect.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            Runnable runnable = this.longPressRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.longPressRunnable = null;
            }
            if (contains) {
                Drawable createRadSelectorDrawable = Theme.createRadSelectorDrawable(234881023, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f));
                this.rippleDrawable = createRadSelectorDrawable;
                RectF rectF = this.rect;
                createRadSelectorDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.rippleDrawable.setState(new int[]{16842919, 16842910});
                if (Build.VERSION.SDK_INT >= 21) {
                    this.rippleDrawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                }
                this.rippleDrawable.setCallback(this);
                this.tapTime = System.currentTimeMillis();
                Runnable runnable2 = new Runnable() {
                    @Override
                    public final void run() {
                        StoryPrivacySelector.this.lambda$onTouchEvent$0();
                    }
                };
                this.longPressRunnable = runnable2;
                AndroidUtilities.runOnUIThread(runnable2, ViewConfiguration.getLongPressTimeout());
                invalidate();
                return true;
            }
            this.tapTime = -1L;
        } else if (motionEvent.getAction() == 1) {
            Runnable runnable3 = this.longPressRunnable;
            if (runnable3 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                this.longPressRunnable = null;
            }
            if (contains && this.rippleDrawable != null && System.currentTimeMillis() - this.tapTime <= ViewConfiguration.getTapTimeout()) {
                open();
            }
            Drawable drawable = this.rippleDrawable;
            if (drawable != null) {
                drawable.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            Runnable runnable4 = this.longPressRunnable;
            if (runnable4 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable4);
                this.longPressRunnable = null;
            }
            Drawable drawable2 = this.rippleDrawable;
            if (drawable2 != null) {
                drawable2.setState(new int[0]);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void lambda$onTouchEvent$0() {
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            drawable.setState(new int[0]);
        }
        this.tapTime = -1L;
        open();
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
    }

    public void open() {
        onPopupOpen(new Runnable() {
            @Override
            public final void run() {
                StoryPrivacySelector.this.lambda$open$3();
            }
        });
    }

    public void lambda$open$3() {
        StoryPrivacyBottomSheet storyPrivacyBottomSheet = new StoryPrivacyBottomSheet(getContext(), this.storyPeriod, this.resourcesProvider);
        storyPrivacyBottomSheet.setValue(getStoryPrivacy());
        storyPrivacyBottomSheet.isEdit(false);
        storyPrivacyBottomSheet.whenSelectedRules(new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                StoryPrivacySelector.this.lambda$open$1((StoryPrivacyBottomSheet.StoryPrivacy) obj, (Boolean) obj2, (Boolean) obj3, (Runnable) obj4);
            }
        }, true);
        storyPrivacyBottomSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                StoryPrivacySelector.this.lambda$open$2(dialogInterface);
            }
        });
        storyPrivacyBottomSheet.show();
    }

    public void lambda$open$1(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, Boolean bool, Boolean bool2, Runnable runnable) {
        this.value = storyPrivacy;
        String storyPrivacy2 = storyPrivacy.toString();
        this.textDrawable.setText(storyPrivacy2);
        setContentDescription(storyPrivacy2);
        save(this.currentAccount, this.value);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$open$2(DialogInterface dialogInterface) {
        onPopupClose();
    }

    public void setStoryPeriod(int i) {
        this.storyPeriod = i;
    }

    public StoryPrivacyBottomSheet.StoryPrivacy getStoryPrivacy() {
        return this.value;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.textDrawable || drawable == this.rippleDrawable || super.verifyDrawable(drawable);
    }

    private static StoryPrivacyBottomSheet.StoryPrivacy read(AbstractSerializedData abstractSerializedData) {
        int readInt32 = abstractSerializedData.readInt32(true);
        if (abstractSerializedData.readInt32(true) != 481674261) {
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy");
        }
        int readInt322 = abstractSerializedData.readInt32(true);
        ArrayList arrayList = new ArrayList(readInt322);
        for (int i = 0; i < readInt322; i++) {
            arrayList.add(TLRPC$InputUser.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(true), true));
        }
        if (abstractSerializedData.readInt32(true) != 481674261) {
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (2)");
        }
        int readInt323 = abstractSerializedData.readInt32(true);
        ArrayList arrayList2 = new ArrayList(readInt323);
        for (int i2 = 0; i2 < readInt323; i2++) {
            arrayList2.add(Long.valueOf(abstractSerializedData.readInt64(true)));
        }
        if (abstractSerializedData.readInt32(true) != 481674261) {
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (3)");
        }
        int readInt324 = abstractSerializedData.readInt32(true);
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < readInt324; i3++) {
            long readInt64 = abstractSerializedData.readInt64(true);
            if (abstractSerializedData.readInt32(true) != 481674261) {
                throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (4)");
            }
            int readInt325 = abstractSerializedData.readInt32(true);
            ArrayList arrayList3 = new ArrayList(readInt325);
            for (int i4 = 0; i4 < readInt325; i4++) {
                arrayList3.add(Long.valueOf(abstractSerializedData.readInt64(true)));
            }
            hashMap.put(Long.valueOf(readInt64), arrayList3);
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList2);
        for (ArrayList arrayList4 : hashMap.values()) {
            hashSet.addAll(arrayList4);
        }
        StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy = new StoryPrivacyBottomSheet.StoryPrivacy(readInt32, arrayList, 0);
        storyPrivacy.selectedUserIds.clear();
        storyPrivacy.selectedUserIds.addAll(arrayList2);
        storyPrivacy.selectedUserIdsByGroup.clear();
        storyPrivacy.selectedUserIdsByGroup.putAll(hashMap);
        return storyPrivacy;
    }

    private static void write(AbstractSerializedData abstractSerializedData, StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy) {
        abstractSerializedData.writeInt32(storyPrivacy.type);
        abstractSerializedData.writeInt32(481674261);
        abstractSerializedData.writeInt32(storyPrivacy.selectedInputUsers.size());
        Iterator<TLRPC$InputUser> it = storyPrivacy.selectedInputUsers.iterator();
        while (it.hasNext()) {
            it.next().serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        abstractSerializedData.writeInt32(storyPrivacy.selectedUserIds.size());
        Iterator<Long> it2 = storyPrivacy.selectedUserIds.iterator();
        while (it2.hasNext()) {
            abstractSerializedData.writeInt64(it2.next().longValue());
        }
        abstractSerializedData.writeInt32(481674261);
        abstractSerializedData.writeInt32(storyPrivacy.selectedUserIdsByGroup.size());
        for (Map.Entry<Long, ArrayList<Long>> entry : storyPrivacy.selectedUserIdsByGroup.entrySet()) {
            abstractSerializedData.writeInt64(entry.getKey().longValue());
            abstractSerializedData.writeInt32(481674261);
            abstractSerializedData.writeInt32(entry.getValue().size());
            Iterator<Long> it3 = entry.getValue().iterator();
            while (it3.hasNext()) {
                abstractSerializedData.writeInt64(it3.next().longValue());
            }
        }
    }

    public static void save(int i, StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy) {
        if (storyPrivacy == null) {
            MessagesController.getInstance(i).getMainSettings().edit().remove("story_privacy2").apply();
            return;
        }
        SerializedData serializedData = new SerializedData(true);
        write(serializedData, storyPrivacy);
        SerializedData serializedData2 = new SerializedData(serializedData.length());
        serializedData.cleanup();
        write(serializedData2, storyPrivacy);
        MessagesController.getInstance(i).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
        serializedData2.cleanup();
    }

    private static StoryPrivacyBottomSheet.StoryPrivacy getSaved(final int i) {
        try {
            String string = MessagesController.getInstance(i).getMainSettings().getString("story_privacy2", null);
            if (string == null) {
                return new StoryPrivacyBottomSheet.StoryPrivacy();
            }
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            StoryPrivacyBottomSheet.StoryPrivacy read = read(serializedData);
            serializedData.cleanup();
            if (read.isNone()) {
                return new StoryPrivacyBottomSheet.StoryPrivacy();
            }
            final HashSet hashSet = new HashSet();
            hashSet.addAll(read.selectedUserIds);
            for (ArrayList<Long> arrayList : read.selectedUserIdsByGroup.values()) {
                hashSet.addAll(arrayList);
            }
            if (!hashSet.isEmpty()) {
                final MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
                messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        StoryPrivacySelector.lambda$getSaved$5(MessagesStorage.this, hashSet, i);
                    }
                });
            }
            return read;
        } catch (Exception e) {
            FileLog.e(e);
            return new StoryPrivacyBottomSheet.StoryPrivacy();
        }
    }

    public static void lambda$getSaved$5(MessagesStorage messagesStorage, HashSet hashSet, final int i) {
        final ArrayList<TLRPC$User> users = messagesStorage.getUsers(new ArrayList<>(hashSet));
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoryPrivacySelector.lambda$getSaved$4(i, users);
            }
        });
    }

    public static void lambda$getSaved$4(int i, ArrayList arrayList) {
        MessagesController.getInstance(i).putUsers(arrayList, true);
    }

    public static void applySaved(int i, StoryEntry storyEntry) {
        storyEntry.privacy = getSaved(i);
        storyEntry.privacyRules.clear();
        storyEntry.privacyRules.addAll(storyEntry.privacy.rules);
        if (UserConfig.getInstance(i).isPremium()) {
            storyEntry.period = MessagesController.getInstance(i).getMainSettings().getInt("story_period", 86400);
        } else {
            storyEntry.period = 86400;
        }
    }
}
