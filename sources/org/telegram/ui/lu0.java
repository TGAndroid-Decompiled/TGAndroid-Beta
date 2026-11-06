package org.telegram.ui;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Consumer;
public final class lu0 implements Consumer {
    public final ProfileActivity f47565a;

    public lu0(ProfileActivity profileActivity) {
        this.f47565a = profileActivity;
    }

    @Override
    public final void accept(Object obj) {
        ProfileActivity profileActivity = this.f47565a;
        HashSet hashSet = profileActivity.f41721h5;
        ArrayList arrayList = new ArrayList((HashSet) obj);
        int i7 = 0;
        while (i7 < arrayList.size()) {
            if (profileActivity.getMessagesController().f24862q7.f(profileActivity.f41695e1, ((Integer) arrayList.get(i7)).intValue()) == null) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        hashSet.clear();
        hashSet.addAll(arrayList);
        profileActivity.F5(true);
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
