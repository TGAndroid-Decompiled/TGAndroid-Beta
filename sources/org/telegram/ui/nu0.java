package org.telegram.ui;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Consumer;
public final class nu0 implements Consumer {
    public final ProfileActivity f50322a;

    public nu0(ProfileActivity profileActivity) {
        this.f50322a = profileActivity;
    }

    @Override
    public final void accept(Object obj) {
        ProfileActivity profileActivity = this.f50322a;
        HashSet hashSet = profileActivity.f43650n5;
        ArrayList arrayList = new ArrayList((HashSet) obj);
        int i7 = 0;
        while (i7 < arrayList.size()) {
            if (profileActivity.getMessagesController().f25968t7.f(profileActivity.f43593f1, ((Integer) arrayList.get(i7)).intValue()) == null) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        hashSet.clear();
        hashSet.addAll(arrayList);
        profileActivity.J5(true);
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
