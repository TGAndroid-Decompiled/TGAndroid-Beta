package org.telegram.ui.Components;

import android.text.SpannableString;
import java.lang.reflect.Field;
import org.telegram.messenger.FileLog;

public class SpannableStringLight extends SpannableString {
    private static boolean fieldsAvailable;
    private static Field mSpanCountField;
    private static Field mSpanDataField;
    private static Field mSpansField;
    private int mSpanCountOverride;
    private int[] mSpanDataOverride;
    private Object[] mSpansOverride;
    private int num;

    public SpannableStringLight(CharSequence charSequence) {
        super(charSequence);
        try {
            this.mSpansOverride = (Object[]) mSpansField.get(this);
            this.mSpanDataOverride = (int[]) mSpanDataField.get(this);
            this.mSpanCountOverride = ((Integer) mSpanCountField.get(this)).intValue();
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static boolean isFieldsAvailable() {
        if (!fieldsAvailable && mSpansField == null) {
            try {
                Field declaredField = SpannableString.class.getSuperclass().getDeclaredField("mSpans");
                mSpansField = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = SpannableString.class.getSuperclass().getDeclaredField("mSpanData");
                mSpanDataField = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = SpannableString.class.getSuperclass().getDeclaredField("mSpanCount");
                mSpanCountField = declaredField3;
                declaredField3.setAccessible(true);
            } catch (Throwable th) {
                FileLog.e(th);
            }
            fieldsAvailable = true;
        }
        return mSpansField != null;
    }

    @Override
    public void removeSpan(Object obj) {
        super.removeSpan(obj);
    }

    public void setSpanLight(Object obj, int i, int i2, int i3) {
        Object[] objArr = this.mSpansOverride;
        int i4 = this.num;
        objArr[i4] = obj;
        int[] iArr = this.mSpanDataOverride;
        int i5 = i4 * 3;
        iArr[i5] = i;
        iArr[i5 + 1] = i2;
        iArr[i5 + 2] = i3;
        this.num = i4 + 1;
    }

    public void setSpansCount(int i) {
        int i2 = this.mSpanCountOverride;
        int i3 = i + i2;
        Object[] objArr = new Object[i3];
        this.mSpansOverride = objArr;
        this.mSpanDataOverride = new int[i3 * 3];
        this.num = i2;
        this.mSpanCountOverride = i3;
        try {
            mSpansField.set(this, objArr);
            mSpanDataField.set(this, this.mSpanDataOverride);
            mSpanCountField.set(this, Integer.valueOf(this.mSpanCountOverride));
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }
}
